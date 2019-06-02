package sn.ucad.master.assurance.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sn.ucad.master.assurance.bo.Vehicule;
import sn.ucad.master.assurance.service.ICategorieService;
import sn.ucad.master.assurance.service.IService;
import sn.ucad.master.assurance.service.IVehiculeService;

@Controller
public class VehiculeController {
	@Autowired
	private IVehiculeService vehiculeService;
	@Autowired
	private IService iservice;
	@Autowired
	private ICategorieService categorieService;
	
	@RequestMapping(value="/formvehicule",method=RequestMethod.GET)
	public String ajoutvehicule(Model model) {
		model.addAttribute("vehicule", new Vehicule());
		model.addAttribute("service", iservice.findAllService());
		model.addAttribute("categorie", categorieService.findAllCategorie());
		//addAttribute("service" iservice.listeService());
		return "Vehicule";
	}
	
	@RequestMapping(value="/saveVehicule", method = RequestMethod.POST)
	public String saveVehicule(@ModelAttribute  @Valid Vehicule vehicule/*,BindingResult bindingResult*/) {
		/*if(bindingResult.hasErrors())*/
			/*return "Souscripteur";*/
		   vehiculeService.AjoutVehicule(vehicule);
			return "redirect:/formvehicule";
		/*return "Confirmation";*/
	}
	

}
