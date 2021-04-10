package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.util.Date;

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

	public int getTransaction_Id() {
		return Transaction_Id;
	}

	public void setTransaction_Id(int transaction_Id) {
		Transaction_Id = transaction_Id;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getWording() {
		return Wording;
	}

	public void setWording(String wording) {
		Wording = wording;
	}

	public String getSender_id() {
		return Sender_id;
	}

	public void setSender_id(String sender_id) {
		Sender_id = sender_id;
	}

	public String getReceiver_id() {
		return Receiver_id;
	}

	public void setReceiver_id(String receiver_id) {
		Receiver_id = receiver_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	//many to one with account 
	
	
}
