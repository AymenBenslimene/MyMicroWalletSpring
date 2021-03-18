package tn.esprit.spring.dao.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment implements Serializable {
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int payment_id; 
	private double amount_topay;
	private double change; 
	//private Date date_of_payment; 
//	private Schedules schedules ; 

//many to one to loans 
}
