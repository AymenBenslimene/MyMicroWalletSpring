package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Transaction implements Serializable{
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int Transaction_Id; 
	
	//private Type type;
	private String deposit; 
	private String Wording ; 
	private String Sender_id; 
	private String Receiver_id ;
	
	@Temporal (TemporalType.DATE)
	private Date date ;
	//private Nature nature ;
	//private State State ; 
	
	//many to one with account 
}
