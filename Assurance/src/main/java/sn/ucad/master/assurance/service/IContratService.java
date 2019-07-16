package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sn.ucad.master.assurance.bo.Contrat;


public interface IContratService {
	public Contrat AjoutContrat(Contrat contrat);
	public Page<Contrat> chercherContrats(String mc, Pageable pageable);
	public Page<Contrat> findAllPageContrat(int page, int size);
	public List<Contrat> findAllContrat();
	public void deleteContrat(int code);

}
