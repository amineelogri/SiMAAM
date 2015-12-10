package org.sqli.entities;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idPersonne")
public class Collaborateur extends Personne {

   

   private Date dateDebutEmbauche;

   private Date dateFinEmbauche;
  
   private String matricule;

   private boolean accesHistoriqueObjectif;
  
   private boolean accesHistoriqueFeedBack;
  
   
   @ManyToOne
   @JoinColumn(name="idManagerRH")
   private ManagerRH managerRH;
  


public Collaborateur() {
	super();
	// TODO Auto-generated constructor stub
}






public Collaborateur(Date dateDebutEmbauche, Date dateFinEmbauche, String matricule, boolean accesHistoriqueObjectif,
		boolean accesHistoriqueFeedBack, ManagerRH managerRH) {
	super();
	this.dateDebutEmbauche = dateDebutEmbauche;
	this.dateFinEmbauche = dateFinEmbauche;
	this.matricule = matricule;
	this.accesHistoriqueObjectif = accesHistoriqueObjectif;
	this.accesHistoriqueFeedBack = accesHistoriqueFeedBack;
	this.managerRH = managerRH;

}






public Date getDateDebutEmbauche() {
	return dateDebutEmbauche;
}


public void setDateDebutEmbauche(Date dateDebutEmbauche) {
	this.dateDebutEmbauche = dateDebutEmbauche;
}


public Date getDateFinEmbauche() {
	return dateFinEmbauche;
}


public void setDateFinEmbauche(Date dateFinEmbauche) {
	this.dateFinEmbauche = dateFinEmbauche;
}


public String getMatricule() {
	return matricule;
}


public void setMatricule(String matricule) {
	this.matricule = matricule;
}


public boolean getAccesHistoriqueObjectif() {
	return accesHistoriqueObjectif;
}


public void setAccesHistoriqueObjectif(boolean accesHistoriqueObjectif) {
	this.accesHistoriqueObjectif = accesHistoriqueObjectif;
}


public boolean isAccesHistoriqueFeedBack() {
	return accesHistoriqueFeedBack;
}


public void setAccesHistoriqueFeedBack(boolean accesHistoriqueFeedBack) {
	this.accesHistoriqueFeedBack = accesHistoriqueFeedBack;
}


public ManagerRH getManagerRH() {
	return managerRH;
}


public void setManagerRH(ManagerRH managerRH) {
	this.managerRH = managerRH;
}














   
   
   

}