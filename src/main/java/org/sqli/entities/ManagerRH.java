package org.sqli.entities;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idPersonne")
public class ManagerRH extends Personne {
   
   

public ManagerRH() {
	super();
	// TODO Auto-generated constructor stub
}

public ManagerRH(String nom, String prenom, String login, String password, String email, String poste) {
	super(nom, prenom, login, password, email, poste);
	// TODO Auto-generated constructor stub
}

public ManagerRH(Long id,String nom, String prenom, String login, String password, String email, String poste) {
	super(nom, prenom, login, password, email, poste);
	// TODO Auto-generated constructor stub
}

   

}