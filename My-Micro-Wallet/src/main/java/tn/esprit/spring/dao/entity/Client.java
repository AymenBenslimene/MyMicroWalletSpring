package tn.esprit.spring.dao.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Client implements Serializable {
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int CIN;
	
	
	private String Name;
	
	private String Surname; 
	
	@Temporal (TemporalType.DATE)
	private Date Birth_Date;
	
	//private Email Email;
	
	public enum Sex{
		Homme,Femme,Autre
	}
	@Enumerated(EnumType.STRING)
	private Sex Sex;
	
	public enum Marital_Status{
		Married,Single,Complicated
	}
	@Enumerated(EnumType.STRING)
	private Marital_Status Marital_Status;
	private Job Job_Title ;

	private int Phone_Number;
	
	private double Salary;
	/*@Embedded
	private Adress Residential_Adress; */
	@Embedded
	private Adress Business_Adress; 
	
	private double Score ;
	
	//private Password password ;
	//private Category category; 
	//private Reputation reputation
	
	//private Set Promotional_Code; 
	
	
	//private Login login; 
	//private Utility Bills ; 
	// private Picture Cin Picture
	// private Picture Passport
	
	// one to many unidirectionnelle Dialogue_Room
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Dialogue_Room> dialogue_room;
	
	// one to many bidirectionnelle Account

	/*@OneToMany(cascade = CascadeType.ALL, mappedBy="Account")
	private Account account;*/
	
	// one to many uni Claim
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Claims> claim;

	public int getCIN() {
		return CIN;
	}

	public void setCIN(int cIN) {
		CIN = cIN;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public Date getBirth_Date() {
		return Birth_Date;
	}

	public void setBirth_Date(Date birth_Date) {
		Birth_Date = birth_Date;
	}

	public Sex getSex() {
		return Sex;
	}

	public void setSex(Sex sex) {
		Sex = sex;
	}

	public Marital_Status getMarital_Status() {
		return Marital_Status;
	}

	public void setMarital_Status(Marital_Status marital_Status) {
		Marital_Status = marital_Status;
	}

	public Job getJob_Title() {
		return Job_Title;
	}

	public void setJob_Title(Job job_Title) {
		Job_Title = job_Title;
	}

	public int getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(int phone_Number) {
		Phone_Number = phone_Number;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public Adress getBusiness_Adress() {
		return Business_Adress;
	}

	public void setBusiness_Adress(Adress business_Adress) {
		Business_Adress = business_Adress;
	}

	public double getScore() {
		return Score;
	}

	public void setScore(double score) {
		Score = score;
	}

	public Set<Dialogue_Room> getDialogue_room() {
		return dialogue_room;
	}

	public void setDialogue_room(Set<Dialogue_Room> dialogue_room) {
		this.dialogue_room = dialogue_room;
	}

	public Set<Claims> getClaim() {
		return claim;
	}

	public void setClaim(Set<Claims> claim) {
		this.claim = claim;
	}
	
	
	
	
	
	
}
