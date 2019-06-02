package sn.ucad.master.assurance.service;

import java.util.List;

import sn.ucad.master.assurance.bo.Assure;


public interface IAssureService {
	
	public Assure Ajouter(Assure assure);
	public List<Assure> findAllAssure();
	

}
