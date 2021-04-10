package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.util.Date;

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
	public int getDiplayer_id() {
		return diplayer_id;
	}
	public void setDiplayer_id(int diplayer_id) {
		this.diplayer_id = diplayer_id;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime_to_display() {
		return time_to_display;
	}
	public void setTime_to_display(Date time_to_display) {
		this.time_to_display = time_to_display;
	}
	public String getRedirection() {
		return redirection;
	}
	public void setRedirection(String redirection) {
		this.redirection = redirection;
	}
	public static int getClicks() {
		return Clicks;
	}
	public static void setClicks(int clicks) {
		Clicks = clicks;
	}
 	
 	// Many to one with admin : no declaration needed
 	
 	
}
