package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	@Temporal (TemporalType.DATE)
 	public Date time_to_display;
 	public String redirection; 
 	private static int Clicks;
 	
 	// Many to one with admin : no declaration needed
}
