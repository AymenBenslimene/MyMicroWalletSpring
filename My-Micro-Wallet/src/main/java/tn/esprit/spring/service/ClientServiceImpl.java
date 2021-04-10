package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Client;
import tn.esprit.spring.dao.repository.ClientRepository;

@Service
public class ClientServiceImpl implements IClientService{
@Autowired
ClientRepository ClientRepo;

@Override
public List<Client> retrieveAllClients() {
	// TODO Auto-generated method stub
	return (List<Client>) ClientRepo.findAll();
	
}

@Override
public Client addClient(Client u) {
	// TODO Auto-generated method stub
	ClientRepo.save(u);
	return u;
}

@Override
public void deleteClient(String id) {
	// TODO Auto-generated method stub
	int ClientId = Integer.parseInt(id);
	ClientRepo.deleteById(ClientId);
	
}

@Override
public Client updateClient(Client u) {
	// TODO Auto-generated method stub
	ClientRepo.save(u);
	return u;
}

@Override
public Optional<Client> retrieveClient(String id) {
	// TODO Auto-generated method stub
	int ClientId = Integer.parseInt(id);
	
	return ClientRepo.findById(ClientId);
}
}
