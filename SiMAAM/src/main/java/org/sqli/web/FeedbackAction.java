package org.sqli.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.sqli.entities.Feedback;
import org.sqli.service.ICollaborateurService;

import com.opensymphony.xwork2.ActionSupport;


public class FeedbackAction extends ActionSupport{
    @Autowired
    private ICollaborateurService serviceFeedback;
    private Long idFeedback;
    
    private Date dateDebutIntervention;
   
    public ICollaborateurService getServiceFeedback() {
		return serviceFeedback;
	}


	public void setServiceFeedback(ICollaborateurService serviceFeedback) {
		this.serviceFeedback = serviceFeedback;
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


	private Date dateFinIntervention;
   
    private String roleCollaborateur;
  
    private long nombreJoursPrevu;
   
    private String commentaire2000;
    
    private boolean validation;

    private boolean historiqueFeed;
	
    private List<Feedback> feedbacks;
    
	
	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}


	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}


	public String execute(){
		 long id = 3;
		 feedbacks = serviceFeedback.listFeedbacks(id);
    	 return SUCCESS;
     }
}
