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
public class Admin implements Serializable {

	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int admin_id; 
	
	private String Name;
	private String Surname; 
	
	//private Login login ; 
	
	//private Password password; 
	
	private int phone_number; 
	
	//one to many uni with claims
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Claims> claim;
	//one to many uni with offer;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Offer> offer;
	// one to many uni with displayer;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Displayer> displayer;
	
}
