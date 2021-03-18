package tn.esprit.spring.dao.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	//private picture ; 
	
	//one to many with dialogue Room ; 
}
