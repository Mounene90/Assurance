package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.ucad.master.assurance.bo.Contrat;
import sn.ucad.master.assurance.dao.ContratRepository;

@Service
@Transactional
public class ContratServiceImpl implements IContratService{
	@Autowired
	ContratRepository contratRepository;
	@Override
	public Contrat AjoutContrat(Contrat contrat) {
		// TODO Auto-generated method stub
		return contratRepository.save(contrat);
	}
	@Override
	public Page<Contrat> chercherContrats(String mc, Pageable pageable) {
		// TODO Auto-generated method stub
		return contratRepository.chercherContrat(mc, pageable);
	}
	@Override
	public void deleteContrat(int code) {
		// TODO Auto-generated method stub
		contratRepository.delete(code);
		
	}
	@Override
	public List<Contrat> findAllContrat() {
		// TODO Auto-generated method stub
		return contratRepository.findAll();
	}
	@Override
	public Page<Contrat> findAllPageContrat(int page, int size) {
		// TODO Auto-generated method stub
		return contratRepository.findAll(new PageRequest(page, size));
	}

}
