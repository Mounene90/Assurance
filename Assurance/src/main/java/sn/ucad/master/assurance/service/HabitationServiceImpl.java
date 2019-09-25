package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.ucad.master.assurance.bo.Habitation;
import sn.ucad.master.assurance.dao.HabitationRepository;
@Service
@Transactional
public class HabitationServiceImpl implements IHabitationService{
	@Autowired
	HabitationRepository habitationRepository;
	@Override
	public Habitation ajoutHabitation(Habitation habitation) {
		// TODO Auto-generated method stub
		return habitationRepository.save(habitation);
	}
	@Override
	public Page<Habitation> findAllPageHabitation(int page, int size) {
		// TODO Auto-generated method stub
		return habitationRepository.findAll(new PageRequest(page, size));
	}
	@Override
	public Habitation findHabitById(Integer code) {
		// TODO Auto-generated method stub
		return habitationRepository.findOne(code);
	}
	@Override
	public Page<Habitation> chercherHabitation(String mc, Pageable pageable) {
		// TODO Auto-generated method stub
		return habitationRepository.chercher(mc, pageable);
	}
	@Override
	public void deleteHabitation(int code) {
		// TODO Auto-generated method stub
		habitationRepository.delete(code);
		
	}
	@Override
	public List<Habitation> findAllHbitation() {
		// TODO Auto-generated method stub
		return habitationRepository.findAll();
	}

}
