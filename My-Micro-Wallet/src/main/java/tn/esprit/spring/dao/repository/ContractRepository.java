package tn.esprit.spring.dao.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.dao.entity.Contract;
import tn.esprit.spring.dao.entity.Contract.Repayment_Schedule;
import tn.esprit.spring.dao.entity.Contract.Type;
import tn.esprit.spring.dao.entity.Loans;

public interface ContractRepository extends CrudRepository <Contract, Integer> {

	@Query("SELECT u FROM Contract u WHERE u.contract_id= ?1")
	Contract retrieveContractById(int contract_id);
	
	@Query("SELECT u FROM Contract u WHERE u.type= ?1")
	List<Contract> retrieveContractByType(Type type);
	
	@Query("SELECT u FROM Contract u WHERE u.time_to_maturity= ?1")
	List<Contract> retrieveContractByTime_To_Maturity(String time_to_maturity);
	
	@Query("SELECT u FROM Contract u WHERE u.Repayment_Schedule= ?1")
	List<Contract> retrieveContractByRepayment_Schedule(Repayment_Schedule Repayment_Schedule);
	
	@Query("SELECT u FROM Contract u WHERE u.Signature_Date= ?1")
	List<Contract> retrieveContractBySignature_Date(Date Signature_Date);
	
}
