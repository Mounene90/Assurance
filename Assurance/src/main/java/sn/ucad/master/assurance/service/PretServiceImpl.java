package sn.ucad.master.assurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.ucad.master.assurance.bo.Pret;
import sn.ucad.master.assurance.dao.PretRepository;

@Service
@Transactional
public class PretServiceImpl implements IPretService {
	@Autowired
	PretRepository pretRepository;
	@Override
	public Pret ajoutPret(Pret pret) {
		// TODO Auto-generated method stub
		return pretRepository.save(pret);
	}
  
  
}
