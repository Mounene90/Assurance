package sn.ucad.master.assurance.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;

import sn.ucad.master.assurance.bo.Assure;
import sn.ucad.master.assurance.service.IAssureService;




@Controller
public class AssureController {
	@Autowired
	private IAssureService assureService;
	
	@RequestMapping(value="/form",method=RequestMethod.GET)
	public String ajoutAssure(Model model) {
		model.addAttribute("assure", new Assure());
		return "Assure";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(@ModelAttribute  @Valid Assure assure/*,BindingResult bindingResult*/) {
		/*if(bindingResult.hasErrors())*/
			/*return "Assure";*/
		assureService.Ajouter(assure);
		//addEmployee(employee);
		//return "Assure";
		return "redirect:/form";
	}
	

}
