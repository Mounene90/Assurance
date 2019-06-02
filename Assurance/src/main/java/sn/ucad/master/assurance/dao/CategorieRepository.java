package sn.ucad.master.assurance.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.ucad.master.assurance.bo.Categorie;


public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
	@Query("select c from Categorie c where c.libelle like :x")
	public Page<Categorie> cherchecat(@Param("x")String mc,Pageable pageable);

}
