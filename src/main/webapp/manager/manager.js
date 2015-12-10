

$(function() {
    $('#Matricule').click(function() {
      $.ajax({
        type:"GET",
        headres : {
        Accept : "application/json; charset=utf-8",
        "Content-Type": "application/json; charset=utf-8"
        },
        url : '${pageContext.request.contextPath}/manager/indexManager',
        success: function(response){
        	var n= response.length;
        	var ListIdMatricule=" ";
        	for (var i=0;i<n;i++)
        		ListIdMatricule+='<option>' + response[i]+ '</option>';
        	$('#ListIdMatricule').html(ListIdMatricule);
        }
      });    
    });  
  });
$(function(){
$('#AccesObjectif').click(function(){
	var data=$('#AccesObjectif').val();

	alert(data);
	
	var  acces={};
	 acces["modeAcces"]=data;

$.ajax({
	type:"POST",
	 headres : {
	        Accept : "application/json; charset=utf-8",
	        "Content-Type": "application/json; charset=utf-8"
	        },
	url:'${pageContext.request.contextPath}/manager/modeObjectif', 
	/*data:JSON.stringify(acces),*/
	data:acces,
	success: function(response){
		alert(response);
	}
	
});	
});	
});

$(function(){
	$('#nonAccesObjectif').click(function(){
		var data=$('#nonAccesObjectif').val();

		alert(data);
		
		var  acces={};
		 acces["modeAcces"]=data;

	$.ajax({
		type:"POST",
		 headres : {
		        Accept : "application/json; charset=utf-8",
		        "Content-Type": "application/json; charset=utf-8"
		        },
		url:'${pageContext.request.contextPath}/manager/modeObjectif', 
		/*data:JSON.stringify(acces),*/
		data:acces,
		success: function(response){
			alert(response);
		}
		
	});	
	});	
	});

$(function(){
	$('#FormHistorique').on('submit', function(e){
		  e.preventDefault(); // J'empêche le comportement par défaut du navigateur, c-à-d de soumettre le formulaire
		  var amineTest;
		  var $this = $(this);
	$.ajax({
		type:"GET",
		 headres : {
		        Accept : "application/json; charset=utf-8",
		        "Content-Type": "application/json; charset=utf-8"
		        },
		url:'${pageContext.request.contextPath}/manager/consulterHistorique', 
		/*data:JSON.stringify(acces),*/
		data: $this.serialize(),
		success: function(response){		
			top.location.href="Historique.action";
			
		}
		
	});	
	});	
	});

