package org.sqli.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.sqli.entities.Collaborateur;
import org.sqli.entities.ManagerRH;
import org.sqli.service.IToutService;

import com.opensymphony.xwork2.ActionSupport;

public class indexManagerAction extends ActionSupport{
	@Autowired	
	private IToutService service;
	private List<Collaborateur> listCollaborateur;
	private Map<ManagerRH,String> sessionManagerRH;
	Long idManager=(long) 1;
	private List<String> listMatricule = new ArrayList<String>();
	
	private ManagerRH managerrh=new ManagerRH(idManager,"ogri","amine","amine123","amine1234567890","amine.ogri@gmail.com","manager");
	
	
	




/*public List<String> getListMatricule() {
		return listMatricule;
	}



	public void setListMatricule(List<String> listMatricule) {
		this.listMatricule = listMatricule;
	}

*/
public List<Collaborateur> getListCollaborateur() {
		return listCollaborateur;
	}



	public void setListCollaborateur(List<Collaborateur> listCollaborateur) {
		this.listCollaborateur = listCollaborateur;
	}




public String execute(){
   
	//sessionManagerRH.put(managerrh, "managerrh");

	
	listCollaborateur=service.listCollaborateurManager(idManager);
	
	
	/*if(listCollaborateur!=null) 
		for(int j=0;j<listCollaborateur.size();j++)
	listMatricule.add(listCollaborateur.get(j).getMatricule());
			
	else System.out.println("la liste est vide");
	*/
	
	return SUCCESS;
}
	
}
