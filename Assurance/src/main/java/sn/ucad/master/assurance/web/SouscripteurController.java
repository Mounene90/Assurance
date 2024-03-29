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

import sn.ucad.master.assurance.bo.Souscripteur;
import sn.ucad.master.assurance.service.ISouscripteurService;


@Controller
public class SouscripteurController {
	@Autowired
	private ISouscripteurService souscripteurService;
	@RequestMapping(value = "/index")
	public String cherchers(Model model, @RequestParam(name = "page", defaultValue = "0") int p,
			@RequestParam(name = "size", defaultValue = "5") int s,
			@RequestParam(name = "mc", defaultValue = "") Integer mc) {
		Page<Souscripteur> pagesouscripteur =null;
		if(mc==null)
			 pagesouscripteur=souscripteurService.findAllPageSouscripteur(p, s);
		else
			pagesouscripteur = souscripteurService.chercherSouscripteur(mc,new PageRequest(p,s));
		 
		model.addAttribute("listSouscripteurs", pagesouscripteur.getContent());
		int[] pages = new int[pagesouscripteur.getTotalPages()];
		model.addAttribute("pages", pages);
		model.addAttribute("size", s);
		model.addAttribute("pageCourante", p);
		model.addAttribute("mc", mc);
		return "Souscripteurs";
	}

	@RequestMapping(value = "/formsouscripteur", method = RequestMethod.GET)
	public String ajoutSoucripteur(Model model) {
		model.addAttribute("souscripteur", new Souscripteur());
		return "Souscripteur";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(int idSouscripeur, Integer mc, int page, int size) {
		souscripteurService.deleteSouscripteur(idSouscripeur);
		return "redirect:/index?page=" + page + "&size=" + size + "&mc=" + mc;

	}
	
	@RequestMapping(value = "/editupdate", method = RequestMethod.GET)
	public String editupdate(Model model, Integer idSouscripeur) {
		Souscripteur sous = souscripteurService.findSouscripteurById(idSouscripeur);
		model.addAttribute("souscripteur", sous);
		return "EditSouscripteur";
	}

	@RequestMapping(value = "/savesouscripteur", method = RequestMethod.POST)
	public String save(@ModelAttribute @Valid Souscripteur souscripteur/* ,BindingResult bindingResult */) {
		/* if(bindingResult.hasErrors()) */
		souscripteurService.ajouterSouscripeur(souscripteur);
		return "redirect:/formsouscripteur";
	}

}
