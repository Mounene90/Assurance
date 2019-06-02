package sn.ucad.master.assurance.service;

import java.util.List;

import sn.ucad.master.assurance.bo.Categorie;


public interface ICategorieService {
	public Categorie AjoutCategorie(Categorie categorie);
	public List<Categorie> findAllCategorie();

}
