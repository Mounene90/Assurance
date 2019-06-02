package sn.ucad.master.assurance.dao;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sn.ucad.master.assurance.bo.Souscripteur;

public interface SouscripteurRepository extends JpaRepository<Souscripteur, Integer>{
	@Query("select s from Souscripteur s where s.telephoneSouscripteur like:x")
	public Page<Souscripteur> chercher(@Param("x")Integer mc ,Pageable pageable);
	


}
