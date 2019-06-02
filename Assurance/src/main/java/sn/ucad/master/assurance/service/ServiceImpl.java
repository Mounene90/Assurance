package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.ucad.master.assurance.dao.ServiceRepository;

@Service
@Transactional
public class ServiceImpl implements IService{
	@Autowired
	ServiceRepository serviceRepository;
	@Override
	public sn.ucad.master.assurance.bo.Service ajoutService(sn.ucad.master.assurance.bo.Service service) {
		// TODO Auto-generated method stub
		return serviceRepository.save(service);
	}
	@Override
	public List<sn.ucad.master.assurance.bo.Service> findAllService() {
		// TODO Auto-generated method stub
		return serviceRepository.findAll();
	}
	@Override
	public sn.ucad.master.assurance.bo.Service consulterService(Integer idService) {
		// TODO Auto-generated method stub
		Service service= (Service) serviceRepository.findOne(idService);
		if(service==null) throw new RuntimeException("Service introuvable");
		return (sn.ucad.master.assurance.bo.Service) service;
	}
	
	

}
