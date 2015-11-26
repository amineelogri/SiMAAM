package org.sqli.service;

import org.sqli.entities.Collaborateur;
import org.sqli.entities.Personne;

public interface IToutService {
	
	public void addCollaborateur();
	public Collaborateur getCollaborateur(Long idPersonne);
	public void deteteCollaborateur(Long idPersonne);
	public void updateCollaborateur(Collaborateur col);
	
}
