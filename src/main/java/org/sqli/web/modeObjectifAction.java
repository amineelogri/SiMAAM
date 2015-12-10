package org.sqli.web;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.sqli.service.IServiceManager;

import com.opensymphony.xwork2.ActionSupport;

public class modeObjectifAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;
	private String Matricule;
	private String modeAcces;
	private boolean accesHistoriqueObjectif;
	private IServiceManager service;
	private String acces="acces";
	private String nonAcces="nonAcces";
	
	
    
	public boolean isAccesHistoriqueObjectif() {
		return accesHistoriqueObjectif;
	}


	public void setAccesHistoriqueObjectif(boolean accesHistoriqueObjectif) {
		this.accesHistoriqueObjectif = accesHistoriqueObjectif;
	}


	public IServiceManager getService() {
		return service;
	}


	public void setService(IServiceManager service) {
		this.service = service;
	}


	


	public String getModeAcces() {
		return modeAcces;
	}


	public void setModeAcces(String modeAcces) {
		this.modeAcces = modeAcces;
	}


	public String getMatricule() {
		return Matricule;
	}


	public void setMatricule(String matricule) {
		Matricule = matricule;
	}


	public Map<String, Object> getSession() {
		return session;
	}
	
	
	public void setSession(Map session) {
		this.session=session;
		
	}
	
	public String execute(){
		
		Matricule=(String) session.get("Matricule");
		System.out.println(modeAcces);
		if(modeAcces.equals(acces)) accesHistoriqueObjectif=true;
		if(modeAcces.equals(nonAcces)) accesHistoriqueObjectif=false;
		if(modeAcces==null) System.out.println("un problème de ajax");
		System.out.println(accesHistoriqueObjectif);
		service.modeAccesObjectif(Matricule, accesHistoriqueObjectif);

		return SUCCESS;
	}

}
