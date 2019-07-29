package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

	@Override
	public Page<Pret> findAllPagePret(int page, int size) {
		// TODO Auto-generated method stub
		return pretRepository.findAll(new PageRequest(page, size));
	}

	@Override
	public Pret findPretById(Integer code) {
		// TODO Auto-generated method stub
		return pretRepository.findOne(code);
	}
	@Override
	public Page<Pret> chercherPret(String mc, Pageable pageable) {
		// TODO Auto-generated method stub
		return pretRepository.chercher(mc, pageable);
	}

	@Override
	public void deletePret(int code) {
		// TODO Auto-generated method stub
		pretRepository.delete(code);

	}

	@Override
	public List<Pret> findAllPret() {
		// TODO Auto-generated method stub
		return pretRepository.findAll();
	}

}
