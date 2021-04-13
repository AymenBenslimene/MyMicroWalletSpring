package tn.esprit.spring.dao.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.dao.entity.Loans;

public interface LoansRepository extends CrudRepository < Loans, Integer> {

}
