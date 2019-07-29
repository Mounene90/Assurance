package sn.ucad.master.assurance.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.ucad.master.assurance.bo.Pret;


public interface PretRepository extends JpaRepository<Pret, Integer>{
	@Query("select p from Pret  p where p.nomOrganisme like:x")
	public Page<Pret> chercher(@Param("x")String mc ,Pageable pageable);

}
