package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.dao.entity.Admin;


public interface IAdminService {
	List<Admin> retrieveAllAdmins();
	 Admin addAdmin(Admin u);
	void deleteAdmin(String id);
	Admin updateAdmin(Admin u);
	Optional<Admin> retrieveAdmin(String id);
}
