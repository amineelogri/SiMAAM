package org.sqli.entities;


import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Qualification {
 @Id
 @Column(name="idQualification")
   private Long idQualification;
  
   private String valeurQualification;

   private int poid;

public Qualification() {
	super();
	// TODO Auto-generated constructor stub
}

public Qualification(String valeurQualification, int poid) {
	super();
	this.valeurQualification = valeurQualification;
	this.poid = poid;
}

public Long getIdQualification() {
	return idQualification;
}

public void setIdQualification(Long idQualification) {
	this.idQualification = idQualification;
}

public String getValeurQualification() {
	return valeurQualification;
}

public void setValeurQualification(String valeurQualification) {
	this.valeurQualification = valeurQualification;
}

public int getPoid() {
	return poid;
}

public void setPoid(int poid) {
	this.poid = poid;
}


   
   

}