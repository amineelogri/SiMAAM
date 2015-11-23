package org.sqli.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.sqli.entities.Personne;

public class PersonneDAOImpl implements IPersonneDAO{
	@PersistenceContext
	 private EntityManager em;
	public void addPersonne(Personne p) {
		em.persist(p);
		
	}

}
