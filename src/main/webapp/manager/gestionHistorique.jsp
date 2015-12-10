<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
    <script src="../jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="../views/template/css/amine.css">
    <title>Mon Template</title>
 
<%@ include file="/views/include/css.jsp" %>
</head>
<body>

<section id="container" >
<%@ include file="/views/include/header.jsp" %>
<%@ include file="sidebarManager.jsp" %>

    <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">

              <div class="row">
                  <div class="col-lg-9 main-chart">
                 <h2> le mode d'acces des Objectifs"</h2>
                 <input type="radio" name="modeObjectif" value="acces" id="AccesObjectif">Acces</input></br>
                   <input type="radio" name="modeObjectif" value="nonAcces" id="nonAccesObjectif">NonAcces</input>
                  
                
                  
                  <h2> le mode d'acces des Feedback"</h2>
                  <input type="radio" name="modeFeedback" value="acces" id="AccesFeedback"></br>
                  <input type="radio" name="modeFeedback" value="nonAcces" id="nonAccesFeedback">
                 
                 <form action="consulterHistorique" method="post" id="FormHistorique">
                 <h2>Consulter l'historique de :</h2>
                 
                <!-- <input type="radio" name="consulterHistorique" id="a" value="BAP">BAP</input></br> --> 
                 <input type="radio" name="consulterHistorique" id="b" value="Feedback">Feedback</input></br>
                 <input type="radio" name="consulterHistorique" id="c" value="Objectif">Objectif</input></br>
                
                 <button type="submit">GO</button>
                 </form>
					
					
                  </div><!-- /col-lg-9 END SECTION MIDDLE -->
                  
                  
                    
                  
                  <div class="col-lg-3 ds">
             <%@ include file="Notification.jsp" %>
                      
                  </div><!-- /col-lg-3 -->
              </div><! --/row -->
          </section>
      </section>

      <!--main content end-->

<%@ include file="/views/include/footer.jsp" %>
</section>
<%@ include file="/views/include/js.jsp" %>

<script src="manager.js"></script>
</body>
</html>