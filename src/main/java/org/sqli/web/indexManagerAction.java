package org.sqli.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.sqli.entities.Collaborateur;
import org.sqli.entities.ManagerRH;
import org.sqli.service.IServiceManager;


import com.opensymphony.xwork2.ActionSupport;

public class indexManagerAction extends ActionSupport implements SessionAware{
	@Autowired	
	private IServiceManager service;
	private List<Collaborateur> listCollaborateur;
	
	private Map<String,Object> session;
	Long idManager=(long) 1;
	private List<String> listMatricule = new ArrayList<String>();
	private ManagerRH managerrh=new ManagerRH(idManager,"ogri","amine","amine123","amine1234567890","amine.ogri@gmail.com","manager");
	
	
	
	public Map<String, Object> getSession() {
		return session;
	}
	
	
	public void setSession(Map session) {
		this.session=session;
		
	}
public List<String> getListMatricule() {
		return listMatricule;
	}

	public void setListMatricule(List<String> listMatricule) {
		this.listMatricule = listMatricule;
	}





public String execute(){
	
	//sessionManagerRH.put(managerrh, "managerrh");
  listCollaborateur=service.listCollaborateurManager(idManager);
	session.put("idManager", idManager);
	
if(listCollaborateur!=null) 
		for(int j=0;j<listCollaborateur.size();j++)
		{
	listMatricule.add(listCollaborateur.get(j).getMatricule());
	System.out.println(listMatricule.get(j));
		}
				
	   else System.out.println("la liste est vide");

	return SUCCESS;
                            }





	
}
