package tn.esprit.spring.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.dao.entity.Loans;
import tn.esprit.spring.dao.entity.Loans.Distribution_Nature;
import tn.esprit.spring.dao.entity.Loans.Loan_Status;
import tn.esprit.spring.dao.entity.Loans.Purpose;
import tn.esprit.spring.dao.entity.Loans.Type;
import tn.esprit.spring.dao.entity.Loans.Ultimate_Decision;

public interface LoansRepository extends CrudRepository < Loans, Integer> {
	//@Query("SELECT u FROM User u WHERE u.role= ?1")
	//List<User> retrieveUsersByRole(Role role);
	
	
	@Query("SELECT u FROM Loans u WHERE u.id= ?1")
	Loans retrieveLoanById(int id);
	
	@Query("SELECT u FROM Loans u WHERE u.purpose= ?1")
	List<Loans> retrieveLoansByPurpose(Purpose purpose);
	
	@Query("SELECT u FROM Loans u WHERE u.type= ?1")
	List<Loans> retrieveLoansByType(Type type);
	
	
	
	@Query("SELECT u FROM Loans u WHERE u.Distribution_Nature= :Distribution_Nature")
	List<Loans> retrieveLoansByNatureOfDistribution(@Param("Distribution_Nature")Distribution_Nature Distribution_Nature);
	
	@Query("SELECT u FROM Loans u WHERE u.Loan_Status= ?1")
	List<Loans> retrieveLoansByLoansStatus(Loan_Status status);
	
	@Query("SELECT u FROM Loans u WHERE u.ultimate_decision= ?1")
	List<Loans> retrieveLoansByUltimateDecision(Ultimate_Decision ultimate_decision);
	
	@Query("SELECT u FROM Loans u WHERE u.loan_amount between ?1 and  ?2")
	List<Loans> retrieveLoansByAmount(double from, double to);
	@Query("SELECT u FROM Loans u WHERE u.loan_purchase between ?1 and  ?2")
	List<Loans> retrieveLoansByPurchase(double from, double to);
	
	// Retrieve List of payments
	
}
