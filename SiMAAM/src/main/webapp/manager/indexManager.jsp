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
<%@ include file="headerManager.jsp" %>
<%@ include file="sidebarManager.jsp" %>

    <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">

              <div class="row">
                  <div class="col-lg-9 main-chart">
                  
       	<h1>Hello world</h1>
          
					
                  </div><!-- /col-lg-9 END SECTION MIDDLE -->
                  
                  
      <!-- **********************************************************************************************************************************************************
      RIGHT SIDEBAR CONTENT
      *********************************************************************************************************************************************************** -->                  
                  
                  <div class="col-lg-3 ds">
                    <!--COMPLETED ACTIONS DONUTS CHART-->
						<h3>NOTIFICATIONS</h3>
                                        
                      <!-- First Action -->
                      <div class="desc">
                      	<div class="thumb">
                      		<span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                      	</div>
                      	<div class="details">
                      		<p><muted>2 Minutes Ago</muted><br/>
                      		   <a href="#">James Brown</a> subscribed to your newsletter.<br/>
                      		</p>
                      	</div>
                      </div>
                      <!-- Second Action -->
                      <div class="desc">
                      	<div class="thumb">
                      		<span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                      	</div>
                      	<div class="details">
                      		<p><muted>3 Hours Ago</muted><br/>
                      		   <a href="#">Diana Kennedy</a> purchased a year subscription.<br/>
                      		</p>
                      	</div>
                      </div>
                      <!-- Third Action -->
                      <div class="desc">
                      	<div class="thumb">
                      		<span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                      	</div>
                      	<div class="details">
                      		<p><muted>7 Hours Ago</muted><br/>
                      		   <a href="#">Brandon Page</a> purchased a year subscription.<br/>
                      		</p>
                      	</div>
                      </div>
                      <!-- Fourth Action -->
                      <div class="desc">
                      	<div class="thumb">
                      		<span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                      	</div>
                      	<div class="details">
                      		<p><muted>11 Hours Ago</muted><br/>
                      		   <a href="#">Mark Twain</a> commented your post.<br/>
                      		</p>
                      	</div>
                      </div>
                      <!-- Fifth Action -->
                      <div class="desc">
                      	<div class="thumb">
                      		<span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                      	</div>
                      	<div class="details">
                      		<p><muted>18 Hours Ago</muted><br/>
                      		   <a href="#">Daniel Pratt</a> purchased a wallet in your store.<br/>
                      		</p>
                      	</div>
                      </div>

                       <!-- USERS ONLINE SECTION -->
						<h3>TEAM MEMBERS</h3>
                      <!-- First Member -->
                      <div class="desc">
                      	<div class="thumb">
                      		<img class="img-circle" src="<%= request.getContextPath() %>template/img/ui-divya.jpg" width="35px" height="35px" align="">
                      	</div>
                      	<div class="details">
                      		<p><a href="#">DIVYA MANIAN</a><br/>
                      		   <muted>Available</muted>
                      		</p>
                      	</div>
                      </div>
                      <!-- Second Member -->
                      <div class="desc">
                      	<div class="thumb">
                      		<img class="img-circle" src="<%= request.getContextPath() %>template/img/ui-sherman.jpg" width="35px" height="35px" align="">
                      	</div>
                      	<div class="details">
                      		<p><a href="#">DJ SHERMAN</a><br/>
                      		   <muted>I am Busy</muted>
                      		</p>
                      	</div>
                      </div>
                      <!-- Third Member -->
                      <div class="desc">
                      	<div class="thumb">
                      		<img class="img-circle" src="<%= request.getContextPath() %>template/img/ui-danro.jpg" width="35px" height="35px" align="">
                      	</div>
                      	<div class="details">
                      		<p><a href="#">DAN ROGERS</a><br/>
                      		   <muted>Available</muted>
                      		</p>
                      	</div>
                      </div>
                      <!-- Fourth Member -->
                      <div class="desc">
                      	<div class="thumb">
                      		<img class="img-circle" src="<%= request.getContextPath() %>template/img/ui-zac.jpg" width="35px" height="35px" align="">
                      	</div>
                      	<div class="details">
                      		<p><a href="#">Zac Sniders</a><br/>
                      		   <muted>Available</muted>
                      		</p>
                      	</div>
                      </div>
                      <!-- Fifth Member -->
                      <div class="desc">
                      	<div class="thumb">
                      		<img class="img-circle" src="<%= request.getContextPath() %>template/img/ui-sam.jpg" width="35px" height="35px" align="">
                      	</div>
                      	<div class="details">
                      		<p><a href="#">Marcel Newman</a><br/>
                      		   <muted>Available</muted>
                      		</p>
                      	</div>
                      </div>

                        <!-- CALENDAR-->
                        <div id="calendar" class="mb">
                            <div class="panel green-panel no-margin">
                                <div class="panel-body">
                                    <div id="date-popover" class="popover top" style="cursor: pointer; disadding: block; margin-left: 33%; margin-top: -50px; width: 175px;">
                                        <div class="arrow"></div>
                                        <h3 class="popover-title" style="disadding: none;"></h3>
                                        <div id="date-popover-content" class="popover-content"></div>
                                    </div>
                                    <div id="my-calendar"></div>
                                </div>
                            </div>
                        </div><!-- / calendar -->
                      
                  </div><!-- /col-lg-3 -->
              </div><! --/row -->
          </section>
      </section>

      <!--main content end-->

<%@ include file="/views/include/footer.jsp" %>
</section>
<%@ include file="/views/include/js.jsp" %>

</body>
</html>