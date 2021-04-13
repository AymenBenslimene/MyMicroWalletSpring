package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.dao.entity.Payment;
import tn.esprit.spring.dao.entity.Transaction;

public interface ITransactionService {
	List<Transaction> retrieveAllTransactions();
	Transaction addTransaction(Transaction u);
	void deleteTransaction(int id);
	Transaction updateTransaction(Transaction u);
	Transaction retrieveTransaction(int id);
}
