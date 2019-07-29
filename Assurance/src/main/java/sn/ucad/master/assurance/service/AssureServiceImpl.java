package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

	@Override
	public Page<Assure> findAllPageAssure(int page, int size) {
		// TODO Auto-generated method stub
		return assureRepository.findAll(new PageRequest(page, size));
	}

	@Override
	public Assure findAssureById(int code) {
		// TODO Auto-generated method stub
		return assureRepository.findOne(code);
	}

	@Override
	public Page<Assure> chercherAssure(Integer mc, Pageable pageable) {
		// TODO Auto-generated method stub
		return assureRepository.chercher(mc, pageable);
	}

	@Override
	public void deleteAssure(int code) {
		// TODO Auto-generated method stub
		assureRepository.delete(code);
		
	}

}
