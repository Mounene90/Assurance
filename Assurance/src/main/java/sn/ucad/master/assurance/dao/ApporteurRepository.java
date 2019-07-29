package sn.ucad.master.assurance.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.ucad.master.assurance.bo.Apporteur;


public interface ApporteurRepository extends JpaRepository<Apporteur, String> {
	@Query("select ap from Apporteur ap where ap.codeApp like:x")
	public Page<Apporteur> chercher(@Param("x")String mc ,Pageable pageable);

}
