package sn.ucad.master.assurance.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import sn.ucad.master.assurance.bo.Service;
import sn.ucad.master.assurance.service.IService;

@Controller
public class ServiceController {
	/*@Autowired
	private IService iservice;
	
	@RequestMapping(value="/formservice",method=RequestMethod.GET)
	public String ajoutServicee(Model model) {
		model.addAttribute("service", new Service());
		return "Service";
	}
	
	@RequestMapping(value="/saveservice", method = RequestMethod.POST)
	public String saveserv(@ModelAttribute  @Valid Service service,BindingResult bindingResult) {
		if(bindingResult.hasErrors())
			return "Souscripteur";
		   iservice.ajoutService(service);
			return "redirect:/formservice";
		return "Confirmation";
	}*/

}
