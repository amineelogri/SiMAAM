package org.sqli.entities;
/***********************************************************************
 * Module:  Autoformation.java
 * Author:  Majda
 * Purpose: Defines the Class Autoformation
 ***********************************************************************/

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Autoformation {
  @Id
  @Column(name="idAutoformation")
   private long idAutoformation;
   
   private String objectifs;
 
   private String duree;

   private String moyenMD;
  
   private String moyenMesure;
   
   @ManyToOne
   @JoinColumn(name="idBipAutoformation")
   private Bip bip;


public Autoformation() {
	super();
	// TODO Auto-generated constructor stub
}


public Autoformation(String objectifs, String duree, String moyenMD, String moyenMesure, Bip bip) {
	super();
	this.objectifs = objectifs;
	this.duree = duree;
	this.moyenMD = moyenMD;
	this.moyenMesure = moyenMesure;
	this.bip = bip;
}


public long getIdAutoformation() {
	return idAutoformation;
}


public void setIdAutoformation(long idAutoformation) {
	this.idAutoformation = idAutoformation;
}


public String getObjectifs() {
	return objectifs;
}


public void setObjectifs(String objectifs) {
	this.objectifs = objectifs;
}


public String getDuree() {
	return duree;
}


public void setDuree(String duree) {
	this.duree = duree;
}


public String getMoyenMD() {
	return moyenMD;
}


public void setMoyenMD(String moyenMD) {
	this.moyenMD = moyenMD;
}


public String getMoyenMesure() {
	return moyenMesure;
}


public void setMoyenMesure(String moyenMesure) {
	this.moyenMesure = moyenMesure;
}


public Bip getBip() {
	return bip;
}


public void setBip(Bip bip) {
	this.bip = bip;
}
   

}