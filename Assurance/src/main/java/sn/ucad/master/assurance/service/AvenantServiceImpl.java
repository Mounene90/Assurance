package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.ucad.master.assurance.bo.Avenant;
import sn.ucad.master.assurance.dao.AvenantRepository;
@Service
@Transactional
public class AvenantServiceImpl implements IAvenantService {
	@Autowired
	AvenantRepository avenantRepository;
	@Override
	public Avenant ajouterAvenant(Avenant avenant) {
		// TODO Auto-generated method stub
		return avenantRepository.saveAndFlush(avenant);
	}

	/*@Override
	public Page<Avenant> chercherAvenant(String mc, Pageable pageable) {
		// TODO Auto-generated method stub
		return avenantRepository.chercherAvenant(mc, pageable);
	}*/

	@Override
	public List<Avenant> findAllAvenant() {
		// TODO Auto-generated method stub
		return avenantRepository.findAll();
	}

	@Override
	public Page<Avenant> findAllPageAvenant(int page, int size) {
		// TODO Auto-generated method stub
		return avenantRepository.findAll(new PageRequest(page, size));
	}

	
}
