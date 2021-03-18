package tn.esprit.spring.dao.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.dao.entity.Account;


public interface AccountRepository extends CrudRepository<Account, Integer>{
	
}
