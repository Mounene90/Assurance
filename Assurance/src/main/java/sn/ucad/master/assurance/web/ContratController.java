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

import sn.ucad.master.assurance.bo.Contrat;
import sn.ucad.master.assurance.service.IApporteurService;
import sn.ucad.master.assurance.service.IAssureService;
import sn.ucad.master.assurance.service.IContratService;
import sn.ucad.master.assurance.service.IService;
import sn.ucad.master.assurance.service.ISouscripteurService;

@Controller
public class ContratController {
	@Autowired
	private ISouscripteurService souscripteurService;
	@Autowired
	private IAssureService assureService;
	@Autowired
	private IService iservice;
	@Autowired
	private IContratService contratService;
	@Autowired
	private IApporteurService apporteurService;

	@RequestMapping(value = "/consulterContrat")
	public String index5(Model model, @RequestParam(name = "page", defaultValue = "0") int p,
			@RequestParam(name = "size", defaultValue = "5") int s,
			@RequestParam(name = "mc", defaultValue = "") String mc) {
		Page<Contrat> pagecontrat = null;

		if (mc == null)
			pagecontrat = contratService.findAllPageContrat(p, s);
		else
			pagecontrat = contratService.chercherContrats("%" + mc + "%", new PageRequest(p, s));
		model.addAttribute("listContrats", pagecontrat.getContent());
		/* model.addAttribute("listSouscripteurs", pagesouscripteurs.getContent()); */
		int[] pages = new int[pagecontrat.getTotalPages()];
		model.addAttribute("pages", pages);
		model.addAttribute("size", s);
		model.addAttribute("pageCourante", p);
		model.addAttribute("mc", mc);
		/* return "Contrat"; */
		return "Contrats";
	}

	@RequestMapping(value = "/formcontrat", method = RequestMethod.GET)
	public String ajoutcont(Model model) {
		model.addAttribute("contrat", new Contrat());
		model.addAttribute("service", iservice.findAllService());
		model.addAttribute("souscripteur", souscripteurService.findAllSouscripteur());
		model.addAttribute("assure", assureService.findAllAssure());
		model.addAttribute("apporteur", apporteurService.findAllApporteur());
		// addAttribute("service" iservice.listeService());
		return "Contrat";
	}

	@RequestMapping(value = "/saveContrat", method = RequestMethod.POST)
	public String saveContrat(@ModelAttribute @Valid Contrat contrat /* ,BindingResult bindingResult */) {
		/* if(bindingResult.hasErrors()) */
		/* return "Souscripteur"; */
		// Service service=consulterService(idService);
		// if(service instanceof Vehicule)
		contratService.AjoutContrat(contrat);
		return "redirect:/formcontrat";
		/* return "Confirmation"; */
	}

	@RequestMapping(value = "/deletecontrat", method = RequestMethod.GET)
	public String delete(int idContrat, String mc, int page, int size) {

		contratService.deleteContrat(idContrat);
		return "redirect:/consulterContrat?page=" + page + "&size=" + size + "&mc=" + mc;

	}

}
