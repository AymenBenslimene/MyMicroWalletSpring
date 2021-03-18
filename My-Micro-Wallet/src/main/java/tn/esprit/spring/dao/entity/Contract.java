package tn.esprit.spring.dao.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contract implements Serializable {
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	
	private int contract_id; 
	
	//private type type; 
	//private Date date; 
	//private Signature signature ; 
	private String contract_content; 
	private String time_to_maturity;
	private String Repayment_Schedule;
	private double interest; 
	private String Security; 
	
	//many to one to loans 
}
