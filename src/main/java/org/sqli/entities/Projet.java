package org.sqli.entities;


import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Projet {
@Id
@Column(name="idProjet")
private Long idProjet;

   private String nomProjet;

public Projet() {
	super();
	// TODO Auto-generated constructor stub
}

public Projet(String nomProjet) {
	super();
	this.nomProjet = nomProjet;
}

public Long getIdProjet() {
	return idProjet;
}

public void setIdProjet(Long idProjet) {
	this.idProjet = idProjet;
}

public String getNomProjet() {
	return nomProjet;
}

public void setNomProjet(String nomProjet) {
	this.nomProjet = nomProjet;
}
   

}