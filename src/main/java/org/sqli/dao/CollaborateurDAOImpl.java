package org.sqli.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sqli.entities.Bap;
import org.sqli.entities.Collaborateur;
import org.sqli.entities.Description;
import org.sqli.entities.DetailFeedBack;
import org.sqli.entities.Encadrant;
import org.sqli.entities.Feedback;
import org.sqli.entities.Objectif;
import org.sqli.entities.Personne;
import org.sqli.entities.Projet;

public class CollaborateurDAOImpl implements ICollaborateurDAO {
	@PersistenceContext
    private EntityManager em;

	public void addCollaborateur() {
		// TODO Auto-generated method stub
		
	}

	public List<Collaborateur> listCollaborateurManager(Long idManager) {
		
		Query req=em.createQuery("select c from Collaborateur c where c.managerRH.idPersonne = :idManager");
		req.setParameter("idManager", idManager);
		List <Collaborateur> listCollaborateur=req.getResultList();
		if(listCollaborateur.isEmpty()) return null;
		else return listCollaborateur;
	}

	public void  modeAccesObjectif(String Matricule, boolean accesHistoriqueObjectif) {
		System.out.println("****");
		Query req=em.createQuery("update Collaborateur c SET c.accesHistoriqueObjectif = :accesHistoriqueObjectif where c.matricule = :Matricule");
		
		req.setParameter("Matricule", Matricule);
		req.setParameter("accesHistoriqueObjectif", accesHistoriqueObjectif);
		int updateCount = req.executeUpdate();
		System.out.println("****"+updateCount);
	}

	public List<Feedback> historiqueFeedback(String Matricule) {
		//******* selectionner idcollaborateur selon sa matricule
		
		Long idPersonne=(long) 0;
	    Query req1=em.createQuery("select c from Collaborateur c where c.matricule = :Matricule");
		req1.setParameter("Matricule", Matricule);
	    List<Collaborateur> listCollaborateur=req1.getResultList();
	    
	    if(listCollaborateur.isEmpty()) System.out.println("liste des collaborateur est vide");
	    else   idPersonne = listCollaborateur.get(0).getIdPersonne();
		
	
	  //******* selectionner les feedbacks d'un collaborateur pr véréfier est ce que y en a au moins un histrorique de feedback
		Query req=em.createQuery("from Feedback f where f.collaborateur.idPersonne=:idPersonne and f.historiqueFeed=:existance");
		req.setParameter("idPersonne", idPersonne);
		req.setParameter("existance", true);
		List<Feedback> listFeedback=req.getResultList();

		if(listFeedback.isEmpty())  return null;
		
		
		else return listFeedback ;
		
	}

	public Personne InfoCollaborateur(Long idPersonne) {
		
		Query req=em.createQuery("from Personne p where p.idPersonne=:idPersonne");
		req.setParameter("idPersonne", idPersonne);
		List<Personne> listInfoCollaborateur=req.getResultList();
		if(listInfoCollaborateur.isEmpty()) return null;
		else return listInfoCollaborateur.get(0);
	 
	 }
	
	public List<DetailFeedBack> detailFeedback(Long idFeedback){
		//System.out.println(idFeedback);
		Query req=em.createQuery("from DetailFeedBack d where d.feedback.idFeedback=:idFeedback");
		req.setParameter("idFeedback", idFeedback);
		
		List<DetailFeedBack> detailFeedback=req.getResultList();
		
		if(detailFeedback.isEmpty()) { System.out.println("vide"); return null;}
		else return detailFeedback;
	}

	public List<Objectif> listObjectif(String Matricule){
		
		
		Long idPersonne=(long) 0;
	    Query req1=em.createQuery("select c from Collaborateur c where c.matricule = :Matricule");
		req1.setParameter("Matricule", Matricule);
	    List<Collaborateur> listCollaborateur=req1.getResultList();
	    
	    if(listCollaborateur.isEmpty()) System.out.println("liste des collaborateur est vide");
	    else   idPersonne = listCollaborateur.get(0).getIdPersonne();
	    
	    System.out.println("voici id "+idPersonne);
		
		Query req=em.createQuery("from Objectif f  where f.collaborateur.idPersonne=:idPersonne and f.historiqueObjectif=:existance");
		req.setParameter("idPersonne", idPersonne);                                                  
		req.setParameter("existance", true);
		System.out.println("kikkkkkkkkk");
		List<Objectif> listObjectif=req.getResultList();
		if(listObjectif.isEmpty()) { System.out.println("liste objectif est vide");
			return null;
		}
		else return listObjectif;
	}
	
	public List<Description> listDescription(Long idObjectif){
		System.out.println("* ");
		Query req=em.createQuery("from Description d where d.objectif.idObjectif = :idObjectif");
	req.setParameter("idObjectif", idObjectif);
		System.out.println("* *");
		List<Description> listDescription=req.getResultList();
		if(listDescription.isEmpty()) {
			System.out.println("la liste description est vide");
			return null;
		}
		else return listDescription;
		
	}
	
}
