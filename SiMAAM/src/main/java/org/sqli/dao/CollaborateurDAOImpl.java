package org.sqli.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.sqli.entities.Collaborateur;

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

}
