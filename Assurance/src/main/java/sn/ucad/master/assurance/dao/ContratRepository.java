package sn.ucad.master.assurance.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.ucad.master.assurance.bo.Contrat;


public interface ContratRepository extends JpaRepository<Contrat, Integer>{
	
	@Query("select c from Contrat c where c.referance like:x")
	public Page<Contrat> chercherContrat(@Param("x")String mc ,Pageable pageable);

}
