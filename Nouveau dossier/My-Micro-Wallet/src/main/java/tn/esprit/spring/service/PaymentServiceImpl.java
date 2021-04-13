package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Payment;
import tn.esprit.spring.dao.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements IPaymentService {
@Autowired
PaymentRepository PaymentRepo;

@Override
public List<Payment> retrieveAllPayments() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Payment addPayment(Payment u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deletePayment(String id) {
	// TODO Auto-generated method stub
	
}

@Override
public Payment updatePayment(Payment u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Payment retrievePayment(String id) {
	// TODO Auto-generated method stub
	return null;
} 
}
