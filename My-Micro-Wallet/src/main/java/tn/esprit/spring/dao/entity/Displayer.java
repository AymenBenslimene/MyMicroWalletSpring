package tn.esprit.spring.dao.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Displayer implements Serializable {

	private enum Type{
		Ads,Recommendation,Offer
	}
	
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int diplayer_id ; 
	private Type type;
	//public Image image;
 	public String content;
 	//public Date time_to_display;
 	public String redirection; 
 	
 	// Many to one with admin 
}
