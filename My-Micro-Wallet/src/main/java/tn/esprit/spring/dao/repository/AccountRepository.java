package tn.esprit.spring.dao.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.dao.entity.Account;
import tn.esprit.spring.dao.entity.Loans;


public interface AccountRepository extends CrudRepository<Account, Integer>{
	
	//@Modifying
	//@Query(value = "INSERT INTO account_loans (account_account_id, loans_loan_id) VALUES (:accountid, :loanid)", nativeQuery = true)
	//void InsertandAttachLoanstoAccount(@Param("accountid") int accountid, @Param("loanid") int loanid);
	
	@Query("SELECT u FROM Account u WHERE u.Account_ID= ?1")
	Account retrieveAccountById(int Account_ID);
}
