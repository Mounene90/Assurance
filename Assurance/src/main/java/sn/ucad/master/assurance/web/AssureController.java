package sn.ucad.master.assurance.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sn.ucad.master.assurance.bo.Assure;
import sn.ucad.master.assurance.service.IAssureService;

@Controller
public class AssureController {
	@Autowired
	private IAssureService assureService;

	@RequestMapping(value = "/lists")
	/* @GetMapping("/index") */
	public String cherchers(Model model, @RequestParam(name = "page", defaultValue = "0") int p,
			@RequestParam(name = "size", defaultValue = "5") int s,
			@RequestParam(name = "mc", defaultValue = "") Integer mc) {
		Page<Assure> pageassure = null;
		if (mc == null)
			pageassure = assureService.findAllPageAssure(p, s);

		/* navireRepository.chercher("%"+mc+"%",new PageRequest(p, s)); */
		else
			pageassure = assureService.chercherAssure(mc, new PageRequest(p, s));

		model.addAttribute("listAssures", pageassure.getContent());
		/* model.addAttribute("listSouscripteurs", pagesouscripteurs.getContent()); */
		int[] page = new int[pageassure.getTotalPages()];
		model.addAttribute("page", page);
		model.addAttribute("size", s);
		model.addAttribute("pageCourante", p);
		model.addAttribute("mc", mc);
		return "Assures";
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String ajoutAssure(Model model) {
		model.addAttribute("assure", new Assure());
		return "Assure";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute @Valid Assure assure/* ,BindingResult bindingResult */) {
		/* if(bindingResult.hasErrors()) */
		/* return "Assure"; */
		assureService.Ajouter(assure);
		// addEmployee(employee);
		// return "Assure";
		return "redirect:/form";
	}

}
