package sn.ucad.master.assurance.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.ucad.master.assurance.bo.Assure;



public interface AssureRepository extends JpaRepository<Assure, Integer>{
	
	@Query("select a from Assure a where a.telephone like:x")
	public Page<Assure> chercher(@Param("x")Integer mc ,Pageable pageable);
}
