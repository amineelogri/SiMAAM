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

   private int poind;

public Qualification() {
	super();
	// TODO Auto-generated constructor stub
}

public Qualification(String valeurQualification, int poind) {
	super();
	this.valeurQualification = valeurQualification;
	this.poind = poind;
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

public int getPoind() {
	return poind;
}

public void setPoind(int poind) {
	this.poind = poind;
}


   
   

}