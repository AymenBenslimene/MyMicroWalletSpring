package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.dao.entity.Account;
import tn.esprit.spring.dao.entity.Contract;
import tn.esprit.spring.dao.entity.Dialogue_Room;

public interface IDialogue_RoomService {
	List<Dialogue_Room> retrieveAllDialogue_Rooms();
	Dialogue_Room addDialogue_Room(Dialogue_Room u);
	void deleteDialogue_Room(String id);
	Dialogue_Room updateDialogue_Room(Dialogue_Room u);
	Dialogue_Room retrieveDialogue_Room(String id);
}
