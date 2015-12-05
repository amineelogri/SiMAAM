package org.sqli.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sqli.dao.IFeedbackDAO;
import org.sqli.entities.Feedback;


@Transactional
@Service
public class CollaborateurServiceImpl implements ICollaborateurService{
	@Autowired
	private IFeedbackDAO daoFB;	
	
	public IFeedbackDAO getDao() {
		return daoFB;
	}

	public void setDaoFB(IFeedbackDAO dao) {
		this.daoFB = dao;
	}

	public List<Feedback> listFeedbacks(Long id) {
		
		return daoFB.listFeedbacks(id);
	}

	
	

	

}
