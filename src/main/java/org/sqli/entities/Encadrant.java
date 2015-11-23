package org.sqli.entities;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idPersonne")
public class Encadrant extends Personne {
  


public Encadrant() {
	super();
	// TODO Auto-generated constructor stub
}

public Encadrant(String nom, String prenom, String login, String password, String email, String poste) {
	super(nom, prenom, login, password, email, poste);
	// TODO Auto-generated constructor stub
}

 

}