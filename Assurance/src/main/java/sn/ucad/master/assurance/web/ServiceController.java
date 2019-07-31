package sn.ucad.master.assurance.web;

import org.springframework.stereotype.Controller;

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
