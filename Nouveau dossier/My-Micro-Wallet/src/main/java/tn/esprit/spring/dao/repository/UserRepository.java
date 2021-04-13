package tn.esprit.spring.dao.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.dao.entity.User;


public interface UserRepository extends CrudRepository<User, Integer>{
	
}