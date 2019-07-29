package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import sn.ucad.master.assurance.bo.Assure;

public interface IAssureService {

	public Assure Ajouter(Assure assure);

	public List<Assure> findAllAssure();

	public Page<Assure> findAllPageAssure(int page, int size);

	public Assure findAssureById(int code);

	public Page<Assure> chercherAssure(Integer mc, Pageable pageable);

	/* public Souscripteur updateSouscripteur (Souscripteur souscripteur); */
	public void deleteAssure(int code);

}
