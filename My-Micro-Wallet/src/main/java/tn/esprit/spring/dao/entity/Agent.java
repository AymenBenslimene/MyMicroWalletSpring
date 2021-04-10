package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Agent implements Serializable {

	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int agent_id; 
	
	private String Name;
	private String Surname; 
	//private Login login; 
	//private Password  password; 
	private int Badge_number ; 
	//private set affected_clients
	//private Set<String> affected_clients; 
	//private picture ; 
	
	//one to many with dialogue Room ; 
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Dialogue_Room> dialogue_room;

	public int getAgent_id() {
		return agent_id;
	}

	public void setAgent_id(int agent_id) {
		this.agent_id = agent_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public int getBadge_number() {
		return Badge_number;
	}

	public void setBadge_number(int badge_number) {
		Badge_number = badge_number;
	}

	public Set<Dialogue_Room> getDialogue_room() {
		return dialogue_room;
	}

	public void setDialogue_room(Set<Dialogue_Room> dialogue_room) {
		this.dialogue_room = dialogue_room;
	}
	
	
}
