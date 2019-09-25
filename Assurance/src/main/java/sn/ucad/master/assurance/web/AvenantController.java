package sn.ucad.master.assurance.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sn.ucad.master.assurance.bo.Avenant;
import sn.ucad.master.assurance.service.IAvenantService;
import sn.ucad.master.assurance.service.IContratService;
import sn.ucad.master.assurance.service.ITypeAvenantService;

@Controller
public class AvenantController {
	@Autowired
	private IAvenantService avenantservice;
	@Autowired
	private ITypeAvenantService typeavenantservice;
	@Autowired
	private IContratService contratService;
	@RequestMapping(value = "/formavenant", method = RequestMethod.GET)
	public String ajoutAvenant(Model model) {
		model.addAttribute("avenant", new Avenant());
		model.addAttribute("contrat",contratService.findAllContrat());
		model.addAttribute("typeAvenant", typeavenantservice.findAllTypeAvenant());
		return "avenant";
	}
	@RequestMapping(value = "/saveavenant", method = RequestMethod.POST)
	public String save(@ModelAttribute @Valid Avenant avenant/* ,BindingResult bindingResult */) {
		/* if(bindingResult.hasErrors()) */
		avenantservice.ajouterAvenant(avenant);
		return "redirect:/formavenant";
	}


	

}
