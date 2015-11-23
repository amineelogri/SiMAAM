package org.sqli.entities;
/***********************************************************************
 * Module:  Avancement.java
 * Author:  Majda
 * Purpose: Defines the Class Avancement
 ***********************************************************************/

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Avancement {
 @Id
 @Column(name="idAvancement")
   private int idAvancement;
 
   private String resultat;
   
  @ManyToOne
  @JoinColumn(name="idObjectifAvancement")
   public Objectif objectif;
  
  
  @ManyToOne
  @JoinColumn(name="idBipAvancement")
   private Bip bip;

public Avancement() {
	super();
	// TODO Auto-generated constructor stub
}


public Avancement(String resultat, Objectif objectif, Bip bip) {
	super();
	this.resultat = resultat;
	this.objectif = objectif;
	this.bip = bip;
}


public int getIdAvancement() {
	return idAvancement;
}

public void setIdAvancement(int idAvancement) {
	this.idAvancement = idAvancement;
}

public String getResultat() {
	return resultat;
}

public void setResultat(String resultat) {
	this.resultat = resultat;
}

public Objectif getObjectif() {
	return objectif;
}

public void setObjectif(Objectif objectif) {
	this.objectif = objectif;
}

public Bip getBip() {
	return bip;
}

public void setBip(Bip bip) {
	this.bip = bip;
}
   

}