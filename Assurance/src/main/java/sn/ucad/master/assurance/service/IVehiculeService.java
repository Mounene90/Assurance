package sn.ucad.master.assurance.service;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sn.ucad.master.assurance.bo.Vehicule;


public interface IVehiculeService {
	
	public Vehicule AjoutVehicule(Vehicule vehicule);
	public Page<Vehicule> findAllPageVehicule(int page, int size);
	public Vehicule findVehiculerById(String code);
	public Page<Vehicule> chercherVehicule(String mc, Pageable pageable);
	public void deleteVehicule(int code);
	public List<Vehicule> findAllVehicule();
	

}
