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
import org.sqli.entities.Collaborateur;
import org.sqli.entities.Personne;

@Transactional
public class ToutServiceImpl implements IToutService{
	private ICollaborateurDAO dao;
		
	public void setDao(ICollaborateurDAO dao) {
		this.dao = dao;
	}

	public void addCollaborateur() {
		dao.addCollaborateur();
		
	}
	
	public Collaborateur getCollaborateur(Long idPersonne) {
		return dao.getCollaborateur(idPersonne);
	}

	public void deteteCollaborateur(Long idPersonne) {
		dao.deteteCollaborateur(idPersonne);
		
	}
 
	public void updateCollaborateur(Collaborateur col) {
		dao.updateCollaborateur(col);
		
	}

	
	
	

	

}
