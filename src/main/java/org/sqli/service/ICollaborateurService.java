package org.sqli.service;

import java.util.List;

import org.sqli.entities.Collaborateur;
import org.sqli.entities.Feedback;
import org.sqli.entities.Personne;

public interface ICollaborateurService {
	
	public List<Feedback> listFeedbacks(Long id);
	
}
