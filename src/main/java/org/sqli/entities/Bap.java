package org.sqli.entities;
/***********************************************************************
 * Module:  Bap.java
 * Author:  Majda
 * Purpose: Defines the Class Bap
 ***********************************************************************/

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bap {
   @Id
   @Column(name="idBap")
   private Long idBap;

   private Date date;

public Bap() {
	super();
	// TODO Auto-generated constructor stub
}

public Bap(Date date) {
	super();
	this.date = date;
}

public Long getIdBap() {
	return idBap;
}

public void setIdBap(Long idBap) {
	this.idBap = idBap;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}
   

}