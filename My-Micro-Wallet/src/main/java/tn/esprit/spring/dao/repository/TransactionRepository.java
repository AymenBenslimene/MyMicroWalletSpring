package tn.esprit.spring.dao.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.dao.entity.Transaction;

public interface TransactionRepository  extends CrudRepository< Transaction, Integer>{

}
