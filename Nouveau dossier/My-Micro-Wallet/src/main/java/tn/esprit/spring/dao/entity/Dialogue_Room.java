package tn.esprit.spring.dao.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dialogue_Room implements Serializable {
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private double Dialogue_Room_id;
	private enum Type {
		Assistance,Claim,Request
	}
	private Type type;
	private enum Way{
		Sms,Notification
	}
	private Way way;
	/*private enum Sender{
		
	}
	
	private enum Receiver{
		
	}*/
	
	//private Sender sender;
	
	//private Receiver receiver;
	
	//private Content content;
	
	//many to one with client : no declaration needed
	// Many to one with Agent : no declaration needed
	
	
}
