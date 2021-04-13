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
public class Contract implements Serializable {
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	
	private int contract_id; 
	
	public enum Type {
		facilities_agreements,revolvers,term_loans,working_capital_loans,Student
		}
	private Type type; 
	
	@Temporal (TemporalType.DATE)
	private Date date; 
	//private Signature signature ; 
	private String contract_content; 
	private String time_to_maturity; // lengh of loan
	
	public enum Repayment_Schedule{
		Weekly,Monthly,semesterly,Annually
	}
	
	private Repayment_Schedule Repayment_Schedule; // 
	
	private double interest; 
	private String Security; 
	
	//many to one to loans 
}
