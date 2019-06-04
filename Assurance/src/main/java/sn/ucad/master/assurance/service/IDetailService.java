package sn.ucad.master.assurance.service;

import java.util.List;

import sn.ucad.master.assurance.bo.Detail;

public interface IDetailService {
	public Detail Ajouter(Detail detail);
	public List<Detail> findAllDetail();

}
