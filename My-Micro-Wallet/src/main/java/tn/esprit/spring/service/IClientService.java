package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.dao.entity.Account;
import tn.esprit.spring.dao.entity.Client;

public interface IClientService {
	List<Client> retrieveAllClients();
	 Client addClient(Client u);
	void deleteClient(String id);
	Client updateClient(Client u);
	Optional<Client> retrieveClient(String id);
}
