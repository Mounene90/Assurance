package sn.ucad.master.assurance.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sn.ucad.master.assurance.bo.Habitation;
import sn.ucad.master.assurance.service.IHabitationService;
import sn.ucad.master.assurance.service.IService;

@Controller
public class HabitationController {
	@Autowired
	private IHabitationService habitationService;
	@Autowired
	private IService iservice;
	
	@RequestMapping(value="/formhabitation",method=RequestMethod.GET)
	public String ajoutHabitations(Model model) {
		model.addAttribute("habitation", new Habitation());
		model.addAttribute("service", iservice.findAllService());
		//addAttribute("service" iservice.listeService());
		return "Habitation";
	}
	
	@RequestMapping(value="/savehabitation", method = RequestMethod.POST)
	public String saveshabi(@ModelAttribute  @Valid Habitation habitation/*,BindingResult bindingResult*/) {
		/*if(bindingResult.hasErrors())*/
			/*return "Souscripteur";*/
		   habitationService.ajoutHabitation(habitation);
			return "redirect:/formhabitation";
		/*return "Confirmation";*/
	}

}
