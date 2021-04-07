package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table( name = "Payment_Table")
@Entity
public class Payment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7097508416336481820L;

	@Column(name = "_payment_id")
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int payment_id; 
	
	
	
	public enum Type{
	Prepayment,Automatique}
	@Enumerated(EnumType.STRING)
	@Column(name = "_Payment_Type")
	private Type type ; 
	
	@Column(name = "_amount_to_pay")

	private double amount_to_pay;
	@Column(name = "_change")
	private double change; 
	
	@Temporal (TemporalType.DATE)
	@Column(name = "_date_of_payment")
	private Date date_of_payment;
	
	//private Set<Date> schedules ; 

//many to one to loans 
	// Constructors 
	
	public Payment(int id,Type type, double atp,Double change, Date dp ){
		this.payment_id=id;
		this.type=type;
		this.amount_to_pay=atp;
		this.change=change;
		this.date_of_payment=dp; 
	}
	//setters : 
	public void Set_Payment_Id(int id){
		this.payment_id=id;
	}
	public void Set_Type(Type type){
		this.type=type;
	}
	public  void Set_Amount_to_pay(double atp){
		this.amount_to_pay=atp;
	}
	public void Set_Change(double change){
		 this.change=change;
	}
	public void Set_Date_of_Payment(Date dp){
		this.date_of_payment=dp;
	}
	//getter
	public int Get_Payment_Id(){
		return this.payment_id;
	}
	public Type Get_Type(){
		return this.type;
	}
	public double Get_Amount_to_pay(){
		return this.amount_to_pay;
	}
	public double Get_Change(){
		return this.change;
	}
	public Date Get_Date_of_Payment(){
		return this.date_of_payment;
	}

}
