package org.sqli.dao;
import java.util.List;

import org.sqli.entities.Collaborateur;

import org.sqli.entities.Description;
import org.sqli.entities.DetailFeedBack;
import org.sqli.entities.Feedback;
import org.sqli.entities.Objectif;
import org.sqli.entities.Personne;;


public interface ICollaborateurDAO {
public void addCollaborateur();
public List<Collaborateur> listCollaborateurManager(Long idManager);
public void  modeAccesObjectif(String Matricule, boolean accesHistoriqueObjectif);
public List<Feedback> historiqueFeedback(String Matricule);
public  Personne InfoCollaborateur(Long idPersonne);
public List<DetailFeedBack> detailFeedback(Long idFeedback);
public List<Objectif> listObjectif(String Matricule);
public List<Description> listDescription(Long idObjectif);
}
