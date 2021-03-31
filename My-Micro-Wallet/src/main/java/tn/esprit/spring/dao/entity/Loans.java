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
public class Loans implements Serializable{
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int loan_id; 
	
	private String purpose; // could be enum
	
	public enum Type{
		
		SHORT_TERM,INTERMEDIATE_TERM,LONG_TERM
	}
	private Type type; 
		
	
	private double loan_amount;
	
	private double loan_purchase; 
	
	
	//private Periodicity periodicity;
	
	public enum Distribution_Nature{
		Cash,Balance
	}
	private Distribution_Nature Nature_of_Distribution;
	
	public enum Ultimate_Decision{
		Accepted,Refused,In_Treatment
	}
	private Ultimate_Decision ultimate_decision ; 

	//many to one to account : no declaration needed
	
	//one to many uni to payment 
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Payment> payment;
	//one to many uni to Contract 
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Contract> dialogue_room;
}
