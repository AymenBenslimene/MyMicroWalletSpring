package tn.esprit.spring.dao.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.dao.entity.Client;

public interface ClientRepository extends CrudRepository<Client, Integer>{

}
