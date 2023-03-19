<%-- 
    Document   : bill
    Created on : 19 Feb, 2022, 2:29:17 PM
    Author     : Ganesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="shop.shop1;" %>
<%@page import="java.sql.*;" %>
<%@page import="java.util.*;" %>

<%@page import="java.util.*;" %>
 <%
                     shop1 obj=new shop1();
                     
                    int b = obj.auto("Pen");
             %>
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
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
     $(document).ready(function(){
         $("#bill2").on("keyup",function(){
             var a = $("#bill2").val();
            
             $.post({url:"bill1",data:{us:a},success:function(res){
                      
                       $("#bill4").val(res);
                       var y = $("#bill4").val();
                        $("#bill3").on("keyup",function(){
                        var val1 = $("#bill3").val();
                        
                        $("#bill5").val(val1*y);
            
        });
                   }      
                });
             
         });
         
         
         
         
         
         
       
        
         
       
        
        
    });

</script>
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
                <li><a href="firstlogin.html"><i  class="fa fa-sign-in"></i> Login</a></li>
                <li><a href="login.html"><i class="fa fa-home"></i> Home page</a></li>

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
                    <li><a href="#" id="i1"><i class="fa fa-print"></i> Bill</a></li>
                    <li><a href="sales.jsp" id="i1"><i class="fa fa-money"></i> Sales</a></li>
                    <hr>
                    <li><a href="#" id="i1"><i class="fa fa-cogs"></i> Settings</a></li>
                    <li><a href="#" id="i1"><i class="fa fa-key"></i> Change password</a></li>
                </ul>
                
            </div>
            <div class="col-md-6">
                <h1></h1>
                <h1 style="padding-top:150px ;"><i class="fa fa-print"></i>Bill</h1><hr>
                <form action="bill">
                        <div class="form-group">
                            <h4 style="font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;"><label  class="control-label">Customer Name</label>   <input type="text" name="bill1" id="bill1" ></h4>

                        </div>  
                        <div class="form-group">
                            <h4 style="font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;"><label  class="control-label">Product</label>      <input type="text" name="bill2" id="bill2" ></h4>

                        </div>     
                        <div class="form-group">
                            <h4 style="font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif, Times, serif;"><label  class="control-label">Quantity</label>   <input type="text" name="bill3" id="bill3" ></h4>


                        </div>
                        <div class="form-group">
                            <h4 style="font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif, Times, serif;"><label class="control-label">Price</label>   <input type="text" name="bill4" id="bill4" readonly="readonly"> </h4>
                            

                        </div>
                        <div class="form-group">
                            <h4 style="font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif, Times, serif;"><label  class="control-label">Total</label>   <input type="text" name="bill5" id="bill5" readonly="readonly"></h4>
                            

                        </div>  
                        <button class="btn btn-primary"><i class="fa fa-save"></i>  Save and Print</button>               
                </form>
                <hr>
                <form action="generatebill.jsp">
                    <div class="form-group">
                        <button class="btn btn-primary " ><i class="fa fa-cogs"></i> Generate Bill report</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <%
//        Connection con = null;
//        try{
//            obj.connect();
//            PreparedStatement pst = con.prepareStatement("select selling_price from stock where stock_name=?");
//            %>
//            <script>
//        $(document).ready(function(){
//           $("#bill2").on("keyup",function(){
//            var n = ( $("#bill2").val()).toLowerCase();
//            console.log(n);
//
//           });
//        });
//    </script>
//       <%
//            pst.setString(1, n);
//        }
//        catch(Exception e)
//        {
//            System.out.print(e);
//        }
//    
//     
//    %>
</body>
</html>