package org.sqli.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.sqli.entities.*;
import org.sqli.service.IServiceManager;

import com.opensymphony.xwork2.ActionSupport;

public class afficherHistoriqueAction extends ActionSupport implements SessionAware{
	@Autowired
	
	private Map<String, Object> session;
	private String choixHistorique;
	private IServiceManager service;
	
	//Data populated
	private String Matricule;
	private List<Feedback> listFeedback;
    private String etatHistorique;
	private Personne personne;
	private List<List<DetailFeedBack>> toutFeedback=new ArrayList<List<DetailFeedBack>>();
	private List<Objectif> listObjectif;
	private List<List<Description>> listDescription=new ArrayList<List<Description>>();
	//private Objectif objectif;
	
	
	
	
	
	
   

	




	public String getChoixHistorique() {
		return choixHistorique;
	}


	


	public List<List<Description>> getListDescription() {
		return listDescription;
	}





	public void setListDescription(List<List<Description>> listDescription) {
		this.listDescription = listDescription;
	}





	public void setChoixHistorique(String choixHistorique) {
		this.choixHistorique = choixHistorique;
	}




	public List<Objectif> getListObjectif() {
		return listObjectif;
	}


	public void setListObjectif(List<Objectif> listObjectif) {
		this.listObjectif = listObjectif;
	}


	public String getMatricule() {
		return Matricule;
	}


	public void setMatricule(String matricule) {
		Matricule = matricule;
	}


	public String getEtatHistorique() {
		return etatHistorique;
	}


	public void setEtatHistorique(String etatHistorique) {
		this.etatHistorique = etatHistorique;
	}


	public Personne getPersonne() {
		return personne;
	}


	public void setPersonne(Personne personne) {
		this.personne = personne;
	}


	public List<List<DetailFeedBack>> getToutFeedback() {
		return toutFeedback;
	}


	public void setToutFeedback(List<List<DetailFeedBack>> toutFeedback) {
		this.toutFeedback = toutFeedback;
	}


	public List<Feedback> getListFeedback() {
		return listFeedback;
	};


	public void setListFeedback(List<Feedback> listFeedback) {
		this.listFeedback = listFeedback;
	}


	public IServiceManager getService() {
		return service;
	}


	public void setService(IServiceManager service) {
		this.service = service;
	}


	


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String execute(){
		
		choixHistorique=(String) session.get("consulterHistorique");
		Matricule=(String) session.get("Matricule");
	     
		//BAP
	//	if(choixHistorique.equals("BAP")) {System.out.println("**BAP");}
		
		//Objectif
				if(choixHistorique.equals("Objectif")) { 
					
					listObjectif=service.listObjectif(Matricule);
					if(listObjectif==null)  {
						etatHistorique="Historique des Objectifs est vide";
						System.out.println(etatHistorique);
					}
					else{
						System.out.println("pleiiin ");
						List<Description> SeulListDes;
						
						
						for(Objectif objectif : listObjectif){
							
							 SeulListDes=service.listDescription(objectif.getIdObjectif());
							if(SeulListDes!=null) {System.out.println("*** ");
								listDescription.add(SeulListDes);
							}
							 
							 
						}
						System.out.println("%%%% "+listDescription.get(0).get(0).getObjectif().getNombreRejet());
					}
				
				
				}
				
		//Feedback
		if(choixHistorique.equals("Feedback")) {
			listFeedback=service.historiqueFeedback(Matricule);
			
			if(listFeedback==null)  etatHistorique="Historique des Feedbacks est vide";

			//la liste des historiques n'est pas vide 
			else {
				
			
				Long idPersonne=listFeedback.get(0).getCollaborateur().getIdPersonne();
				 personne=service.InfoCollaborateur(idPersonne);
				for(Feedback feedback : listFeedback){
					List<DetailFeedBack> SeulListDF;
					System.out.println("IdFeedback :"+feedback.getIdFeedback());
					 SeulListDF=service.detailFeedback(feedback.getIdFeedback());
					if(SeulListDF!=null) toutFeedback.add(SeulListDF);
					 
					 
				}
               
		System.out.println("taille de la liste "+ toutFeedback.size());
               
				etatHistorique="Historique plein";
             
			}
		
	}
		return SUCCESS;		
}

}
