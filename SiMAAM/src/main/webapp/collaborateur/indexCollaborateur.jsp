<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
    <title>Mon Template</title>
  
<%@ include file="/views/include/css.jsp" %>
</head>
<body>

<section id="container" >
<%@ include file="headerCollaborateur.jsp" %>
<%@ include file="sidebarCollaborateur.jsp" %>

    <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">
         
			   <button id="charger">Charger et traiter les données</button>
				<div id="r">Cliquez sur "Charger et traiter les données" pour lancer la lecture et le traitement des données JSON</div>
				
				<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
				<script>

				$(document).ready(function(){
					$('#charger').click(function() { 
						$.ajax( {url:"collaborateur/ConsulterFB.action",
								 success: function(data){
									    // ici tu log la liste de feedback (ce que j'ai compris )
								        console.log(data);
									    // dans cet exemple on va récuperer le premier collaborateur 
									    var collaborateur =data.feedbacks[0].collaborateur;
								        $('#r').html('<p><b>Date d embauche</b> : ' + collaborateur.dateDebutEmbauche + '</p>');
								        $('#r').append('<p><b>Date de fin d enmbauche</b> : ' + collaborateur.email + '</p>');
								        $('#r').append('<p><b>Poste</b> : ' + collaborateur.poste + '</p>'); 
								   }
								});

					});
				});
				</script>  
         
          </section>
      </section>

      <!--main content end-->

<%@ include file="/views/include/footer.jsp" %>
</section>
<%@ include file="/views/include/js.jsp" %>

</body>
</html>