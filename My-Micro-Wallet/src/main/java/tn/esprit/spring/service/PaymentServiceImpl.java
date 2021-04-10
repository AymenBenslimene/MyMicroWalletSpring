package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

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
	return (List<Payment>) PaymentRepo.findAll();
}

@Override
public Payment addPayment(Payment u) {
	// TODO Auto-generated method stub
	PaymentRepo.save(u);
	return u;
}

@Override
public void deletePayment(String id) {
	// TODO Auto-generated method stub
	int PaymentId = Integer.parseInt(id);
	PaymentRepo.deleteById(PaymentId);
}

@Override
public Payment updatePayment(Payment u) {
	// TODO Auto-generated method stub
	PaymentRepo.save(u);
	return u;
}

@Override
public Optional<Payment> retrievePayment(String id) {
	// TODO Auto-generated method stub
	int PaymentId = Integer.parseInt(id);
	return PaymentRepo.findById(PaymentId);
} 
}
