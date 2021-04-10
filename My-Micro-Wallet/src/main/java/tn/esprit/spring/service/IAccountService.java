package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.dao.entity.Account;


public interface IAccountService {
	List<Account> retrieveAllAccounts();
	 Account addAccount(Account u);
	void deleteAccount(String id);
	Account updateAccount(Account u);
	Optional<Account> retrieveAccount(String id);
	 
	 
}
