package tn.esprit.spring.service;

import java.util.List;

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
	// TODO Auto-generated method stub
	return null;
}

@Override
public Agent addAgent(Agent u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteAgent(String id) {
	// TODO Auto-generated method stub
	
}

@Override
public Agent updateAgent(Agent u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Agent retrieveAgent(String id) {
	// TODO Auto-generated method stub
	return null;
}
}
