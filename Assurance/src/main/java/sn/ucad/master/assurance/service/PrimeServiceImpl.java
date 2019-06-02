package sn.ucad.master.assurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.ucad.master.assurance.bo.Prime;
import sn.ucad.master.assurance.dao.PrimeRepository;
@Service
@Transactional
public class PrimeServiceImpl implements IPrimeService {
	@Autowired
	PrimeRepository primeRepository;
	@Override
	public Prime ajoutPrime(Prime prime) {
		// TODO Auto-generated method stub
		return primeRepository.save(prime);
	}

}
