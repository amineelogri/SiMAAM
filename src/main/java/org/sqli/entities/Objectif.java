package org.sqli.entities;


import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Objectif {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="idObjectif")
   private Long idObjectif;
 
   private String titre;


 
   private String mesure;
  
   private String poid;
  
   private long noteFinale;
 
   private String resultat;
 
   private boolean rejetResultat;
  
   private boolean acces;
   
   private String etat;
 
   private int nombreRejet;
 
   private boolean historiqueObjectif;

   
   
  @ManyToOne
  @JoinColumn(name="idBapObjectif")
   private Bap bap;
 
  @ManyToOne
  @JoinColumn(name="idCollaborateur")
   private Collaborateur collaborateur;

public Objectif() {
	super();
	// TODO Auto-generated constructor stub
}

public Objectif(String titre, String mesure, String poid, long noteFinale, String resultat,
		boolean rejetResultat, boolean acces, String etat, int nombreRejet, boolean historiqueObjectif,
		 Bap bap, Collaborateur collaborateur) {
	super();
	this.titre = titre;
	
	this.mesure = mesure;
	this.poid = poid;
	this.noteFinale = noteFinale;
	this.resultat = resultat;
	this.rejetResultat = rejetResultat;
	this.acces = acces;
	this.etat = etat;
	this.nombreRejet = nombreRejet;
	this.historiqueObjectif = historiqueObjectif;

	this.bap = bap;
	this.collaborateur = collaborateur;
}

public Long getIdObjectif() {
	return idObjectif;
}

public void setIdObjectif(Long idObjectif) {
	this.idObjectif = idObjectif;
}

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}



public String getMesure() {
	return mesure;
}

public void setMesure(String mesure) {
	this.mesure = mesure;
}

public String getPoid() {
	return poid;
}

public void setPoid(String poid) {
	this.poid = poid;
}

public long getNoteFinale() {
	return noteFinale;
}

public void setNoteFinale(long noteFinale) {
	this.noteFinale = noteFinale;
}

public String getResultat() {
	return resultat;
}

public void setResultat(String resultat) {
	this.resultat = resultat;
}

public boolean isRejetResultat() {
	return rejetResultat;
}

public void setRejetResultat(boolean rejetResultat) {
	this.rejetResultat = rejetResultat;
}

public boolean isAcces() {
	return acces;
}

public void setAcces(boolean acces) {
	this.acces = acces;
}

public String getEtat() {
	return etat;
}

public void setEtat(String etat) {
	this.etat = etat;
}

public int getNombreRejet() {
	return nombreRejet;
}

public void setNombreRejet(int nombreRejet) {
	this.nombreRejet = nombreRejet;
}

public boolean isHistoriqueObjectif() {
	return historiqueObjectif;
}

public void setHistoriqueObjectif(boolean historiqueObjectif) {
	this.historiqueObjectif = historiqueObjectif;
}



public Bap getBap() {
	return bap;
}

public void setBap(Bap bap) {
	this.bap = bap;
}

public Collaborateur getCollaborateur() {
	return collaborateur;
}

public void setCollaborateur(Collaborateur collaborateur) {
	this.collaborateur = collaborateur;
}
   
   

}