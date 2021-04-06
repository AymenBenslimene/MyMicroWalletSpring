package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Loans;
import tn.esprit.spring.dao.repository.LoansRepository;

@Service
public class LoansServiceImpl implements ILoansService {
@Autowired
LoansRepository LoansRepo;


@Override
public List<Loans> retrieveAllLoans() {
	// TODO Auto-generated method stub
	return (List<Loans>) LoansRepo.findAll() ;
}

@Override
public Loans addLoans(Loans u) {
	// TODO Auto-generated method stub
	
	//LoansRepo.
	LoansRepo.save(u);
	
	return null;
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
	LoansRepo.findById(u.Get_Loan_Id());
	LoansRepo.save(u);
	return null;
}

@Override
public Optional<Loans> retrieveLoans(int id) {
	// TODO Auto-generated method stub
	
	return LoansRepo.findById(id);
	
	
	
}

@Override
public Loans retrieveLoans(String id) {
	// TODO Auto-generated method stub
	
	//LoansRepo.findById(u.Get_Loan_Id());

	
	return null;
}

}


