package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import sn.ucad.master.assurance.bo.Service;

public interface IService {
	
	public Service ajoutService(Service service);
	public List<Service> findAllService();
	public Service findServiceById(int Idservice);
	public Service consulterService(Integer idService);
	public Page<Service> chercherSouscripteur(String mc, Pageable pageable);

}
