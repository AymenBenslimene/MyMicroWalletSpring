package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.dao.entity.Payment;
import tn.esprit.spring.dao.entity.Transaction;

public interface ITransactionService {
	List<Transaction> retrieveAllTransactions();
	Transaction addTransaction(Transaction u);
	void deleteTransaction(String id);
	Transaction updateTransaction(Transaction u);
	Optional<Transaction> retrieveTransaction(String id);
}
