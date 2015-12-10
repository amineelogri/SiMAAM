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
    <script src="jquery.js"></script>
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
              
               <div id="hamza"></div>
                
                 
      
          
					
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

<script src="historique.js"></script>
</body>
</html>