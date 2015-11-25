<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Bootbusiness | Short description about company">
    <meta name="author" content="Your name">
    <!-- Bootstrap -->
    <link href="views/css/bootstrap.css" rel="stylesheet">
    <!-- Bootstrap responsive -->
    <link href="views/css/bootstrap-responsive.min.css" rel="stylesheet">
    <!-- Font awesome - iconic font with IE7 support --> 
    <link href="views/css/font-awesome.css" rel="stylesheet">
    <link href="views/css/font-awesome-ie7.css" rel="stylesheet">
    <!-- Bootbusiness theme -->
    <link href="views/css/boot-business.css" rel="stylesheet">
	<link href="views/css1/amine.css" rel="stylesheet">
	 <link href="views/css/sb-admin.css" rel="stylesheet">


</head>
<body>

    <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12 blockB ">
                        <span class="image"><img src="views/css/lll.PNG" ></span>  
                       
                      <h2 class="nomA">G.P.I.B</h2>

                             </div>
                             </div>


                             <div class="row">
                    <div class="col-lg-12 blockR block">
                
                        <div class="row">
                    <div class="col-lg-12 blockF ">

                        <h3 class="titre">G.P.I.B Authentification</h3>
                            <span class="sperateur"></span> 
                           <form class="form-horizontal form-signin-signup"   action="index.action" method="post">
                      
                      <label class="labelL">Login:</label>      
                  <input type="text" class="login" name="login" id="login"  maxlength="30">
           
                    <label class="labelP">Password:</label>      
                  <input type="password" class="password" name="password" id="pass"  maxlength="30">

                   <label class="labelListe" for="pays" >qui êtes-vous ?</label>
                  
                   <select name="typeCompte" id="typeCompte" class="liste">
                    <option>Admin </option>
                     <option>Autre</option>
                     
                     </select> 
                     <button class="seconnecter" type="submit">Se connecter</button>

                </form>  
                           </div>
                             </div>

                             </div>
                             </div>
                                   </div>
    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="js/plugins/morris/raphael.min.js"></script>
    <script src="js/plugins/morris/morris.min.js"></script>
    <script src="js/plugins/morris/morris-data.js"></script>

</body>
</html>
<script>
function verifier()
{
			if (!/^[a-z0-9._-]+@[a-z0-9._-]+\.[a-z]{2,6}$/.test(document.getElementById("email").value))
			
alert("Entrez votre adresse de messagerie au format suivant : xyz@exemple.com. ");
else{ if (document.getElementById("login").value.length<6)
	           {alert("Votre login doit contenir au moins 6 caractéres");}
	               
	else{ if(document.getElementById("pass").value.length<6) {alert("Votre mot de passe doit contenir au moins 6 caractéres");}
	      else{document.getElementById("bout").type="submit";} } }


} 
</script>