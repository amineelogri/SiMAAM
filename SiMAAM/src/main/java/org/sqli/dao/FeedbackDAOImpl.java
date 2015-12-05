package org.sqli.dao;

import org.sqli.entities.Feedback;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class FeedbackDAOImpl implements IFeedbackDAO{

    @PersistenceContext
    private EntityManager em;
	public void addFeedback() {
		// TODO Auto-generated method stub
		
	}

	public List<Feedback> listFeedbacks(Long id) {
		
		Query req= em.createQuery("select fb from Feedback fb where fb.collaborateur.idPersonne=:x and fb.validation=:true");
		req.setParameter("x",id);
		req.setParameter("true", true);
		List <Feedback> listFeedbacks=req.getResultList();
		if(listFeedbacks.isEmpty()) return null;
		else return req.getResultList();
	}

}
