package sn.ucad.master.assurance.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sn.ucad.master.assurance.bo.Apporteur;
import sn.ucad.master.assurance.bo.TypeAvenant;
import sn.ucad.master.assurance.service.ITypeAvenantService;

@Controller
public class TypeAvenantController {
	@Autowired
	private ITypeAvenantService typeavenantservice;
	
	@RequestMapping(value = "/formtypeavenant", method = RequestMethod.GET)
	public String ajoutTypeAven(Model model) {
		model.addAttribute("typeavenant", new TypeAvenant());
		return "Typeavenant";
	}
	@RequestMapping(value = "/savetypeavenant", method = RequestMethod.POST)
	public String save(@ModelAttribute @Valid TypeAvenant typeavenant/* ,BindingResult bindingResult */) {
		/* if(bindingResult.hasErrors()) */
		typeavenantservice.ajouterTypeAvenant(typeavenant);
		return "redirect:/formtypeavenant";
	}

}
