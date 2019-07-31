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

	@RequestMapping(value = "/index3")
	public String chercher(Model model, @RequestParam(name = "page", defaultValue = "0") int p,
			@RequestParam(name = "size", defaultValue = "5") int s,
			@RequestParam(name = "mc", defaultValue = "") String mc) {
		Page<Vehicule> pagevehicule = null;
		if (mc == null)
			pagevehicule = vehiculeService.findAllPageVehicule(p, s);
		else
			pagevehicule = vehiculeService.chercherVehicule("%" + mc + "%", new PageRequest(p, s));

		model.addAttribute("listVehicules", pagevehicule.getContent());
		int[] pages = new int[pagevehicule.getTotalPages()];
		model.addAttribute("pages", pages);
		model.addAttribute("size", s);
		model.addAttribute("pageCourante", p);
		model.addAttribute("mc", mc);
		return "Vehicules";
	}

	@RequestMapping(value = "/formvehicule", method = RequestMethod.GET)
	public String ajoutvehicule(Model model) {
		model.addAttribute("vehicule", new Vehicule());
		model.addAttribute("service", iservice.findAllService());
		model.addAttribute("categorie", categorieService.findAllCategorie());
		return "Vehicule";
	}

	@RequestMapping(value = "/saveVehicule", method = RequestMethod.POST)
	public String saveVehicule(@ModelAttribute @Valid Vehicule vehicule/* ,BindingResult bindingResult */) {
		/* if(bindingResult.hasErrors()) */
		vehiculeService.AjoutVehicule(vehicule);
		return "redirect:/formvehicule";
	}

}
