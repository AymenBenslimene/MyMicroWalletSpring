package tn.esprit.spring.dao.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Claims implements Serializable {

	
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int claim_id ; 
	
	//private Service service ; 
	//private Date Date ; 
	//private Status status; 
	private String claim_title;
	private String contents;
	private String Response; 

	// many to oe with client
	// many to one with Admin 

}
