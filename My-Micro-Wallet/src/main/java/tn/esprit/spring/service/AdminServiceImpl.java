package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Admin;
import tn.esprit.spring.dao.repository.AdminRepository;

@Service
public class AdminServiceImpl implements IAdminService{
@Autowired
AdminRepository AdminRepo;

@Override
public List<Admin> retrieveAllAdmins() {
	// TODO Auto-generated method stub
	return (List<Admin>) AdminRepo.findAll();
}

@Override
public Admin addAdmin(Admin u) {
	// TODO Auto-generated method stub
	AdminRepo.save(u);
	return null;
}

@Override
public void deleteAdmin(String id) {
	// TODO Auto-generated method stub
	int AccountId = Integer.parseInt(id);
	AdminRepo.deleteById(AccountId);
	
}

@Override
public Admin updateAdmin(Admin u) {
	// TODO Auto-generated method stub
	AdminRepo.save(u);
	return u;
}

@Override
public Optional<Admin> retrieveAdmin(String id) {
	// TODO Auto-generated method stub
	
	int AccountId = Integer.parseInt(id);
	return AdminRepo.findById(AccountId);
}




}
