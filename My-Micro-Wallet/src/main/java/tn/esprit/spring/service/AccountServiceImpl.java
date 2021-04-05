package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Account;
import tn.esprit.spring.dao.repository.AccountRepository;

@Service
public class AccountServiceImpl implements IAccountService{

	@Autowired
	AccountRepository AccountRepo;
	@Override
	public List<Account> retrieveAllAccounts() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public Account addAccount(Account u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account updateAccount(Account u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account retrieveAccount(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
