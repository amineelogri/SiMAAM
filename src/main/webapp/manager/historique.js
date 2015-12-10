$(function(){
	$.ajax({
		type:"GET",
		 headres : {
		        Accept : "application/json; charset=utf-8",
		        "Content-Type": "application/json; charset=utf-8"
		        },
		url:'${pageContext.request.contextPath}/manager/afficherHistorique', 
		success: function(response){
			
			//****************************Début Historique Objectif*******************************
			if(response.choixHistorique=="Objectif"){
				var id=0;
				$('#hamza').html("<h3>Histrorique Objectif</h3>");
				for(var i=0;i<response.listDescription.length;i++){//loop Toute la liste
					if(i==0){ $('#hamza').append('<h3>l\'historique de l\'année :'+response.listDescription[i][0].objectif.bap.date+'</h3>');
				$('#hamza').append('<table  class="table table-bordered table-hover table-striped"><thead><tr><th>Objectif</th><th>Description</th><th>Mesure</th><th>Responsable mesure</th><th>Poids</th><th>Résulat</th><th>Note finale</th></tr></thead><tbody id="'+id+'"></tbody></table>');
					}
					else{
	if(response.listDescription[i-1][0].objectif.bap.date!=response.listDescription[i][0].objectif.bap.date){ 
		id++;
		$('#hamza').append('<h3>l\'historique de l\'année :'+response.listDescription[i][0].objectif.bap.date+'</h3>');
		$('#hamza').append('<table  class="table table-bordered table-hover table-striped"><thead><tr><th>Objectif</th><th>Description</th><th>Mesure</th><th>Responsable mesure</th><th>Poids</th><th>Résulat</th><th>Note finale</th></tr></thead><tbody id="'+id+'"></tbody></table>');
					
					}
				}
				for(j=0;j<response.listDescription[i].length;j++)
$('#'+id).append('<tr class="warning"><td>'+response.listDescription[i][j].objectif.titre+'</td><td>'+response.listDescription[i][j].description+'</td><td>'+response.listDescription[i][j].objectif.mesure+'</td><td>'+response.listDescription[i][j].responsableMesure+'</td><td>'+response.listDescription[i][j].objectif.poid+'</td><td>'+response.listDescription[i][j].objectif.resultat+'</td><td>'+response.listDescription[i][j].objectif.noteFinale+'</td></tr>');
				
				
				}//Fin loop Toute la liste
				
			}
			//****************************Fin Historique Objectif*******************************
		
			
			
			
			
			//****************************Début Historique Feedback*******************************
			if(response.choixHistorique=="Feedback"){
			
			
			if(response.etatHistorique=="Historique vide") alert("l'historique est vide");
		
			
			else {
				var feedback;
				var compteur=0;
			$('#hamza').html("<h3>Information Générale </h3>");
			$('#hamza').append('<p>'+response.toutFeedback[0][0].feedback.collaborateur.matricule+'</p>');
			$('#hamza').append('<p>'+response.toutFeedback[0][0].feedback.collaborateur.nom+'</p>');
			$('#hamza').append('<p>'+response.toutFeedback[0][0].feedback.collaborateur.prenom+'</p>');
			$('#hamza').append('<p>'+response.toutFeedback[0][0].feedback.collaborateur.poste+'</p>');
			$('#hamza').append("<h3>Les feedbacks:</h3>");
			
			for(var i=0; i<response.toutFeedback.length;i++){
			if(i==0)	$('#hamza').append('<h3>l\'historique de l\'année :'+response.toutFeedback[i][0].feedback.bap.date+'</h3>');
			else{
					if(response.toutFeedback[i-1][0].feedback.bap.date!=response.toutFeedback[i][0].feedback.bap.date) $('#hamza').append('<h3>l\'historique de l\'année :'+response.toutFeedback[i][0].feedback.bap.date+'</h3>');
				}
				$('#hamza').append('<h5>Feedback numéro :'+(i+1)+'</h5>');
				$('#hamza').append('<p>code projet :'+response.toutFeedback[i][0].feedback.projet.idProjet+'</p>');
				$('#hamza').append('<p>Nom projet :'+response.toutFeedback[i][0].feedback.projet.nomProjet+'</p>');
				$('#hamza').append('<p>Date début de l\'intervention :'+response.toutFeedback[i][0].feedback.dateDebutIntervention+'</p>');
				$('#hamza').append('<p>Date fin de l\'intervention  :'+response.toutFeedback[i][0].feedback.dateFinIntervention+'</p>');
				$('#hamza').append('<p>Role joué :'+response.toutFeedback[i][0].feedback.roleCollaborateur+'</p>');
				$('#hamza').append('<p>Nombre de jours :'+response.toutFeedback[i][0].feedback.nombreJoursPrevu+'</p>');
				 $('#hamza').append('<table  class="table table-bordered table-hover table-striped"><thead><tr><th>Théme</th><th>Qualification</th><th>Remarque</th></tr></thead><tbody id="'+i+'"></tbody></table>');
				 var Nbr=0,TotalP=0,noteGlobale=0;
				 for(var j=0;j<9;j++){
					 $('#'+i+'').append('<tr class="warning"><td>'+response.toutFeedback[i][j].theme.nomTheme+'</td><td>'+response.toutFeedback[i][j].qualification.valeurQualification+'</td><td>'+response.toutFeedback[i][j].theme.remarque1000+'</td></tr>');
					 if(response.toutFeedback[i][j].qualification.valeurQualification!="NA") Nbr++;
					 TotalP=TotalP+response.toutFeedback[i][j].qualification.poid;
				 }
				if(Nbr!=0) noteGlobale=TotalP/Nbr;
				$('#'+i+'').append('<tr class="warning"><td colspan="3"> *Nbr de thèmes qualifiés='+Nbr+'</br> *Total poids obtenu='+TotalP+'</br> *Note globale='+noteGlobale+'</td></tr>');
				$('#'+i+'').append('<tr class="warning"><td> Remarque générale: </td><td colspan="2">'+response.toutFeedback[i][0].feedback.commentaire2000+'</td></tr>');
			}
			
			
			}
			}
			//****************************Fin Historique Feedback*******************************
			
			
			//****************Fin de colade response
			}
	});
	
});