package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Client implements Serializable {
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int CIN;
	private String Name;
	private String Surname; 
	
	@Temporal (TemporalType.DATE)
	private Date Birth_Date;
	
	private Email Email;
	
	private Sex Sex;
	
	
	private Marital_Status Marital_Status;
	private Job Job_Title ;

	private int Phone_Number;
	
	private double Salary;
	@Embedded
	private Adress Residential_Adress; 
	@Embedded
	private Adress Business_Adress; 
	
	private double Score ;
	
	//private Password password ;
	//private Category category; 
	//private Reputation reputation
	
	//private Set Promotional_Code; 
	
	
	//private Login login; 
	//private Utility Bills ; 
	// private Picture Cin Picture
	// private Picture Passport
	
	// one to many unidirectionnelle Dialogue_Room
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Dialogue_Room> dialogue_room;
	
	// one to many bidirectionnelle Account

	@OneToMany(cascade = CascadeType.ALL, mappedBy="Account")
	private Account account;
	// one to many uni Claim
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Claims> claim;
	
	
	
	
}
