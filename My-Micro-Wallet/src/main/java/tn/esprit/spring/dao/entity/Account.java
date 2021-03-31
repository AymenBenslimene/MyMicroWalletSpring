package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Account implements Serializable{
	
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int Account_ID;
	
	private static int Account_Number;
	
	@Temporal (TemporalType.DATE)
	private Date Creation_Date;
	
	@Temporal (TemporalType.DATE)
	private Date expire; 
	private double Balance=0.0;
	private double Min_Balance;
	private double Max_Balance;
	
	private double bank_verification_number;
	private static double Number; 
	private double RIB; 
	
	//private Login login ; 
	// private Password password; 
	// private set Activities; 
	
	//many to one with client
	//@ManyToOne(cascade = CascadeType.ALL)
	@ManyToOne
	Client client;
	// one to many uni with transaction 
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Transaction> transaction;
	// one to many uni with loans 
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Loans> loans;
	
	
	
	
}
