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
public class Feedback {
 
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idFeedback")
   private Long idFeedback;
  
   private Date dateDebutIntervention;
  
   private Date dateFinIntervention;
  
   private String roleCollaborateur;
 
   private long nombreJoursPrevu;
  
   private String commentaire2000;
   
   private boolean validation;

   private boolean historiqueFeed;
   
   @ManyToOne
   @JoinColumn(name="idBapFeedback")
   private Bap bap;
   
   @ManyToOne
   @JoinColumn(name="idProjet")
   private Projet projet;
 
   @ManyToOne
   @JoinColumn(name="idCollaborateur")
   private Collaborateur collaborateur;
   
   @ManyToOne
   @JoinColumn(name="idEncadrant")
   private Encadrant encadrant;
   

public Feedback(Date dateDebutIntervention, Date dateFinIntervention, String roleCollaborateur, long nombreJoursPrevu,
		String commentaire2000, boolean validation, boolean historiqueFeed, Bap bap, Projet projet,
		Collaborateur collaborateur, Encadrant encadrant) {
	super();
	this.dateDebutIntervention = dateDebutIntervention;
	this.dateFinIntervention = dateFinIntervention;
	this.roleCollaborateur = roleCollaborateur;
	this.nombreJoursPrevu = nombreJoursPrevu;
	this.commentaire2000 = commentaire2000;
	this.validation = validation;
	this.historiqueFeed = historiqueFeed;
	this.bap = bap;
	this.projet = projet;
	this.collaborateur = collaborateur;
	this.encadrant = encadrant;
}

public Long getIdFeedback() {
	return idFeedback;
}

public void setIdFeedback(Long idFeedback) {
	this.idFeedback = idFeedback;
}

public Date getDateDebutIntervention() {
	return dateDebutIntervention;
}

public void setDateDebutIntervention(Date dateDebutIntervention) {
	this.dateDebutIntervention = dateDebutIntervention;
}

public Date getDateFinIntervention() {
	return dateFinIntervention;
}

public void setDateFinIntervention(Date dateFinIntervention) {
	this.dateFinIntervention = dateFinIntervention;
}

public String getRoleCollaborateur() {
	return roleCollaborateur;
}

public void setRoleCollaborateur(String roleCollaborateur) {
	this.roleCollaborateur = roleCollaborateur;
}

public long getNombreJoursPrevu() {
	return nombreJoursPrevu;
}

public void setNombreJoursPrevu(long nombreJoursPrevu) {
	this.nombreJoursPrevu = nombreJoursPrevu;
}

public String getCommentaire2000() {
	return commentaire2000;
}

public void setCommentaire2000(String commentaire2000) {
	this.commentaire2000 = commentaire2000;
}

public boolean isValidation() {
	return validation;
}

public void setValidation(boolean validation) {
	this.validation = validation;
}

public boolean isHistoriqueFeed() {
	return historiqueFeed;
}

public void setHistoriqueFeed(boolean historiqueFeed) {
	this.historiqueFeed = historiqueFeed;
}

public Bap getBap() {
	return bap;
}

public void setBap(Bap bap) {
	this.bap = bap;
}

public Projet getProjet() {
	return projet;
}

public void setProjet(Projet projet) {
	this.projet = projet;
}

public Collaborateur getCollaborateur() {
	return collaborateur;
}

public void setCollaborateur(Collaborateur collaborateur) {
	this.collaborateur = collaborateur;
}

public Encadrant getEncadrant() {
	return encadrant;
}

public void setEncadrant(Encadrant encadrant) {
	this.encadrant = encadrant;
}
   
   

}