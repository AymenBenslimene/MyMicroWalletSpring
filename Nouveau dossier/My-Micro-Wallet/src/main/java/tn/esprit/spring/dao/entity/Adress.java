package tn.esprit.spring.dao.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Adress implements java.io.Serializable {
	  private String City; 
	  private String Street;
	  private int Home_number;
}
