package tn.esprit.spring.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Contract;
import tn.esprit.spring.dao.entity.Contract.Repayment_Schedule;
import tn.esprit.spring.dao.entity.Contract.Type;
import tn.esprit.spring.dao.repository.ContractRepository;

@Service
public class ContractServiceImpl implements IContractService{
@Autowired
ContractRepository ContractRepo;

@Override
public List<Contract> retrieveAllContracts() {
	// TODO Auto-generated method stub
	
	return (List<Contract>) ContractRepo.findAll();
}

@Override
public Contract addContract(Contract u) {
	// TODO Auto-generated method stub
	ContractRepo.save(u);
	return u;
}

@Override
public void deleteContract(String id) {
	// TODO Auto-generated method stub
	int ContractId = Integer.parseInt(id);
	ContractRepo.deleteById(ContractId);
}

@Override
public Contract updateContract(Contract u) {
	// TODO Auto-generated method stub
	ContractRepo.save(u);
	return u;
}

@Override
public Optional<Contract> retrieveContract(String id) {
	// TODO Auto-generated method stub
	int ContractId = Integer.parseInt(id);
	
	return ContractRepo.findById(ContractId);
} 


public Contract retrieveContractById(String id){
	int contract_id = Integer.parseInt(id);
	return ContractRepo.retrieveContractById(contract_id);
}


public List<Contract> retrieveContractByType(Type type){
	return ContractRepo.retrieveContractByType(type);
}


public List<Contract> retrieveContractByTime_To_Maturity(String time_to_maturity){
	return ContractRepo.retrieveContractByTime_To_Maturity(time_to_maturity);
}


public List<Contract> retrieveContractByRepayment_Schedule(Repayment_Schedule Repayment_Schedule){
	return ContractRepo.retrieveContractByRepayment_Schedule(Repayment_Schedule);
}


public List<Contract> retrieveContractBySignature_Date(Date Signature_Date){
	return ContractRepo.retrieveContractBySignature_Date(Signature_Date);
}


}
