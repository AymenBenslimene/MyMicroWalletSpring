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
//ssdgdfghdfhgfhdfghfghghgfhhgdfhdhfdhfdhghgfhdfdhfhfhfhfhhgdfhdfghdfhg
//joj
@Override
public List<Transaction> retrieveAllTransactions() {
	// TODO Auto-generated method stub
	return (List<Transaction>) TransactionRepo.findAll();
}

@Override
public Transaction addTransaction(Transaction u) {
	// TODO Auto-generated method stub
	return TransactionRepo.save(u);
}

@Override
public void deleteTransaction(int id) {
	Transaction t = retrieveTransaction(id);
	TransactionRepo.delete(t);
	
}

@Override
public Transaction updateTransaction(Transaction u) {
	// TODO Auto-generated method stub
	return TransactionRepo.save(u);
}

@Override
public Transaction retrieveTransaction(int id) {
	// TODO Auto-generated method stub
	return TransactionRepo.getOne(id);
} 
}
