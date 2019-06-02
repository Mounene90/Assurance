package sn.ucad.master.assurance.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.ucad.master.assurance.bo.Service;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
	/*@Query("select s from Service s where s.T like :x")
	public Page<Service> cherchercon(@Param("x")String mc,Pageable pageable);*/

}
