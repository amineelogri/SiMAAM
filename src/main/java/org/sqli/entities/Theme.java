package org.sqli.entities;


import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Theme {
 @Id
 @Column(name="idTheme")
   private Long idTheme;
  
   private String remarque1000;
   private String nomTheme;
   public Theme() {
		super();
		// TODO Auto-generated constructor stub
	}

public Theme(String remarque1000,String nomTheme) {
	super();
	this.remarque1000 = remarque1000;
	this.nomTheme=nomTheme;
}

public Long getIdTheme() {
	return idTheme;
}

public void setIdTheme(Long idTheme) {
	this.idTheme = idTheme;
}

public String getRemarque1000() {
	return remarque1000;
}

public void setRemarque1000(String remarque1000) {
	this.remarque1000 = remarque1000;
}

public String getNomTheme() {
	return nomTheme;
}

public void setNomTheme(String nomTheme) {
	this.nomTheme = nomTheme;
}



   
   
   

}