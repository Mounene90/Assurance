package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.ucad.master.assurance.bo.Categorie;
import sn.ucad.master.assurance.dao.CategorieRepository;

@Service
@Transactional
public class CategorieServiceImpl implements ICategorieService{
	@Autowired
	CategorieRepository categorieRepository;
	@Override
	public Categorie AjoutCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		return categorieRepository.save(categorie);
	}
	@Override
	public List<Categorie> findAllCategorie() {
		// TODO Auto-generated method stub
		return categorieRepository.findAll();
	}

}
