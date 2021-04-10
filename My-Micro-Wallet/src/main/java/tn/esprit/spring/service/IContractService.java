package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.dao.entity.Account;
import tn.esprit.spring.dao.entity.Contract;

public interface IContractService {
	List<Contract> retrieveAllContracts();
	Contract addContract(Contract u);
	void deleteContract(String id);
	Contract updateContract(Contract u);
	Optional<Contract> retrieveContract(String id);
}
