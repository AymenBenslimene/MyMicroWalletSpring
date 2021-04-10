package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Loans;
import tn.esprit.spring.dao.entity.Loans.Distribution_Nature;
import tn.esprit.spring.dao.entity.Loans.Loan_Status;
import tn.esprit.spring.dao.entity.Loans.Purpose;
import tn.esprit.spring.dao.entity.Loans.Type;
import tn.esprit.spring.dao.entity.Loans.Ultimate_Decision;
import tn.esprit.spring.dao.repository.LoansRepository;

@Service
public class LoansServiceImpl implements ILoansService {
@Autowired
LoansRepository LoansRepo;
//private static final org.apache.loggin.log4j.logger l =LogManager.getLogger(LoansServiceImpl.class);

//Retrieving with all type
@Override
public List<Loans> retrieveAllLoans() {
	List<Loans> loans = (List<Loans>) LoansRepo.findAll();
	
	return loans ;

}

public Loans retrieveLoanById(String id){
	int LoanId = Integer.parseInt(id);
	Loans loan= new Loans();
	loan=LoansRepo.retrieveLoanById(LoanId);
	 
	return  loan;
}

public List<Loans> retrieveLoansByPurpose(Purpose purpose){
	return LoansRepo.retrieveLoansByPurpose(purpose);
	
}

public List<Loans> retrieveLoansByType(Type type){
	return LoansRepo.retrieveLoansByType(type);
}

public List<Loans> retrieveLoansByNatureOfDistribution(Distribution_Nature natureofdistribution){
	return LoansRepo.retrieveLoansByNatureOfDistribution(natureofdistribution);
}

public List<Loans> retrieveLoansByLoansStatus(Loan_Status status){
	return LoansRepo.retrieveLoansByLoansStatus(status);
}

public List<Loans> retrieveLoansByUltimateDecision(Ultimate_Decision ultimate_decision){
	return LoansRepo.retrieveLoansByUltimateDecision(ultimate_decision);
}


public List<Loans> retrieveLoansByAmount(double min,double max){
	return LoansRepo.retrieveLoansByAmount(min,max);
}

public List<Loans> retrieveLoansByPurchase(double min ,double max){
	return LoansRepo.retrieveLoansByPurchase(min,max);
}
/*
public Contract retrieveLoanContract(String id){

}

public Payment retrieveLoanPayment(String id){

}

*/


@Override
public Loans addLoans(Loans u) {
	// TODO Auto-generated method stub
	
	//LoansRepo.
	//LoansRepo.save(u);
	
	return LoansRepo.save(u);
}

@Override
public void deleteLoans(String id) {
	// TODO Auto-generated method stub
	int LoanId = Integer.parseInt(id);
	LoansRepo.deleteById(LoanId);
	
	//LoansRepo.deleteById(userId);
}

@Override
public Loans updateLoans(Loans u) {
	// TODO Auto-generated method stub
	//LoansRepo.findById(u.Get_Loan_Id());
	LoansRepo.save(u);
	return null;
}

@Override
public Optional<Loans> retrieveLoans(String id) {
	// TODO Auto-generated method stub
	int LoanId = Integer.parseInt(id);
	
	try{
		return LoansRepo.findById(LoanId);
		
	}catch(Exception e){return null; }
		
}

public long countLoans(){
	return LoansRepo.count();
}


}




