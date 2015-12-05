package org.sqli.entities;
 
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idPersonne")
public class Admin extends Personne {
 

public Admin() {
	super();
	// TODO Auto-generated constructor stub
}

public Admin(String nom, String prenom, String login, String password, String email, String poste) {
	super(nom, prenom, login, password, email, poste);
	// TODO Auto-generated constructor stub
}




 
  

}