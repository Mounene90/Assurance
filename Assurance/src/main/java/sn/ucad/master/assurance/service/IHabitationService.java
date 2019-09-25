package sn.ucad.master.assurance.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import sn.ucad.master.assurance.bo.Habitation;

public interface IHabitationService {
	public Habitation ajoutHabitation(Habitation habitation);
	public Page<Habitation> findAllPageHabitation(int page, int size);

	public Habitation findHabitById(Integer code);

	public Page<Habitation> chercherHabitation(String mc, Pageable pageable);

	public void deleteHabitation(int code);

	public List<Habitation> findAllHbitation();

}
