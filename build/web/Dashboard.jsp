<%-- 
    Document   : Dashboard
    Created on : 18 Feb, 2022, 1:21:49 PM
    Author     : Ganesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=s, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Dashboard</title>
    <style>
     #i1:hover{
        background-color: black;
        color:white;
   }
    </style>    
</head>

<body>
    <nav class="navbar navbar-inverse navbar-fixed-top" id ="hai">
        <div class="container-fluid">
            <div class="navbar-header">
                <a href="#" class="navbar-brand">Welcome</a>
            </div>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="login.jsp" class="fa fa-sign-in"> Login</a></li>
                <li><a href="index.html" class="fa fa-home"> Home page</a></li>

            </ul>
        </div>
       
    </nav>
    <div class="container" >
        <div class="row">
            <div class="col-md-3 " style="margin-top: 150px;">
                <ul class="nav  nav-stacked" >
                    <h1><i class="fa fa-dashboard"></i>Dashboard</h1>
                    <hr>
                    <li><a href="stock.jsp" id="i1" ><i class="fa fa-houzz"></i> Stocks</a></li>
                    <li><a href="purchase.jsp" id="i1"><i class="fa fa-shopping-cart"></i> Purchase</a></li>
                     <li><a href="bill.jsp" id="i1"><i class='fa fa-print'></i> Bill</a></li>

                    <li><a href="sales.jsp" id="i1"><i class="fa fa-money"></i> Sales</a></li>
                    <hr>
                    <li><a href="#" id="i1"><i class="fa fa-cogs"></i> Settings</a></li>
                    <li><a href="#" id="i1"><i class="fa fa-key"></i> Change password</a></li>
                </ul>
                
            </div>
            <div class="col-md-6">
                <h1></h1>
                <h1 style="padding-top:150px ;"><i class="fa fa-users"></i>Profile</h1><hr>
            </div>
        </div>
    </div>
</body>
</html>
