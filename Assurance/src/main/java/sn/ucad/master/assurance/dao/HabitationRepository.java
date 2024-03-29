package sn.ucad.master.assurance.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.ucad.master.assurance.bo.Habitation;


public interface HabitationRepository extends JpaRepository<Habitation, Integer>{
	@Query("select h from Habitation  h where h.adresse like:x")
	public Page<Habitation> chercher(@Param("x")String mc ,Pageable pageable);
	

}
