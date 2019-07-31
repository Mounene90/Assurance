package sn.ucad.master.assurance.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sn.ucad.master.assurance.bo.Categorie;
import sn.ucad.master.assurance.service.ICategorieService;

@Controller
public class CategorieController {
	@Autowired
	private ICategorieService categorieService;

	@RequestMapping(value = "/formcategorie", method = RequestMethod.GET)
	public String ajoutCategoriee(Model model) {
		model.addAttribute("categorie", new Categorie());
		return "Categorie";
	}

	@RequestMapping(value = "/savecategorie", method = RequestMethod.POST)
	public String saveCat(@ModelAttribute @Valid Categorie categorie/* ,BindingResult bindingResult */) {
		/* if(bindingResult.hasErrors()) */
		categorieService.AjoutCategorie(categorie);
		return "redirect:/formcategorie";
		
	}

}
