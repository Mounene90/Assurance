package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.ucad.master.assurance.bo.TypeAvenant;
import sn.ucad.master.assurance.dao.TypeAvenantRepository;

@Service
@Transactional
public class TypeAvenantServiceImpl implements ITypeAvenantService {
	@Autowired
	TypeAvenantRepository typavRepository;

	@Override
	public TypeAvenant ajouterTypeAvenant(TypeAvenant typeavenant) {
		// TODO Auto-generated method stub
		return typavRepository.saveAndFlush(typeavenant);
	}

	@Override
	public Page<TypeAvenant> findAllPageTypeAvenant(int page, int size) {
		// TODO Auto-generated method stub
		return typavRepository.findAll(new PageRequest(page, size));
	}

	/*
	 * @Override public TypeAvenant findTypeAvenantById(String libelle) { // TODO
	 * Auto-generated method stub return typavRepository.findOne(libelle); }
	 */

	@Override
	public Page<TypeAvenant> chercherTypeAvenant(String mc, Pageable pageable) {
		// TODO Auto-generated method stub
		return typavRepository.chercherTypeAvenant(mc, pageable);
	}

	@Override
	public List<TypeAvenant> findAllTypeAvenant() {
		// TODO Auto-generated method stub
		return typavRepository.findAll();
	}

	@Override
	public void addTypeAvenant(TypeAvenant typeavenant) {
		// TODO Auto-generated method stub

	}

	/*
	 * @Override public void deleteTypeAvenant(Integer libelle) { // TODO
	 * Auto-generated method stub typavRepository.delete(libelle);
	 * 
	 * }
	 */

	@Override
	public void updateTypeAvenant(TypeAvenant typeavenant) {
		// TODO Auto-generated method stub

	}

}
