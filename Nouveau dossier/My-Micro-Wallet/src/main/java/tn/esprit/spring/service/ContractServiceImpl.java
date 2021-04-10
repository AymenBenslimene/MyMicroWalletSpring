package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Contract;
import tn.esprit.spring.dao.repository.ContractRepository;

@Service
public class ContractServiceImpl implements IContractService{
@Autowired
ContractRepository ContractRepo;

@Override
public List<Contract> retrieveAllContracts() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Contract addContract(Contract u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteContract(String id) {
	// TODO Auto-generated method stub
	
}

@Override
public Contract updateContract(Contract u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Contract retrieveContract(String id) {
	// TODO Auto-generated method stub
	return null;
} 

}
