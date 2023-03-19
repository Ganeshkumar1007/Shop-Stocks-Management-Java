<%-- 
    Document   : login
    Created on : 18 Feb, 2022, 1:20:25 PM
    Author     : Ganesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <script src="https://code.jquery.com/jquery-3.6.0.js" ></script>

    <title>Login Form</title>
</head>
<body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <a href="#" class="navbar-brand">Shop</a>
                
            </div>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="login.jsp" class="fa fa-sign-in"> Login</a></li>
            </ul>
        </div>
    </nav>
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                    <h1 style="color: green;"><i class="fa fa-sign-in" ></i> Login Form</h1><hr>
                    <div class="form-group">
                        <label for="username" class="control-label" >Username</label>
                        <input type="text" class="form-control" name="username" id ="username">
                    </div>
                    <div class="form-group">
                        <label for="password" class="control-label">Password</label>
                        <input type="password" class="form-control" name="password" id="password">
                    </div>
                    <div class="checkbox">
                        <label for="remember"><input type="checkbox" name="check" >Remember Me</label>


                    </div>
                    <p id = "bye"></p>
                    <button type="submit" id ="submit" class="btn btn-success">Submit</button>
                    
            </div>
        </div>
    </div>
    
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("button").click(function(){
    $.ajax({url: "one",data:{username:$("#username").val(),password:$("#password").val()}, success: function(result){
      if(result=="yes")
      {
          window.location.href = "Dashboard.jsp";
      }
      else
      {
          $("#bye").text("sorry");
          $("#bye").css("color","red");
      }
    }});
  });
});
</script>
</body>

</html>
