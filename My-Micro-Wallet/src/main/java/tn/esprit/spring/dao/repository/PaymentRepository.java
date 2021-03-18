package tn.esprit.spring.dao.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.dao.entity.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
