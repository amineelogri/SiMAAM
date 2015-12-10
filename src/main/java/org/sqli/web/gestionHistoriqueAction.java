package org.sqli.web;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class gestionHistoriqueAction extends ActionSupport implements SessionAware{

	private String ListIdMatricule;
	private Map<String,Object> session;
	
	
	
	public String getListIdMatricule() {
		return ListIdMatricule;
	}


	public void setListIdMatricule(String listIdMatricule) {
		ListIdMatricule = listIdMatricule;
	}


	public Map<String, Object> getSession() {
		return session;
	}
	
	
	public void setSession(Map session) {
		this.session=session;
		
	}

	public String execute(){
	  session.put("Matricule", ListIdMatricule);
		
		
		return SUCCESS;
	}
	
	
}
