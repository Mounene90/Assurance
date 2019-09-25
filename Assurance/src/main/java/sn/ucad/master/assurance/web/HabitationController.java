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

import sn.ucad.master.assurance.bo.Habitation;
import sn.ucad.master.assurance.service.IHabitationService;
import sn.ucad.master.assurance.service.IService;

@Controller
public class HabitationController {
	@Autowired
	private IHabitationService habitationService;
	@Autowired
	private IService iservice;
	@RequestMapping(value = "/index5")
	public String chercherp(Model model, @RequestParam(name = "page", defaultValue = "0") int p,
			@RequestParam(name = "size", defaultValue = "5") int s,
			@RequestParam(name = "mc", defaultValue = "") String mc) {
		Page<Habitation> pageshabit = null;
		if (mc == null)
			pageshabit = habitationService.findAllPageHabitation(p, s);

		else
			pageshabit = habitationService.chercherHabitation("%" + mc + "%", new PageRequest(p, s));
		model.addAttribute("listHabits", pageshabit.getContent());
		int[] pagesss = new int[pageshabit.getTotalPages()];
		model.addAttribute("pagesss", pagesss);
		model.addAttribute("size", s);
		model.addAttribute("pageCourante", p);
		model.addAttribute("mc", mc);
		return "habitations";
	}
	
	@RequestMapping(value="/formhabitation",method=RequestMethod.GET)
	public String ajoutHabitations(Model model) {
		model.addAttribute("habitation", new Habitation());
		model.addAttribute("service", iservice.findAllService());
		return "Habitation";
	}
	
	@RequestMapping(value="/savehabitation", method = RequestMethod.POST)
	public String saveshabi(@ModelAttribute  @Valid Habitation habitation/*,BindingResult bindingResult*/) {
		/*if(bindingResult.hasErrors())*/
		   habitationService.ajoutHabitation(habitation);
			return "redirect:/formhabitation";
	}

}
