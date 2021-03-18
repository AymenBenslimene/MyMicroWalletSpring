package tn.esprit.spring.dao.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.dao.entity.Agent;

public interface AgentRepository extends CrudRepository<Agent, Integer> {

}
