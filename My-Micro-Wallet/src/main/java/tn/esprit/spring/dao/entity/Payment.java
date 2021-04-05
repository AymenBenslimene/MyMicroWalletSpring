package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Payment implements Serializable {
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int payment_id; 
	public enum Type{
	Prepayment,Automatique}
	private Type type ; 
	private double amount_to_pay;
	private double change; 
	@Temporal (TemporalType.DATE)
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
