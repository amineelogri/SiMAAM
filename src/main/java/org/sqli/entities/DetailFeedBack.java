package org.sqli.entities;


import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetailFeedBack {
 @Id
 @Column(name="idDetailFeedBack")
   private Long idDetailFeedBack;
   
  @ManyToOne
  @JoinColumn(name="idFeedback")
   private Feedback feedback;
 
  @ManyToOne
  @JoinColumn(name="idTheme")
   private Theme theme;
  
  
  @ManyToOne
  @JoinColumn(name="idQualification")
   private Qualification qualification;
  
  

public DetailFeedBack() {
	super();
	// TODO Auto-generated constructor stub
}

public DetailFeedBack(Feedback feedback, Theme theme, Qualification qualification) {
	super();
	this.feedback = feedback;
	this.theme = theme;
	this.qualification = qualification;
}

public Long getIdDetailFeedBack() {
	return idDetailFeedBack;
}

public void setIdDetailFeedBack(Long idDetailFeedBack) {
	this.idDetailFeedBack = idDetailFeedBack;
}

public Feedback getFeedback() {
	return feedback;
}

public void setFeedback(Feedback feedback) {
	this.feedback = feedback;
}

public Theme getTheme() {
	return theme;
}

public void setTheme(Theme theme) {
	this.theme = theme;
}

public Qualification getQualification() {
	return qualification;
}

public void setQualification(Qualification qualification) {
	this.qualification = qualification;
}
   
   

}