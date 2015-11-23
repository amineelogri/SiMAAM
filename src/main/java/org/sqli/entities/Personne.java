package org.sqli.entities;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Personne {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 @Column(name="idPersonne")
   private Long idPersonne;

   private String nom;

   private String prenom;
 
   private String login;
  
   private String password;
  
   private String email;

   private String poste;

public Personne() {
	super();
	// TODO Auto-generated constructor stub
}

public Personne(String nom, String prenom, String login, String password, String email, String poste) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.login = login;
	this.password = password;
	this.email = email;
	this.poste = poste;
}

public Long getIdPersonne() {
	return idPersonne;
}

public void setIdPersonne(Long idPersonne) {
	this.idPersonne = idPersonne;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPoste() {
	return poste;
}

public void setPoste(String poste) {
	this.poste = poste;
}
   
   

}