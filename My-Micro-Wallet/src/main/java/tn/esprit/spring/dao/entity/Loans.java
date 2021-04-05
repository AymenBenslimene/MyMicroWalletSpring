package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Loans implements Serializable{
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int loan_id; 
	public enum Purpose{
		
		Auto,School,Home,Working
	}
	@Enumerated(EnumType.STRING)

	private Purpose purpose; // could be enum
	public enum Type{
		
		SHORT_TERM,INTERMEDIATE_TERM,LONG_TERM
	}
	@Enumerated(EnumType.STRING)

	private Type type; 
		
	
	private double loan_amount;
	
	private double loan_purchase; 
	
	
	//private Periodicity periodicity;
	
	public enum Distribution_Nature{
		Cash,Balance
	}
	@Enumerated(EnumType.STRING)

	private Distribution_Nature Nature_of_Distribution;
	
	public enum Ultimate_Decision{
		Accepted,Refused,In_Treatment
	}
	@Enumerated(EnumType.STRING)

	private Ultimate_Decision ultimate_decision ;
	
	public enum Loan_Status{
		Close,Open
	}
	@Enumerated(EnumType.STRING)

	private Loan_Status Loan_Status;

	//many to one to account : no declaration needed
	
	//one to many uni to payment 
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Payment> payment;
	//one to many uni to Contract 
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Contract> Contract;
	
	
	//constructer getter et setters :
	public Loans(int loan_id,Purpose Purpose,Type Type,double loan_amount, double loan_purchase, Distribution_Nature Distribution_Nature,Ultimate_Decision Ultimate_Decision,Loan_Status Loan_Status){
		this.loan_id=loan_id;
		this.purpose=Purpose;
		this.type=Type;
		this.loan_amount=loan_amount;
		this.loan_purchase=loan_purchase;
		this.Nature_of_Distribution=Distribution_Nature;
		this.ultimate_decision=ultimate_decision; 
		this.Loan_Status=Loan_Status;
	}
	
	public void Set_Loan_Id(int loan_id){
		this.loan_id=loan_id;
	}
	public void Set_Loan_Purpose(Purpose Purpose){
		this.purpose=purpose;
	}
	public void Set_type(Type Type){
		this.type=Type;
	}
	public void Set_Loan_Amount(double la){
		this.loan_amount=la;
	}
	public void Set_Loan_Purchase(double lp){
		this.loan_purchase=lp;
	}
	public void Set_Distribution_Nature(Distribution_Nature dn){
		this.Nature_of_Distribution=dn;
	}
	public void Set_Ultimate_Decision(Ultimate_Decision ud ){
		this.ultimate_decision=ud; 
	}
	public void Set_Loans_Status(Loan_Status ls ){
		this.Loan_Status=ls;
	}
	//getters
	
	public int Get_Loan_Id(){
		return this.loan_id;
	}
	public Purpose Get_Loan_Purpose( ){
		return this.purpose;
	}
	public Type Get_type(){
		return this.type;
	}
	public double Get_Loan_Amount(){
		return this.loan_amount;
	}
	public double Get_Loan_Purchase(){
		return this.loan_purchase;
	}
	public Distribution_Nature Get_Distribution_Nature(){
		return this.Nature_of_Distribution;
	}
	public Ultimate_Decision Get_Ultimate_Decision(Ultimate_Decision ud ){
		return this.ultimate_decision; 
	}
	public Loan_Status Get_Loans_Status(){
		return this.Loan_Status;
	}
}
