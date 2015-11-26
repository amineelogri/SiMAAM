package org.sqli.dao;


import org.sqli.entities.Collaborateur;



public interface ICollaborateurDAO {
	public void addCollaborateur();
	public Collaborateur getCollaborateur(Long idPersonne);
	public void deteteCollaborateur(Long idPersonne);
	public void updateCollaborateur(Collaborateur col);
}
