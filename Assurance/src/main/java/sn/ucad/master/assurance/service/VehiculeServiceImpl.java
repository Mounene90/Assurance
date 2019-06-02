package sn.ucad.master.assurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.ucad.master.assurance.bo.Vehicule;
import sn.ucad.master.assurance.dao.VehiculeRepository;
@Service
@Transactional
public class VehiculeServiceImpl implements IVehiculeService {
	@Autowired
	VehiculeRepository vehiculeRepository;

	@Override
	public Vehicule AjoutVehicule(Vehicule vehicule) {
		// TODO Auto-generated method stub
		return vehiculeRepository.save(vehicule);
	}

}
