package tn.esprit.spring.dao.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.dao.entity.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {

}
