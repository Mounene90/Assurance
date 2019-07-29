package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import sn.ucad.master.assurance.bo.Souscripteur;

public interface ISouscripteurService {

	public Souscripteur ajouterSouscripeur(Souscripteur souscripteur);

	public Page<Souscripteur> findAllPageSouscripteur(int page, int size);

	public Souscripteur findSouscripteurById(int code);

	public Page<Souscripteur> chercherSouscripteur(Integer mc, Pageable pageable);

	/* public Souscripteur updateSouscripteur (Souscripteur souscripteur); */
	public void deleteSouscripteur(int code);

	public List<Souscripteur> findAllSouscripteur();

}
