package tn.esprit.spring.service;

import java.util.List;

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
	return null;
}

@Override
public Loans addLoans(Loans u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteLoans(String id) {
	// TODO Auto-generated method stub
	
}

@Override
public Loans updateLoans(Loans u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Loans retrieveLoans(String id) {
	// TODO Auto-generated method stub
	return null;
}
	
}
