package sn.ucad.master.assurance.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.ucad.master.assurance.bo.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, String> {
	@Query("select v from Vehicule  v where v.matricule like:x")
	public Page<Vehicule> chercher(@Param("x")String mc ,Pageable pageable);
	
}
