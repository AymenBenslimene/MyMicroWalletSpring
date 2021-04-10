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
public class Admin implements Serializable {

	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int admin_id; 
	
	private String Name;
	private String Surname; 
	
	//private Login login ; 
	
	//private Password password; 
	
	private int phone_number; 
	
	//one to many uni with claims
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Claims> claim;
	//one to many uni with offer;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Offer> offer;
	// one to many uni with displayer;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Displayer> displayer;
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
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
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public Set<Claims> getClaim() {
		return claim;
	}
	public void setClaim(Set<Claims> claim) {
		this.claim = claim;
	}
	public Set<Offer> getOffer() {
		return offer;
	}
	public void setOffer(Set<Offer> offer) {
		this.offer = offer;
	}
	public Set<Displayer> getDisplayer() {
		return displayer;
	}
	public void setDisplayer(Set<Displayer> displayer) {
		this.displayer = displayer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((Surname == null) ? 0 : Surname.hashCode());
		result = prime * result + admin_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Surname == null) {
			if (other.Surname != null)
				return false;
		} else if (!Surname.equals(other.Surname))
			return false;
		if (admin_id != other.admin_id)
			return false;
		return true;
	}
	
	
	
}
