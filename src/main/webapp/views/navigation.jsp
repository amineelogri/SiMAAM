
    <!-- navigation**************************************************************************************************** -->

    <div id="wrapper">
      
      <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                
                <a class="navbar-brand" href="<s:url action="initial"/>"><img alt="" src="css/l.PNG"></a>
              
               
            </div>

            

            <!-- **************************   nav de déconnexion ****************************** -->
           
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> <%= session.getAttribute("nom")%> <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        
                        <li class="divider"></li>
                        <li>
                            <a href="index.jsp"><i class="fa fa-fw fa-power-off"></i>Déconnexion</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <h2 class="nomA2">G.P.I.B</h2>
            <!--    <ul class="nav navbar-right2 top-nav">
                
                   <br>
                   <span class="gpibV">G</span>
                   <span class="gpibG">P</span>
                   <span class="gpibV">I</span>
                   <span class="gpibG">B</span>
              
            </ul> -->

            <!-- **************************   Fin navigation1 ****************************** -->


            <!-- ***********************************Début navigation 2****************************** -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                
                <li class="active">
                        <a href="<s:url action="initial"/>"><i class="fa fa-home"></i> Accueil</a>
                    </li>
                
                <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Projet <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="demo" class="collapse">
                            <li>
                                <a href="projetCreer.jsp"><i class="fa fa-pencil-square-o"></i> Créer</a>
                            </li>
                             <li> 
                                <a href="<s:url action="projetLister"/>" ><i class="fa fa-list-ul"></i> Lister</a>
                            </li>
                        </ul>
                </li>
                
                 <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#demo1"><i class="fa fa-fw fa-arrows-v"></i> Compte <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="demo1" class="collapse">
                            <li>
                                <a href="compteCreer.jsp"><i class="fa fa-pencil-square-o"></i> Créer</a>
                            </li>
                            <li> 
                                <a href="<s:url action="compteLister"/>" ><i class="fa fa-list-ul"></i> Lister</a>
                            </li>
                        </ul>
                 </li>
                
                
                    <li>
                        <a href="    <s:url action="listerAnomalie"  />   "><i class="fa fa-fw fa-wrench"></i> Liste anomalie</a>
                    </li>
               <!-- 
                    <li>
                        <a href="<s:url action="tableauBord"/>"><i class="fa fa-fw fa-table"></i> Table de bord</a>
                    </li>
                  -->   
                </ul>
            </div>
            <!-- ***************************************Fin navigation 2*********************************** -->
        </nav>  

        <div id="page-wrapper">


<!--************************************************FIN navigation****************************************************************** -->
