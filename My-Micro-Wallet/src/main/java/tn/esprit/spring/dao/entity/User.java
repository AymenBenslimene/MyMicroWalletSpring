package tn.esprit.spring.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table( name = "User1")
public class User implements Serializable{
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	
	@Column(name="User_ID")
	private long id; // Cl� primaire
	@Column(name="user_FNAME")
	private String fname;
	@Column(name="user_LNAME")
	private String lname;

}
