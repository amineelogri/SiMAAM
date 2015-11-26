package org.sqli.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.sqli.entities.Collaborateur;

public class CollaborateurDAOImpl implements ICollaborateurDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void addCollaborateur(Collaborateur col) {
		em.persist(col);
		
	}

	public Collaborateur getCollaborateur(Long idPersonne) {
		return em.find(Collaborateur.class, idPersonne);
		
	}
	
	public void deteteCollaborateur(Long idPersonne) {
		Collaborateur col=getCollaborateur(idPersonne);
		em.remove(col);
	}

	public void updateCollaborateur(Collaborateur col) {
		em.merge(col);
		
	}

	public void addCollaborateur() {
		// TODO Auto-generated method stub
		
	}

}
