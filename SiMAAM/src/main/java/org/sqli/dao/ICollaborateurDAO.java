package org.sqli.dao;
import java.util.List;

import org.sqli.entities.Collaborateur;



public interface ICollaborateurDAO {
public void addCollaborateur();
public List<Collaborateur> listCollaborateurManager(Long idManager);
}
