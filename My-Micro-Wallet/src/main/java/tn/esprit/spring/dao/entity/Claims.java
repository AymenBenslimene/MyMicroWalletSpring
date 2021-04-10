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
public class Claims implements Serializable {

	
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int claim_id ; 
	
	//private Service service ; 
	@Temporal (TemporalType.DATE)
	private Date date ; 
	
	public enum Status {
		Sent,Treated,Closed,Waiting_for_response,unclosed
		}
	private Status status; 
	private String claim_title;
	private String contents;
	private String Response;
	public int getClaim_id() {
		return claim_id;
	}
	public void setClaim_id(int claim_id) {
		this.claim_id = claim_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getClaim_title() {
		return claim_title;
	}
	public void setClaim_title(String claim_title) {
		this.claim_title = claim_title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getResponse() {
		return Response;
	}
	public void setResponse(String response) {
		Response = response;
	} 

	// many to one with client: no declaration
	// many to one with Admin : no declaration
	
	

}
