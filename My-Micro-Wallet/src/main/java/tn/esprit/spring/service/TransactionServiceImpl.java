package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

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
	return (List<Transaction>) TransactionRepo.findAll();
}

@Override
public Transaction addTransaction(Transaction u) {
	// TODO Auto-generated method stub
	TransactionRepo.save(u);
	return u;
}

@Override
public void deleteTransaction(String id) {
	// TODO Auto-generated method stub
	int TransactionId= Integer.parseInt(id);
	TransactionRepo.deleteById(TransactionId);
}

@Override
public Transaction updateTransaction(Transaction u) {
	// TODO Auto-generated method stub
	TransactionRepo.save(u);
	return u;
}

@Override
public Optional<Transaction> retrieveTransaction(String id) {
	// TODO Auto-generated method stub
	int TransactionId= Integer.parseInt(id);
	return TransactionRepo.findById(TransactionId);
} 
}
