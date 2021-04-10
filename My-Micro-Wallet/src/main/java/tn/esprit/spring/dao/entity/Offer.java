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
	public int getOffer_id() {
		return offer_id;
	}
	public void setOffer_id(int offer_id) {
		this.offer_id = offer_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	
	//many to one admin : no declaration needed
	
	
	
	
}
