package sn.ucad.master.assurance.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sn.ucad.master.assurance.bo.Pret;
import sn.ucad.master.assurance.service.IPretService;
import sn.ucad.master.assurance.service.IService;

@Controller
public class PretController {
	@Autowired
	private IPretService pretService;
	@Autowired
	private IService iservice;
	
	@RequestMapping(value="/formpret",method=RequestMethod.GET)
	public String ajoutPrets(Model model) {
		model.addAttribute("pret", new Pret());
		model.addAttribute("service", iservice.findAllService());
		//addAttribute("service" iservice.listeService());
		return "Pret";
	}
	
	@RequestMapping(value="/savepret", method = RequestMethod.POST)
	public String savespret(@ModelAttribute  @Valid Pret pret/*,BindingResult bindingResult*/) {
		/*if(bindingResult.hasErrors())*/
			/*return "Souscripteur";*/
		   pretService.ajoutPret(pret);
			return "redirect:/formpret";
		/*return "Confirmation";*/
	}

}
