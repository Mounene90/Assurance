package sn.ucad.master.assurance.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sn.ucad.master.assurance.bo.Detail;
import sn.ucad.master.assurance.bo.Garantie;
import sn.ucad.master.assurance.service.IContratService;
import sn.ucad.master.assurance.service.IDetailService;
import sn.ucad.master.assurance.service.IGarantieService;

@Controller
public class GarantieController {
	
	@Autowired
	private IGarantieService garantieService;
	/*@Autowired
	private IDetailService detailservice;*/
	@Autowired
	private IContratService contratService;
	

	@RequestMapping(value="/formgarantie",method=RequestMethod.GET)
	public String ajoutGarantiee(Model model) {
		model.addAttribute("garantie", new Garantie());
		/*return "Garantie";*/
		model.addAttribute("detail", new Detail());
		model.addAttribute("contrat", contratService.findAllContrat());
		model.addAttribute("garantie", garantieService.findAllGarantie());
		return "DetailGarantie";
	}		
	
	@RequestMapping(value="/savegarantie", method = RequestMethod.POST)
	public String savegar(@ModelAttribute  @Valid Garantie garantie/*,BindingResult bindingResult*/) {
		/*if(bindingResult.hasErrors())*/
			/*return "Souscripteur";*/
		   garantieService.ajoutGrantie(garantie);
			return "redirect:/formgarantie";
		/*return "Confirmation";*/
	}

}
