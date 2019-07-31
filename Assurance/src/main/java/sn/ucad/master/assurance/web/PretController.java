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

import sn.ucad.master.assurance.bo.Pret;
import sn.ucad.master.assurance.service.IPretService;
import sn.ucad.master.assurance.service.IService;

@Controller
public class PretController {
	@Autowired
	private IService iservice;;
	@Autowired
	private IPretService ipret;

	@RequestMapping(value = "/index1")
	public String chercherp(Model model, @RequestParam(name = "page", defaultValue = "0") int p,
			@RequestParam(name = "size", defaultValue = "5") int s,
			@RequestParam(name = "mc", defaultValue = "") String mc) {
		Page<Pret> pagespret = null;
		if (mc == null)
			pagespret = ipret.findAllPagePret(p, s);

		else
			pagespret = ipret.chercherPret("%" + mc + "%", new PageRequest(p, s));
		model.addAttribute("listPrets", pagespret.getContent());
		int[] pages = new int[pagespret.getTotalPages()];
		model.addAttribute("pages", pages);
		model.addAttribute("size", s);
		model.addAttribute("pageCourante", p);
		model.addAttribute("mc", mc);
		return "Prets";
	}

	@RequestMapping(value = "/formpret", method = RequestMethod.GET)
	public String ajoutPrets(Model model) {
		model.addAttribute("pret", new Pret());
		model.addAttribute("service", iservice.findAllService());
		return "Pret";
	}

	@RequestMapping(value = "/savepret", method = RequestMethod.POST)
	public String savespret(@ModelAttribute @Valid Pret pret/* ,BindingResult bindingResult */) {
		/* if(bindingResult.hasErrors()) */
		ipret.ajoutPret(pret);
		return "redirect:/formpret";
		/* return "Confirmation"; */
	}

}
