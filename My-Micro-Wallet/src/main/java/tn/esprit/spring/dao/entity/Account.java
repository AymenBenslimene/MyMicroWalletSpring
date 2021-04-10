package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Account implements Serializable{
	
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int Account_ID;
	
	private static int Account_Number;
	
	@Temporal (TemporalType.DATE)
	private Date Creation_Date;
	
	@Temporal (TemporalType.DATE)
	private Date expire; 
	private double Balance=0.0;
	private double Min_Balance;
	private double Max_Balance;
	
	private double bank_verification_number;
	private static double Number; 
	private double RIB; 
	
	//private Login login ; 
	// private Password password; 
	// private set Activities; 
	
	//many to one with client
	//@ManyToOne(cascade = CascadeType.ALL)
	
	
	/*@ManyToOne
	Client client;*/
	// one to many uni with transaction 
	
	// one to many uni with loans 
		@OneToMany(cascade = CascadeType.ALL)
		private Set<Loans> loans;
		
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Transaction> transaction;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Account_ID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Account_ID != other.Account_ID)
			return false;
		return true;
	}
	public int getAccount_ID() {
		return Account_ID;
	}
	public void setAccount_ID(int account_ID) {
		Account_ID = account_ID;
	}
	public static int getAccount_Number() {
		return Account_Number;
	}
	public static void setAccount_Number(int account_Number) {
		Account_Number = account_Number;
	}
	public Date getCreation_Date() {
		return Creation_Date;
	}
	public void setCreation_Date(Date creation_Date) {
		Creation_Date = creation_Date;
	}
	public Date getExpire() {
		return expire;
	}
	public void setExpire(Date expire) {
		this.expire = expire;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public double getMin_Balance() {
		return Min_Balance;
	}
	public void setMin_Balance(double min_Balance) {
		Min_Balance = min_Balance;
	}
	public double getMax_Balance() {
		return Max_Balance;
	}
	public void setMax_Balance(double max_Balance) {
		Max_Balance = max_Balance;
	}
	public double getBank_verification_number() {
		return bank_verification_number;
	}
	public void setBank_verification_number(double bank_verification_number) {
		this.bank_verification_number = bank_verification_number;
	}
	public static double getNumber() {
		return Number;
	}
	public static void setNumber(double number) {
		Number = number;
	}
	public double getRIB() {
		return RIB;
	}
	public void setRIB(double rIB) {
		RIB = rIB;
	}
	public Set<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(Set<Transaction> transaction) {
		this.transaction = transaction;
	}
	public Set<Loans> getLoans() {
		return loans;
	}
	public void setLoans(Set<Loans> loans) {
		this.loans = loans;
	}
	
	
	
	
}
