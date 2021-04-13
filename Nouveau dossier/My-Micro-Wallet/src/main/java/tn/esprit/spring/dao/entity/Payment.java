package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Payment implements Serializable {
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int payment_id; 
	
	private double amount_topay;
	private double change; 
	@Temporal (TemporalType.DATE)
	private Date date_of_payment; 
	
	private Set<Date> schedules ; 

//many to one to loans 
}
