package org.sqli.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Description {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="idDescription")	
private Long idDescription;
private String description;
private String responsableMesure;

@ManyToOne
@JoinColumn(name="idObjectif")
private Objectif objectif;




public Description() {
	super();
	// TODO Auto-generated constructor stub
}
public Description(String description, String responsableMesure, Objectif objectif) {
	super();
	description = description;
	this.responsableMesure = responsableMesure;
	this.objectif = objectif;
}
public Long getIdDescription() {
	return idDescription;
}
public void setIdDescription(Long idDescription) {
	this.idDescription = idDescription;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	description = description;
}
public String getResponsableMesure() {
	return responsableMesure;
}
public void setResponsableMesure(String responsableMesure) {
	this.responsableMesure = responsableMesure;
}
public Objectif getObjectif() {
	return objectif;
}
public void setObjectif(Objectif objectif) {
	this.objectif = objectif;
}


}
