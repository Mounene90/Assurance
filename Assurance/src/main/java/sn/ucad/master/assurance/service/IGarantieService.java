package sn.ucad.master.assurance.service;

import java.util.List;

import sn.ucad.master.assurance.bo.Garantie;


public interface IGarantieService {
	public Garantie ajoutGrantie(Garantie garantie);
	public List<Garantie> findAllGarantie();

}
