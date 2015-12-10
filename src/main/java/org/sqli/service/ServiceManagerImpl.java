package org.sqli.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.sqli.dao.ICollaborateurDAO;
import org.sqli.entities.Collaborateur;
import org.sqli.entities.Description;
import org.sqli.entities.DetailFeedBack;
import org.sqli.entities.Feedback;
import org.sqli.entities.Objectif;
import org.sqli.entities.Personne;

@Transactional
public class ServiceManagerImpl implements IServiceManager{
	private ICollaborateurDAO daoCollaborateur;
	
	
	
	public ICollaborateurDAO getDaoCollaborateur() {
		return daoCollaborateur;
	}



	public void setDaoCollaborateur(ICollaborateurDAO daoCollaborateur) {
		this.daoCollaborateur = daoCollaborateur;
	}



public List<Collaborateur> listCollaborateurManager(Long idManager) {
		
		return daoCollaborateur.listCollaborateurManager(idManager);
		
	}



public void modeAccesObjectif(String Matricule, boolean accesHistoriqueObjectif) {
	System.out.println("service");
	daoCollaborateur.modeAccesObjectif(Matricule, accesHistoriqueObjectif);
	
	
}



public List<Feedback> historiqueFeedback(String Matricule) {
	
	return daoCollaborateur.historiqueFeedback(Matricule);
	
}



public Personne InfoCollaborateur(Long idPersonne) {
	
	Personne personne = daoCollaborateur.InfoCollaborateur(idPersonne);
	Personne p=new Personne(personne.getNom(),personne.getPrenom(),personne.getPoste());
	return p;
	
}



public List<DetailFeedBack> detailFeedback(Long idFeedback) {
	
	return  daoCollaborateur.detailFeedback(idFeedback);
}



public List<Objectif> listObjectif(String Matricule) {

	return  daoCollaborateur.listObjectif(Matricule);
}



public List<Description> listDescription(Long idObjectif) {
	
	return daoCollaborateur.listDescription(idObjectif);
}

}
