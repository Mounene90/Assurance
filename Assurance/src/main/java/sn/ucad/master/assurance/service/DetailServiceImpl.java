package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.ucad.master.assurance.bo.Detail;
import sn.ucad.master.assurance.dao.DetailRepository;
@Service
@Transactional
public class DetailServiceImpl implements IDetailService {
	
	@Autowired
	DetailRepository detailRepository;

	@Override
	public Detail Ajouter(Detail detail) {
		// TODO Auto-generated method stub
		return detailRepository.save(detail);
	}

	@Override
	public List<Detail> findAllDetail() {
		// TODO Auto-generated method stub
		return detailRepository.findAll();
	}

}
