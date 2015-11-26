package org.sqli.entities;
/***********************************************************************
 * Module:  Action.java
 * Author:  Majda
 * Purpose: Defines the Class Action
 ***********************************************************************/

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Action {
 @Id
 @PrimaryKeyJoinColumn(name="idPersonne")
 @Column(name="idAction")
   private long idAction;
 
   private String description;
   
   @ManyToOne
   @JoinColumn(name="idBipAction")
   private Bip bip;


public Action() {
	super();
	// TODO Auto-generated constructor stub
}


public Action(String description, Bip bip) {
	super();
	this.description = description;
	this.bip = bip;
}


public long getIdAction() {
	return idAction;
}


public void setIdAction(long idAction) {
	this.idAction = idAction;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public Bip getBip() {
	return bip;
}


public void setBip(Bip bip) {
	this.bip = bip;
}
   
   

}