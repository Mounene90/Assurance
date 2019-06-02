package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.data.domain.Page;
import sn.ucad.master.assurance.bo.Apporteur;


public interface IApporteurService {
	public Apporteur ajouterApportateur(Apporteur apporteur);
	public Page<Apporteur> findAllPageApporteur(int page, int size);
	public Apporteur findApporteurById(String code_App);
	/*public Page<Apporteur> chercherSouscripteur(Integer mc, Pageable pageable);*/
	public List<Apporteur> findAllApporteur();

}
