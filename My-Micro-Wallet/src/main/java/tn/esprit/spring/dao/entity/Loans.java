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
	//private Purpose purpose; 
	//private p_type payment_type; 
	// type ( shortterm )private Amount amount;
	private double loan_price; 
	//private Periodicity periodicity;
	
	//private Dis_nature Nature_of_Distribution;
	
	//private Ultimate_D ultimate_decision ; 

	//many to one to account : no declaration needed
	
	//one to many uni to payment 
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Payment> payment;
	//one to many uni to Contract 
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Contract> dialogue_room;
}
