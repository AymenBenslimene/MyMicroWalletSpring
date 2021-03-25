package tn.esprit.spring.service;

import java.util.List;


import tn.esprit.spring.dao.entity.Payment;

public interface IPaymentService {
	List<Payment> retrieveAllPayments();
	Payment addPayment(Payment u);
	void deletePayment(String id);
	Payment updatePayment(Payment u);
	Payment retrievePayment(String id);
}
