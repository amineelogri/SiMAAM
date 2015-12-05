package org.sqli.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.sqli.dao.ICollaborateurDAO;

import org.sqli.entities.Collaborateur;

@Transactional
public class ToutServiceImpl implements IToutService{
	private ICollaborateurDAO daoCollaborateur;
		
	public List<Collaborateur> listCollaborateurManager(Long idManager) {
		
		return daoCollaborateur.listCollaborateurManager(idManager);
		
	}

	public void setDaoCollaborateur(ICollaborateurDAO daoCollaborateur) {
		this.daoCollaborateur = daoCollaborateur;
	}



}
