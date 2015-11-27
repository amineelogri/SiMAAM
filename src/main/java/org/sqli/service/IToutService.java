package org.sqli.service;

import java.util.List;

import org.sqli.entities.Collaborateur;
import org.sqli.entities.Personne;

public interface IToutService {
	

	//****************************Collaborateur************************
	public List<Collaborateur> listCollaborateurManager(Long idManager);
	
	
}
