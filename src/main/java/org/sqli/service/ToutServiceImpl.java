package org.sqli.service;

import org.springframework.transaction.annotation.Transactional;
import org.sqli.dao.IActionDAO;
import org.sqli.dao.IAdminDAO;
import org.sqli.dao.IAutoformationDAO;
import org.sqli.dao.IAvancementDAO;
import org.sqli.dao.IBapDAO;
import org.sqli.dao.IBipDAO;
import org.sqli.dao.ICollaborateurDAO;
import org.sqli.dao.IDetailFeedbackDAO;
import org.sqli.dao.IEncadrantDAO;
import org.sqli.dao.IFeedbackDAO;
import org.sqli.dao.IManagerDAO;
import org.sqli.dao.IObjectifDAO;
import org.sqli.dao.IPersonneDAO;
import org.sqli.dao.IProjetDAO;
import org.sqli.dao.IQualificationDAO;
import org.sqli.dao.IThemeDAO;
import org.sqli.entities.Personne;

@Transactional
public class ToutServiceImpl implements IToutService{
	private IPersonneDAO daoPersonne;
	private IActionDAO daoAction;
	private IAdminDAO daoAdmin;
	private IAutoformationDAO daoAutoformation;
	private IAvancementDAO daoAvancement;
	private IBapDAO daoBap;
	private IBipDAO daoBip;
	private ICollaborateurDAO daoCollaborateur;
	private IDetailFeedbackDAO daoDetailFeedback;
	

	private IEncadrantDAO daoEncadrant;
	private IFeedbackDAO daoFeedback;
	private IManagerDAO daoManager;
	private IObjectifDAO daoObjectif;
	private IProjetDAO daoProjet;
	private IQualificationDAO daoQualification;
	private IThemeDAO daoTheme;

	

	public void setDaoAdmin(IAdminDAO daoAdmin) {
		this.daoAdmin = daoAdmin;
	}

	public void setDaoAutoformation(IAutoformationDAO daoAutoformation) {
		this.daoAutoformation = daoAutoformation;
	}

	public void setDaoAction(IActionDAO daoAction) {
		this.daoAction = daoAction;
	}

	public void setDaoAvancement(IAvancementDAO daoAvancement) {
		this.daoAvancement = daoAvancement;
	}

	public void setDaoBap(IBapDAO daoBap) {
		this.daoBap = daoBap;
	}

	public void setDaoBip(IBipDAO daoBip) {
		this.daoBip = daoBip;
	}

	public void setDaoCollaborateur(ICollaborateurDAO daoCollaborateur) {
		this.daoCollaborateur = daoCollaborateur;
	}

	

	public void setDaoDetailFeedback(IDetailFeedbackDAO daoDetailFeedback) {
		this.daoDetailFeedback = daoDetailFeedback;
	}
	public void setDaoEncadrant(IEncadrantDAO daoEncadrant) {
		this.daoEncadrant = daoEncadrant;
	}

	public void setDaoFeedback(IFeedbackDAO daoFeedback) {
		this.daoFeedback = daoFeedback;
	}

	public void setDaoManager(IManagerDAO daoManager) {
		this.daoManager = daoManager;
	}

	public void setDaoObjectif(IObjectifDAO daoObjectif) {
		this.daoObjectif = daoObjectif;
	}

	public void setDaoProjet(IProjetDAO daoProjet) {
		this.daoProjet = daoProjet;
	}

	public void setDaoQualification(IQualificationDAO daoQualification) {
		this.daoQualification = daoQualification;
	}

	public void setDaoTheme(IThemeDAO daoTheme) {
		this.daoTheme = daoTheme;
	}

	public void setDaoPersonne(IPersonneDAO daoPersonne) {
		this.daoPersonne = daoPersonne;
	}

	public void addPersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	public void addAction(String description) {
		// TODO Auto-generated method stub
		
	}

	public void addAdmin() {
		// TODO Auto-generated method stub
		
	}

	public void addAutoformation() {
		// TODO Auto-generated method stub
		
	}

	public void addAvancement() {
		// TODO Auto-generated method stub
		
	}

	public void addBap() {
		// TODO Auto-generated method stub
		
	}

	public void addBip() {
		// TODO Auto-generated method stub
		
	}

	public void addCollaborateur() {
		// TODO Auto-generated method stub
		
	}

	public void addDetailFeedback() {
		// TODO Auto-generated method stub
		
	}

	public void addEncadran() {
		// TODO Auto-generated method stub
		
	}

	public void addFeedback() {
		// TODO Auto-generated method stub
		
	}

	public void addManagerRH() {
		// TODO Auto-generated method stub
		
	}

	public void addObjectif() {
		// TODO Auto-generated method stub
		
	}

	public void addProjet() {
		// TODO Auto-generated method stub
		
	}

	public void addQualification() {
		// TODO Auto-generated method stub
		
	}

	public void addTheme() {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
