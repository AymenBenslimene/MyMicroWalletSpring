package tn.esprit.spring.dao.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin implements Serializable {

	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int admin_id; 
	
	private String Name;
	private String Surname; 
	
	//private Login login ; 
	
	//private Password password; 
	
	private int phone_number; 
	
	//one to many with offer;
	// one to many with displayer;
	
}
