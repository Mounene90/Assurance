package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sn.ucad.master.assurance.bo.Avenant;

public interface IAvenantService {
	public  Avenant ajouterAvenant(Avenant avenant);
	/*public Page<Avenant> chercherAvenant(String mc, Pageable pageable);*/
	public List<Avenant> findAllAvenant();
	public Page<Avenant> findAllPageAvenant(int page, int size);
}
