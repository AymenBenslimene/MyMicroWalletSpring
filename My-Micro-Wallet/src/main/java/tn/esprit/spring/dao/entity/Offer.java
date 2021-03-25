package tn.esprit.spring.dao.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Offer implements Serializable {

	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int offer_id;
	
	public String Name;
	public String Surname ; 
	// public Image image ; 
	// public Period period; 
	// public String Data; 
	
	//many to one admin : no declaration needed
	
	
}
