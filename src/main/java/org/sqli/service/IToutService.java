package org.sqli.service;

import java.util.List;

import org.sqli.entities.Collaborateur;
import org.sqli.entities.Personne;

public interface IToutService {
	
	public void addAction(String description);
	public void addAdmin();
	public void addAutoformation();
	public void addAvancement();
	public void addBap();
	public void addBip();
	public void addCollaborateur();
	public void addDetailFeedback();
	public void addEncadran();
	public void addFeedback();
	public void addManagerRH();
	public void addObjectif();
	public void addPersonne(Personne p);
	public void addProjet();
	public void addQualification();
	public void addTheme();
	
	
	
	
}
