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
public class Claims implements Serializable {

	
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int claim_id ; 
	
	//private Service service ; 
	@Temporal (TemporalType.DATE)
	private Date date ; 
	
	public enum Status {
		Sent,Treated,Closed,Waiting_for_response,unclosed
		}
	private Status status; 
	private String claim_title;
	private String contents;
	private String Response; 

	// many to one with client: no declaration
	// many to one with Admin : no declaration

}
