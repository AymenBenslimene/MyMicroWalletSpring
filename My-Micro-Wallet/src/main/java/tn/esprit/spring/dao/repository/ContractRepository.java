package tn.esprit.spring.dao.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.dao.entity.Contract;

public interface ContractRepository extends CrudRepository <Contract, Integer> {

}
