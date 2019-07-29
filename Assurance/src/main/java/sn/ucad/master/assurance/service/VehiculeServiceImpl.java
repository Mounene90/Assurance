package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

	@Override
	public Page<Vehicule> findAllPageVehicule(int page, int size) {
		// TODO Auto-generated method stub
		return vehiculeRepository.findAll(new PageRequest(page, size));
	}

	@Override
	public Vehicule findVehiculerById(String code) {
		// TODO Auto-generated method stub
		return  vehiculeRepository.findOne(code);
	}

	@Override
	public Page<Vehicule> chercherVehicule(String mc, Pageable pageable) {
		// TODO Auto-generated method stub
		return vehiculeRepository.chercher(mc, pageable);
	}

	@Override
	public List<Vehicule> findAllVehicule() {
		// TODO Auto-generated method stub
		return vehiculeRepository.findAll();
	}

	@Override
	public void deleteVehicule(int code) {
		// TODO Auto-generated method stub
		
	}

}
