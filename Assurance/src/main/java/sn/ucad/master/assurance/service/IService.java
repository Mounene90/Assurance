package sn.ucad.master.assurance.service;

import java.util.List;

import sn.ucad.master.assurance.bo.Service;

public interface IService {
	
	public Service ajoutService(Service service);
	public List<Service> findAllService();
	public Service consulterService(Integer idService);

}
