package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Agent;
import tn.esprit.spring.dao.repository.AgentRepository;

@Service
public class AgentSerivceImpl implements IAgentService {
@Autowired
AgentRepository AgentRepo;

@Override
public List<Agent> retrieveAllAgents() {
	
	return (List<Agent>) AgentRepo.findAll();
}

@Override
public Agent addAgent(Agent u) {
	// TODO Auto-generated method stub
	AgentRepo.save(u);
	return u;
}

@Override
public void deleteAgent(String id) {
	// TODO Auto-generated method stub
	int AgentId = Integer.parseInt(id);
	AgentRepo.deleteById(AgentId);
	
}

@Override
public Agent updateAgent(Agent u) {
	// TODO Auto-generated method stub
	AgentRepo.save(u);
	return u;
}

@Override
public Optional<Agent> retrieveAgent(String id) {
	// TODO Auto-generated method stub
	
	int AgentId = Integer.parseInt(id);
	return AgentRepo.findById(AgentId);
}
}
