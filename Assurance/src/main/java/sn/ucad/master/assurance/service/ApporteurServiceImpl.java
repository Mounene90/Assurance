package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.ucad.master.assurance.bo.Apporteur;
import sn.ucad.master.assurance.dao.ApporteurRepository;
@Service
@Transactional
public class ApporteurServiceImpl implements IApporteurService {
	@Autowired
	ApporteurRepository apporteurRepository;

	@Override
	public Apporteur ajouterApportateur(Apporteur apporteur) {
		// TODO Auto-generated method stub
		return apporteurRepository.save(apporteur);
	}

	@Override
	public Page<Apporteur> findAllPageApporteur(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Apporteur findApporteurById(String code_App) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Apporteur> findAllApporteur() {
		// TODO Auto-generated method stub
		return apporteurRepository.findAll();
	}

	@Override
	public void addApporteur(Apporteur apporteur) {
		// TODO Auto-generated method stub
		apporteurRepository.save(apporteur);
		
	}

	@Override
	public void deleteApporteur(String code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateApporteur(Apporteur apporteur) {
		// TODO Auto-generated method stub
		apporteurRepository.saveAndFlush(apporteur);
		
	}

}
