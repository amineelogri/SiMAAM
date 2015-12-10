package org.sqli.web;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class consulterHistoriqueAction extends ActionSupport implements SessionAware{
	
	private String consulterHistorique;
	
	private Map<String,Object> session;
	private String test="aa";
	
	
    
	
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getConsulterHistorique() {
		return consulterHistorique;
	}

	public void setConsulterHistorique(String consulterHistorique) {
		this.consulterHistorique = consulterHistorique;
	}

	

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	
	public String execute(){
		session.put("consulterHistorique", consulterHistorique);
		
		return SUCCESS;
	}
	

}
