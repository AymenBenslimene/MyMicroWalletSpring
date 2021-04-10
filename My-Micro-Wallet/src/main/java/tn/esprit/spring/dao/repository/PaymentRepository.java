package tn.esprit.spring.dao.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.dao.entity.Loans;
import tn.esprit.spring.dao.entity.Payment;
import tn.esprit.spring.dao.entity.Payment.Type;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
	@Query("SELECT u FROM Payment u WHERE u.payment_id= ?1")
	Payment retrievePaymentById(int id);
	
	@Query("SELECT u FROM Payment u WHERE u.type= ?1")
	List<Payment> retrievePaymentByType(Type type);
	
	@Query("SELECT u FROM Payment u WHERE u.amount_to_pay= ?1")
	List<Payment> retrievePaymentByamounttopay(Double amount_to_pay);
	@Query("SELECT u FROM Payment u WHERE u.change= ?1")
	List<Payment> retrievePaymentByChange(Double change);
	@Query("SELECT u FROM Payment u WHERE u.date_of_payment= ?1")
	List<Payment> retrievePaymentByDateofpayment(Date date_of_payment);
}
