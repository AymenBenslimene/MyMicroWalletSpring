package tn.esprit.spring.control;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.dao.entity.Account;
import tn.esprit.spring.service.AccountServiceImpl;
import tn.esprit.spring.service.ContractServiceImpl;
import tn.esprit.spring.service.LoansServiceImpl;
import tn.esprit.spring.service.PaymentServiceImpl;

@RestController
public class AccountRestControImpl {
	@Autowired
	LoansServiceImpl Loans_Service;
	@Autowired
	AccountServiceImpl Account_Service;
	@Autowired
	ContractServiceImpl Contract_Service;
	@Autowired
	PaymentServiceImpl Payment_Service;
	
	@PostMapping("/AddAccount")
	@ResponseBody
	public Account AddAccount(@RequestBody Account account){
		Account_Service.addAccount(account);
		
		return account;
	}

	@RequestMapping("/RetriveAccount/{id}")
	public Account GetAccount(@PathVariable String id){
		
			return Account_Service.retrieveAccount(id);
		
	}

}
