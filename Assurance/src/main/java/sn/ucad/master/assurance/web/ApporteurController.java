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
import sn.ucad.master.assurance.service.IApporteurService;
@Controller
public class ApporteurController {
	@Autowired
	private IApporteurService apporteurService;
	@RequestMapping(value = "/index2")
	/*@GetMapping("/index")*/
	public String cherchers(Model model, @RequestParam(name = "page", defaultValue = "0") int p,
			@RequestParam(name = "size", defaultValue = "5") int s,
			@RequestParam(name = "mc", defaultValue = "") String  mc) {
		Page<Apporteur> pageapporteur =null;
		if(mc==null)
			pageapporteur=apporteurService.findAllPageApporteur(p, s);
		else
			pageapporteur = apporteurService.chercherApporteur("%"+mc+"%",new PageRequest(p,s));
		 
		model.addAttribute("listApporteurs", pageapporteur.getContent());
		int[] pages = new int[pageapporteur.getTotalPages()];
		model.addAttribute("pages", pages);
		model.addAttribute("size", s);
		model.addAttribute("pageCourante", p);
		model.addAttribute("mc", mc);
		return "Apporteurs";
	}
	
	@RequestMapping(value="/formApporteurs",method=RequestMethod.GET)
	public String ajoutApporteur(Model model) {
		model.addAttribute("apporteur", new Apporteur());
		return "formApporteur";
	}
	
	@RequestMapping(value="/saveApporteur", method = RequestMethod.POST)
	public String save(@ModelAttribute  @Valid Apporteur apporteur/*,BindingResult bindingResult*/) {
		/*if(bindingResult.hasErrors())*/
			/*return "Assure";*/
		apporteurService.ajouterApportateur(apporteur);
		//addEmployee(employee);
		//return "Assure";
		return "redirect:/formApporteurs";
	}

}
