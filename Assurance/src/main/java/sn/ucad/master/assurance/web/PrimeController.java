package sn.ucad.master.assurance.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sn.ucad.master.assurance.bo.Prime;
import sn.ucad.master.assurance.service.IContratService;
import sn.ucad.master.assurance.service.IPrimeService;

@Controller
public class PrimeController {
	@Autowired
	private IPrimeService primeService;
	@Autowired
	private IContratService contratService;
	@RequestMapping(value="/formPrime",method=RequestMethod.GET)
	public String ajoutPrimes(Model model) {
		model.addAttribute("prime", new Prime());
		model.addAttribute("contrat", contratService.findAllContrat());
		return "Prime";
	}
	@RequestMapping(value="/savePrime", method = RequestMethod.POST)
	public String saveContrat(@ModelAttribute  @Valid Prime prime/*,BindingResult bindingResult*/) {
		/*if(bindingResult.hasErrors())*/
			/*return "Souscripteur";*/
		   primeService.ajoutPrime(prime);
			return "redirect:/formPrime";
		/*return "Confirmation";*/
	}
}
