package sn.ucad.master.assurance.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sn.ucad.master.assurance.bo.Apporteur;
import sn.ucad.master.assurance.service.IApporteurService;
@Controller
public class ApporteurController {
	@Autowired
	private IApporteurService apporteurService;
	@RequestMapping(value="/formApporteurs",method=RequestMethod.GET)
	public String ajoutApporteur(Model model) {
		model.addAttribute("apporteur", new Apporteur());
		return "formApporteur";
	}
	
	@RequestMapping(value="/saveApporteur", method = RequestMethod.POST)
	public String save(@ModelAttribute  @Valid Apporteur apporteur/*,BindingResult bindingResult*/) {
		/*if(bindingResult.hasErrors())*/
			/*return "Assure";*/
		apporteurService.ajouterApportateur(apporteur);
		//addEmployee(employee);
		//return "Assure";
		return "redirect:/formApporteurs";
	}

}
