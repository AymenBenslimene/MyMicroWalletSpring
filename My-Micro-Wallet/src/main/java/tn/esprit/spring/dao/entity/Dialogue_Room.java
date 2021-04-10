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
	public double getDialogue_Room_id() {
		return Dialogue_Room_id;
	}
	public void setDialogue_Room_id(double dialogue_Room_id) {
		Dialogue_Room_id = dialogue_Room_id;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Way getWay() {
		return way;
	}
	public void setWay(Way way) {
		this.way = way;
	}
	
	//private Sender sender;
	
	//private Receiver receiver;
	
	//private Content content;
	
	//many to one with client : no declaration needed
	// Many to one with Agent : no declaration needed
	
	
	
	
}
