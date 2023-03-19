<%-- 
    Document   : stock
    Created on : 19 Feb, 2022, 12:07:09 AM
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
    <style>
   #i1:hover{
        background-color: black;
        color:white;
   }
</style>
    <title>Stocks</title>
</head>

<body>
    <nav class="navbar navbar-inverse navbar-fixed-top" id ="hai">
        <div class="container-fluid">
            <div class="navbar-header">
                <a href="#" class="navbar-brand">Welcome</a>
            </div>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="firstlogin.html" class="fa fa-sign-in"> Login</a></li>
                <li><a href="login.html" class="fa fa-home"> Home page</a></li>

            </ul>
        </div>
       
    </nav>
    <div class="container" >
        <div class="row">
            <div class="col-md-3 " style="margin-top: 150px;">
                 <h1><i class="fa fa-dashboard"></i>Dashboard</h1><hr>
                <ul class="nav  nav-stacked" >
                   
                    
                    <li><a href="#" id="i1" ><i class="fa fa-houzz"></i> Stocks</a></li>
                    <li><a href="purchase.jsp" id="i1"><i class="fa fa-shopping-cart"></i> Purchase</a></li>
                                                      <li><a href="bill.jsp" id="i1"><i class='fa fa-print'></i> Bill</a></li>

                    <li><a href="sales.jsp" id="i1"><i class="fa fa-money"></i> Sales</a></li>
                </ul>
                 <hr>
                <ul class="nav  nav-stacked">
                    <li><a href="#" id="i1"><i class="fa fa-cogs"></i> Settings</a></li>
                    <li><a href="#" id="i1"><i class="fa fa-key"></i> Change password</a></li>
                </ul>
                
            </div>
            <div class="col-md-6">
                <h1></h1>
                <h1 style="padding-top:150px ;"><i class="fa fa-houzz"></i>Stocks</h1><hr>
                <form action="stock">
                        <div class="form-group">
                            <h4 style="font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;"><label  class="control-label">Stock Name</label>   <input type="text" name="stock1" id="stock1" ></h4>

                        </div>  
                        <div class="form-group">
                            <h4 style="font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;"><label  class="control-label">Stock-Cost-Price</label>      <input type="text" name="stock2" id="stock2" ></h4>

                        </div>     
                        <div class="form-group">
                            <h4 style="font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif, Times, serif;"><label  class="control-label">Stock-Selling-Price</label>   <input type="text" name="stock3" id="stock3" ></h4>

                        </div>  
                        <button class="btn btn-primary"><i class="fa fa-save"></i>  Save</button>               
                </form>
                <hr>
                <form action="generatestock.jsp">
                    <div class="form-group">
                        <button class="btn btn-primary  "><i class="fa fa-cogs"></i>Generate Stocks report</button>
                        
                    </div>
                </form>
            </div>
        </div>
        
    </div>
    
    
</body>
</html>