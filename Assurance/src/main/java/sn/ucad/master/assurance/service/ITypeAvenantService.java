package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import sn.ucad.master.assurance.bo.TypeAvenant;


public interface ITypeAvenantService {
	public  TypeAvenant ajouterTypeAvenant(TypeAvenant typeavenant);
	public Page<TypeAvenant> findAllPageTypeAvenant(int page, int size);
	/*public TypeAvenant findTypeAvenantById(String libelle);*/
    public Page<TypeAvenant> chercherTypeAvenant(String mc, Pageable pageable);
	public List<TypeAvenant> findAllTypeAvenant();
	public void addTypeAvenant(TypeAvenant typeavenant);
	/*public void deleteTypeAvenant(Integer code);*/
	public void updateTypeAvenant(TypeAvenant typeavenant);

}
