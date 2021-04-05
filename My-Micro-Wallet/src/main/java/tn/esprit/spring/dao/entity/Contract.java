package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
		Auto_Loans,Business_Loans,Agriculture_Loans,Energy_Loans,
Family_Loans,Construction_Loans,Mortgages,Payday_Loans,Personal_Loans,School_Loans,
		
		}
	
	@Enumerated(EnumType.STRING)

	private Type type; 
	
	private String time_to_maturity; // lengh of loan

	public enum Repayment_Schedule{
		Weekly,Monthly,semesterly,Annually
	}
	@Enumerated(EnumType.STRING)

	private Repayment_Schedule Repayment_Schedule; // 
	
	
	@Temporal (TemporalType.DATE)
	private Date Signature_Date; 
	//private Signature signature ; 
	private String Original_Note;
	private String Extensions; 
	private String Additional_Terms;
	private String Security; 



	private double bear_interest;  // home loans 
	private double Fixed_Interest; 
	private double Variable_Interest;
	private double Annual_Percentage_Rate;
	private double Prime_Rate;
	private double Discount_Rate;
	private double Simple_Interest;
	private double Compound_Interest;
	private double Other_Fees;

	private double Late_fees;
	private double Early_Payment_Penalty; 
	private double Default_Terms; 
	

		
	///
		/*
		Late Fees (if any)
		Default Terms (if the borrower doesn’t pay)
		Early Payment Penalty (if any)*/ 
		// bear interest fore family loans 
		//Interest Rate
	
	// Constructeurs 
	//Auto Constructors 
	public Contract(int contract_id,Type type,String time_to_maturity,Repayment_Schedule Repayment_Schedule,Date Signature_Date,String Original_Note,String Extensions,String Additional_Terms,String Security,double bear_interest,
			double Fixed_Interest,double Variable_Interest,double Annual_Percentage_Rate,double Prime_Rate,double Discount_Rate,double Simple_Interest,double Compound_Interest,double Other_Fees,double Late_fees,double Early_Payment_Penalty,double Default_Terms){
		this.contract_id=contract_id;
		this.type=type;
		this.time_to_maturity=time_to_maturity;
		this.Repayment_Schedule=Repayment_Schedule;
		this.Signature_Date=Signature_Date;
		this.Original_Note=Original_Note;
		this.Additional_Terms=Additional_Terms;
		this.Extensions=Extensions;
		this.Security=Security;
		this.bear_interest=bear_interest;
		this.Fixed_Interest=Fixed_Interest;
		this.Variable_Interest=Variable_Interest;
		this.Annual_Percentage_Rate=Annual_Percentage_Rate;
		this.Prime_Rate=Prime_Rate;
		this.Discount_Rate=Discount_Rate;
		this.Simple_Interest=Simple_Interest;
		this.Compound_Interest=Compound_Interest;
		this.Other_Fees=Other_Fees;
		this.Late_fees=Late_fees;
		this.Early_Payment_Penalty=Early_Payment_Penalty;
		this.Default_Terms=Default_Terms;
	}
	// Setters 
	
	public void Set_Contract_id(int id){
		this.contract_id=id ; 
	}
	public void Set_Type(Type type){
		this.type=type ; 
	}
	public void Set_Time_to_Maturity(String ttm){
		this.time_to_maturity=ttm ; 
	}
	public void Set_Repayment_Schedule(Repayment_Schedule rs){
		this.Repayment_Schedule=rs ;
	}
	
	public void Set_Signature_Date(Date date){
		this.Signature_Date=date ;
	}
	
	public void Set_Original_Note(String text){
		this.Original_Note=text ;
	}
	public void Set_Additional_Terms(String text){
		this.Additional_Terms=text ;
	}
	public void Set_Extensions(String text){
		this.Extensions=text ;
	}
	public void Set_Security(String text){
		this.Security=text;
	}
	
	public void Set_bear_interest(double interest){
		this.bear_interest=interest;
	}
	public void Set_Fixed_Interest(double interest){
		this.Fixed_Interest=interest;
	} 
	public void Set_Variable_Interest(double interest){
		this.Variable_Interest=interest;
	}
	public void Set_Annual_Percentage_Rate(double interest){
		this.Annual_Percentage_Rate=interest;
	}
	public void Set_Prime_Rate(double interest){
		this.Prime_Rate=interest;
	}
	public void Set_Discount_Rate(double interest){
		this.Discount_Rate=interest;
	}
	public void Set_Simple_Interest(double interest){
		this.Simple_Interest=interest;
	}
	public void Set_Compound_Interest(double interest){
		this.Compound_Interest=interest;
	}
	public void Set_Other_Fees(double interest){
		this.Other_Fees=interest;
	}
	
	
	public void Set_Late_fees(double interest){
		this.Late_fees=interest;
	}
	public void Set_Early_Payment_Penalty(double interest){
		this.Early_Payment_Penalty=interest;
	} 
	public void Set_Default_Terms(double interest){
		this.Default_Terms=interest; 
	} 
	//Getters 
	public int Get_Contract_id(){
		return this.contract_id ; 
	}
	public Type Get_Type(){
		return this.type ; 
	}
	public String Get_Time_to_Maturity(){
		return this.time_to_maturity ; 
	}
	public Repayment_Schedule Get_Repayment_Schedule(){
		return this.Repayment_Schedule ;
	}
	
	public Date Get_Signature_Date(){
		return this.Signature_Date ;
	}
	
	public String Get_Original_Note(){
		return this.Original_Note;
	}
	public String Get_Additional_Terms(){
		return this.Additional_Terms ;
	}
	public String Get_Extensions(){
		return this.Extensions ;
	}
	public String Get_Security(){
		return this.Security;
	}
	
	public double Get_bear_interest(){
		return this.bear_interest;
	}
	public double Get_Fixed_Interest(){
		return this.Fixed_Interest;
	} 
	public double Get_Variable_Interest(){
		return this.Variable_Interest;
	}
	public double Get_Annual_Percentage_Rate(){
		return this.Annual_Percentage_Rate;
	}
	public double Get_Prime_Rate(){
		return this.Prime_Rate;
	}
	public double Get_Discount_Rate(){
		return this.Discount_Rate;
	}
	public double Get_Simple_Interest(){
		return this.Simple_Interest;
	}
	public double Get_Compound_Interest(){
		return this.Compound_Interest;
	}
	public double Get_Other_Fees( ){
		return this.Other_Fees;
	}
	
	public double Get_Late_fees(){
		return this.Late_fees;
	}
	public double Get_Early_Payment_Penalty(){
		return this.Early_Payment_Penalty;
	} 
	public double Get_Default_Terms(){
		return this.Default_Terms; 
	} 
	
	
	
	//many to one to loans 
}
