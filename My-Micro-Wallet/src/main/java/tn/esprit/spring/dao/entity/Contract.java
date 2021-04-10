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
	
	// Setters 
	
	
	public Contract(int contract_id, Type type, String time_to_maturity,
			tn.esprit.spring.dao.entity.Contract.Repayment_Schedule repayment_Schedule, Date signature_Date,
			String original_Note, String extensions, String additional_Terms, String security, double bear_interest,
			double fixed_Interest, double variable_Interest, double annual_Percentage_Rate, double prime_Rate,
			double discount_Rate, double simple_Interest, double compound_Interest, double other_Fees, double late_fees,
			double early_Payment_Penalty, double default_Terms) {
		super();
		this.contract_id = contract_id;
		this.type = type;
		this.time_to_maturity = time_to_maturity;
		Repayment_Schedule = repayment_Schedule;
		Signature_Date = signature_Date;
		Original_Note = original_Note;
		Extensions = extensions;
		Additional_Terms = additional_Terms;
		Security = security;
		this.bear_interest = bear_interest;
		Fixed_Interest = fixed_Interest;
		Variable_Interest = variable_Interest;
		Annual_Percentage_Rate = annual_Percentage_Rate;
		Prime_Rate = prime_Rate;
		Discount_Rate = discount_Rate;
		Simple_Interest = simple_Interest;
		Compound_Interest = compound_Interest;
		Other_Fees = other_Fees;
		Late_fees = late_fees;
		Early_Payment_Penalty = early_Payment_Penalty;
		Default_Terms = default_Terms;
	}

	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contract(int contract_id, Type type, String time_to_maturity,
			tn.esprit.spring.dao.entity.Contract.Repayment_Schedule repayment_Schedule, String original_Note,
			String extensions, String additional_Terms, String security) {
		super();
		this.contract_id = contract_id;
		this.type = type;
		this.time_to_maturity = time_to_maturity;
		Repayment_Schedule = repayment_Schedule;
		Original_Note = original_Note;
		Extensions = extensions;
		Additional_Terms = additional_Terms;
		Security = security;
	}

	public int getContract_id() {
		return contract_id;
	}

	public void setContract_id(int contract_id) {
		this.contract_id = contract_id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getTime_to_maturity() {
		return time_to_maturity;
	}

	public void setTime_to_maturity(String time_to_maturity) {
		this.time_to_maturity = time_to_maturity;
	}

	public Repayment_Schedule getRepayment_Schedule() {
		return Repayment_Schedule;
	}

	public void setRepayment_Schedule(Repayment_Schedule repayment_Schedule) {
		Repayment_Schedule = repayment_Schedule;
	}

	public Date getSignature_Date() {
		return Signature_Date;
	}

	public void setSignature_Date(Date signature_Date) {
		Signature_Date = signature_Date;
	}

	public String getOriginal_Note() {
		return Original_Note;
	}

	public void setOriginal_Note(String original_Note) {
		Original_Note = original_Note;
	}

	public String getExtensions() {
		return Extensions;
	}

	public void setExtensions(String extensions) {
		Extensions = extensions;
	}

	public String getAdditional_Terms() {
		return Additional_Terms;
	}

	public void setAdditional_Terms(String additional_Terms) {
		Additional_Terms = additional_Terms;
	}

	public String getSecurity() {
		return Security;
	}

	public void setSecurity(String security) {
		Security = security;
	}

	public double getBear_interest() {
		return bear_interest;
	}

	public void setBear_interest(double bear_interest) {
		this.bear_interest = bear_interest;
	}

	public double getFixed_Interest() {
		return Fixed_Interest;
	}

	public void setFixed_Interest(double fixed_Interest) {
		Fixed_Interest = fixed_Interest;
	}

	public double getVariable_Interest() {
		return Variable_Interest;
	}

	public void setVariable_Interest(double variable_Interest) {
		Variable_Interest = variable_Interest;
	}

	public double getAnnual_Percentage_Rate() {
		return Annual_Percentage_Rate;
	}

	public void setAnnual_Percentage_Rate(double annual_Percentage_Rate) {
		Annual_Percentage_Rate = annual_Percentage_Rate;
	}

	public double getPrime_Rate() {
		return Prime_Rate;
	}

	public void setPrime_Rate(double prime_Rate) {
		Prime_Rate = prime_Rate;
	}

	public double getDiscount_Rate() {
		return Discount_Rate;
	}

	public void setDiscount_Rate(double discount_Rate) {
		Discount_Rate = discount_Rate;
	}

	public double getSimple_Interest() {
		return Simple_Interest;
	}

	public void setSimple_Interest(double simple_Interest) {
		Simple_Interest = simple_Interest;
	}

	public double getCompound_Interest() {
		return Compound_Interest;
	}

	public void setCompound_Interest(double compound_Interest) {
		Compound_Interest = compound_Interest;
	}

	public double getOther_Fees() {
		return Other_Fees;
	}

	public void setOther_Fees(double other_Fees) {
		Other_Fees = other_Fees;
	}

	public double getLate_fees() {
		return Late_fees;
	}

	public void setLate_fees(double late_fees) {
		Late_fees = late_fees;
	}

	public double getEarly_Payment_Penalty() {
		return Early_Payment_Penalty;
	}

	public void setEarly_Payment_Penalty(double early_Payment_Penalty) {
		Early_Payment_Penalty = early_Payment_Penalty;
	}

	public double getDefault_Terms() {
		return Default_Terms;
	}

	public void setDefault_Terms(double default_Terms) {
		Default_Terms = default_Terms;
	} 
	
	
	
	
	
	//many to one to loans 
}
