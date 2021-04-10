package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.dao.entity.Agent;

public interface IAgentService {
	List<Agent> retrieveAllAgents();
	 Agent addAgent(Agent u);
	void deleteAgent(String id);
	Agent updateAgent(Agent u);
	Optional<Agent> retrieveAgent(String id);
}
