package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

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
		return (List<Account>) AccountRepo.findAll();
		
	}

	@Override
	public Account addAccount(Account u) {
		// TODO Auto-generated method stub
		AccountRepo.save(u);
		return u;
	}

	@Override
	public void deleteAccount(String id) {
		// TODO Auto-generated method stub
		int AccountId = Integer.parseInt(id);
		AccountRepo.deleteById(AccountId);
	}

	@Override
	public Account updateAccount(Account u) {
		// TODO Auto-generated method stub
	
		return AccountRepo.save(u);
	}

	@Override
	public Account retrieveAccount(String id) {
		// TODO Auto-generated method stub
		int AccountId = Integer.parseInt(id);
		
		return AccountRepo.retrieveAccountById(AccountId);
	}

	
}
