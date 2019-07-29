package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sn.ucad.master.assurance.bo.Pret;

public interface IPretService {

	public Pret ajoutPret(Pret pret);

	public Page<Pret> findAllPagePret(int page, int size);

	public Pret findPretById(Integer code);

	public Page<Pret> chercherPret(String mc, Pageable pageable);

	public void deletePret(int code);

	public List<Pret> findAllPret();

}
