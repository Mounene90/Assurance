package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.ucad.master.assurance.bo.Souscripteur;
import sn.ucad.master.assurance.dao.SouscripteurRepository;
@Service
@Transactional
public class SouscripteurServiceImpl implements ISouscripteurService {
	@Autowired
	SouscripteurRepository souscripteurRepository;

	@Override
	public Souscripteur ajouterSouscripeur(Souscripteur souscripteur) {
		// TODO Auto-generated method stub
		return souscripteurRepository.save(souscripteur);
	}

	@Override
	public Page<Souscripteur> findAllPageSouscripteur(int page, int size) {
		// TODO Auto-generated method stub
		return souscripteurRepository.findAll(new PageRequest(page, size));
	}

	@Override
	public Souscripteur findSouscripteurById(int code) {
		// TODO Auto-generated method stub
		return souscripteurRepository.findOne(code);
	}

	@Override
	public Page<Souscripteur> chercherSouscripteur(Integer mc, Pageable pageable) {
		// TODO Auto-generated method stub
		return souscripteurRepository.chercher(mc, pageable);

	}

	/*@Override
	public Souscripteur updateSouscripteur(Souscripteur souscripteur) {
		return souscripteurRepository.save(souscripteur);
	}*/

	@Override
	public void deleteSouscripteur(int code) {
		// TODO Auto-generated method stub
		souscripteurRepository.delete(code);
		
	}

	@Override
	public List<Souscripteur> findAllSouscripteur() {
		// TODO Auto-generated method stub
		return souscripteurRepository.findAll();
	}

	
	
	

}
