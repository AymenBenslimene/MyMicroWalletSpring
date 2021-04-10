package tn.esprit.spring.service;

import java.util.List;

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
	return null;
}

@Override
public Client addClient(Client u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteClient(String id) {
	// TODO Auto-generated method stub
	
}

@Override
public Client updateClient(Client u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Client retrieveClient(String id) {
	// TODO Auto-generated method stub
	return null;
}
}
