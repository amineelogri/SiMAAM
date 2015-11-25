package org.sqli.entities;
/***********************************************************************
 * Module:  Bip.java
 * Author:  Majda
 * Purpose: Defines the Class Bip
 ***********************************************************************/

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Bip {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="idBip")
   private long idBip;
  
   private Date date;
   
   @ManyToOne
   @JoinColumn(name="idManagerRH")
   private ManagerRH managerRH;
 
   
   @ManyToOne
   @JoinColumn(name="idCollaborateur")
   private Collaborateur collaborateur;

public Bip() {
	super();
	// TODO Auto-generated constructor stub
}

public Bip(Date date, ManagerRH managerRH, Collaborateur collaborateur) {
	super();
	this.date = date;
	this.managerRH = managerRH;
	this.collaborateur = collaborateur;
}

public long getIdBip() {
	return idBip;
}

public void setIdBip(long idBip) {
	this.idBip = idBip;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public ManagerRH getManagerRH() {
	return managerRH;
}

public void setManagerRH(ManagerRH managerRH) {
	this.managerRH = managerRH;
}

public Collaborateur getCollaborateur() {
	return collaborateur;
}

public void setCollaborateur(Collaborateur collaborateur) {
	this.collaborateur = collaborateur;
}
   
   

}