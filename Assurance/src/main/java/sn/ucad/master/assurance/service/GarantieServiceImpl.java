package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.ucad.master.assurance.bo.Garantie;
import sn.ucad.master.assurance.dao.GarantieRepository;

@Service
@Transactional
public class GarantieServiceImpl implements IGarantieService {
	 @Autowired
	GarantieRepository garantieRepository;

	@Override
	public Garantie ajoutGrantie(Garantie garantie) {
		// TODO Auto-generated method stub
		return garantieRepository.save(garantie);
	}

	@Override
	public List<Garantie> findAllGarantie() {
		// TODO Auto-generated method stub
		return garantieRepository.findAll();
	}

}
