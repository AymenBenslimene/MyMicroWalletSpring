package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Dialogue_Room;
import tn.esprit.spring.dao.repository.Dialogue_RoomRepository;
@Service
public class Dialogue_RoomServiceImpl implements IDialogue_RoomService{
@Autowired 
Dialogue_RoomRepository Dialogue_RoomRepo;
	@Override
	public List<Dialogue_Room> retrieveAllDialogue_Rooms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dialogue_Room addDialogue_Room(Dialogue_Room u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDialogue_Room(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dialogue_Room updateDialogue_Room(Dialogue_Room u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dialogue_Room retrieveDialogue_Room(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
