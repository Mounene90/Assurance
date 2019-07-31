package sn.ucad.master.assurance.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sn.ucad.master.assurance.bo.Detail;
import sn.ucad.master.assurance.service.IContratService;
import sn.ucad.master.assurance.service.IDetailService;
import sn.ucad.master.assurance.service.IGarantieService;

@Controller
public class DetailController {
	@Autowired
	private IDetailService detailservice;
	@Autowired
	private IContratService contratService;
	@Autowired
	private IGarantieService garantieService;
	@RequestMapping(value="/formDetails",method=RequestMethod.GET)
	public String ajoutDetail(Model model) {
		model.addAttribute("detail", new Detail());
		model.addAttribute("contrat", contratService.findAllContrat());
		model.addAttribute("garantie", garantieService.findAllGarantie());
		return "Detail";
	}
	
	@RequestMapping(value="/saveDetail", method = RequestMethod.POST)
	public String save(@ModelAttribute  @Valid Detail detail/*,BindingResult bindingResult*/) {
		/*if(bindingResult.hasErrors())*/
			/*return "Assure";*/
		detailservice.Ajouter(detail);
		//addEmployee(employee);
		//return "Assure";
		return "redirect:/formDetails";
	}

}
