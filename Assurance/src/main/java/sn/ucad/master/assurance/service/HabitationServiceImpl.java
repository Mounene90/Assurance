package sn.ucad.master.assurance.service;

import org.springframework.beans.factory.annotation.Autowired;
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

}
