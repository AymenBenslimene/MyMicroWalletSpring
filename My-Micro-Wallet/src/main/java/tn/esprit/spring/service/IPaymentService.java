package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.dao.entity.Payment;

public interface IPaymentService {
	List<Payment> retrieveAllPayments();
	Payment addPayment(Payment u);
	void deletePayment(String id);
	Payment updatePayment(Payment u);
	
	Optional<Payment> retrievePaymentById(String id);
}
