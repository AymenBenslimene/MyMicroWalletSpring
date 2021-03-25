package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Transaction;
import tn.esprit.spring.dao.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements ITransactionService {
@Autowired
TransactionRepository TransactionRepo;

@Override
public List<Transaction> retrieveAllTransactions() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Transaction addTransaction(Transaction u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteTransaction(String id) {
	// TODO Auto-generated method stub
	
}

@Override
public Transaction updateTransaction(Transaction u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Transaction retrieveTransaction(String id) {
	// TODO Auto-generated method stub
	return null;
} 
}
