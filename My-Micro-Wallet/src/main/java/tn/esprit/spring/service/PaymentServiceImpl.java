package tn.esprit.spring.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Loans;
import tn.esprit.spring.dao.entity.Payment;
import tn.esprit.spring.dao.entity.Payment.Type;
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
public Optional<Payment> retrievePaymentById(String id) {
	// TODO Auto-generated method stub
	int PaymentId = Integer.parseInt(id);
	return PaymentRepo.findById(PaymentId);
} 





public List<Payment> retrievePaymentByType(Type type){
	return PaymentRepo.retrievePaymentByType(type);
}


public List<Payment> retrievePaymentByamounttopay(Double amount_to_pay){
	return PaymentRepo.retrievePaymentByamounttopay(amount_to_pay);
}

public List<Payment> retrievePaymentByChange(Double change){
	return PaymentRepo.retrievePaymentByChange(change);
}

public List<Payment> retrievePaymentByDateofpayment(Date date_of_payment){
	return PaymentRepo.retrievePaymentByDateofpayment(date_of_payment);
}
}
