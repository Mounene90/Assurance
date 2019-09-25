package sn.ucad.master.assurance.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.ucad.master.assurance.bo.TypeAvenant;


public interface TypeAvenantRepository extends JpaRepository<TypeAvenant, Integer> {
	@Query("select typav from TypeAvenant typav where typav.libelleType like:x")
	public Page<TypeAvenant> chercherTypeAvenant(@Param("x")String mc ,Pageable pageable);

	//public TypeAvenant findOne(@Param("x")String libelle);

	//public void delete(String libelle);

}
