package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.dao.entity.Agent;
import tn.esprit.spring.dao.entity.User;

public interface IAgentService {
	List<Agent> retrieveAllAgents();
	 Agent addAgent(Agent u);
	void deleteAgent(String id);
	Agent updateAgent(Agent u);
	 Agent retrieveAgent(String id);
}
