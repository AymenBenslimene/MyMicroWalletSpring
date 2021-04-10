package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

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
		return (List<Dialogue_Room>) Dialogue_RoomRepo.findAll();
	}

	@Override
	public Dialogue_Room addDialogue_Room(Dialogue_Room u) {
		// TODO Auto-generated method stub
		Dialogue_RoomRepo.save(u);
		return u;
	}

	@Override
	public void deleteDialogue_Room(String id) {
		// TODO Auto-generated method stub
		int Dialogue_RoomId= Integer.parseInt(id);
		Dialogue_RoomRepo.deleteById(Dialogue_RoomId);
		
	}

	@Override
	public Dialogue_Room updateDialogue_Room(Dialogue_Room u) {
		// TODO Auto-generated method stub
		Dialogue_RoomRepo.save(u);
		return u;
	}

	@Override
	public Optional<Dialogue_Room> retrieveDialogue_Room(String id) {
		// TODO Auto-generated method stub
		int Dialogue_RoomId= Integer.parseInt(id);
		return Dialogue_RoomRepo.findById(Dialogue_RoomId);
	}

}
