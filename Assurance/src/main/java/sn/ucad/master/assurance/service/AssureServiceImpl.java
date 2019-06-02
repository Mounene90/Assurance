package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.ucad.master.assurance.bo.Assure;
import sn.ucad.master.assurance.dao.AssureRepository;
@Service
@Transactional
public class AssureServiceImpl implements IAssureService {
	
	@Autowired
	AssureRepository assureRepository;

	@Override
	public Assure Ajouter(Assure assure) {
		// TODO Auto-generated method stub
		return assureRepository.save(assure);
	}

	@Override
	public List<Assure> findAllAssure() {
		// TODO Auto-generated method stub
		return assureRepository.findAll();
	}

	

}
