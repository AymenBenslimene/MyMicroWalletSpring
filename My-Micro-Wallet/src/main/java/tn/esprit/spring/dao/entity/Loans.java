package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Loans implements Serializable{
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int loan_id; 
	
	@Temporal (TemporalType.DATE)
	private Date RequestDate;
	@Temporal (TemporalType.DATE)
	private Date ResponseDate;
	@Temporal (TemporalType.DATE)
	private Date FinalDate;
	
	
	public enum Purpose{
		
		Auto,School,Home,Working,Agriculture,Family
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

	@Column(name = "Distribution_Nature")
	private Distribution_Nature Distribution_Nature;
	
	public enum Ultimate_Decision{
		Accepted,Refused,In_Treatment
	}
	@Enumerated(EnumType.STRING)
	@Column(name = "Ultimate_Decision")
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
	//@OneToMany(cascade = CascadeType.ALL)
	@OneToOne
	private Contract Contract;
	
	public int getLoan_id() {
		return loan_id;
	}
	
	public Loans(int loan_id, Date requestDate, Date responseDate, Date finalDate, Purpose purpose, Type type,
			double loan_amount, double loan_purchase,
			tn.esprit.spring.dao.entity.Loans.Distribution_Nature distribution_Nature,
			Ultimate_Decision ultimate_decision, tn.esprit.spring.dao.entity.Loans.Loan_Status loan_Status,
			Set<Payment> payment, tn.esprit.spring.dao.entity.Contract contract) {
		super();
		this.loan_id = loan_id;
		RequestDate = requestDate;
		ResponseDate = responseDate;
		FinalDate = finalDate;
		this.purpose = purpose;
		this.type = type;
		this.loan_amount = loan_amount;
		this.loan_purchase = loan_purchase;
		Distribution_Nature = distribution_Nature;
		this.ultimate_decision = ultimate_decision;
		Loan_Status = loan_Status;
		this.payment = payment;
		Contract = contract;
	}
	
	
	
	public Loans(int loan_id, Purpose purpose, Type type, double loan_amount,
			tn.esprit.spring.dao.entity.Loans.Distribution_Nature distribution_Nature) {
		super();
		this.loan_id = loan_id;
		this.purpose = purpose;
		this.type = type;
		this.loan_amount = loan_amount;
		Distribution_Nature = distribution_Nature;
	}

	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}
	public Purpose getPurpose() {
		return purpose;
	}
	public void setPurpose(Purpose purpose) {
		this.purpose = purpose;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public double getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	public double getLoan_purchase() {
		return loan_purchase;
	}
	public void setLoan_purchase(double loan_purchase) {
		this.loan_purchase = loan_purchase;
	}
	public Distribution_Nature getDistribution_Nature() {
		return Distribution_Nature;
	}
	public void setDistribution_Nature(Distribution_Nature distribution_Nature) {
		Distribution_Nature = distribution_Nature;
	}
	public Ultimate_Decision getUltimate_decision() {
		return ultimate_decision;
	}
	public void setUltimate_decision(Ultimate_Decision ultimate_decision) {
		this.ultimate_decision = ultimate_decision;
	}
	public Loan_Status getLoan_Status() {
		return Loan_Status;
	}
	public void setLoan_Status(Loan_Status loan_Status) {
		Loan_Status = loan_Status;
	}
	public Set<Payment> getPayment() {
		return payment;
	}
	public void setPayment(Set<Payment> payment) {
		this.payment = payment;
	}
	public Contract getContract() {
		return Contract;
	}
	public void setContract(Contract contract) {
		Contract = contract;
	}
	
	public Date getRequestDate() {
		return RequestDate;
	}

	public void setRequestDate(Date requestDate) {
		RequestDate = requestDate;
	}

	public Date getResponseDate() {
		return ResponseDate;
	}

	public void setResponseDate(Date responseDate) {
		ResponseDate = responseDate;
	}

	public Date getFinalDate() {
		return FinalDate;
	}

	public void setFinalDate(Date finalDate) {
		FinalDate = finalDate;
	}

	public Loans() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
