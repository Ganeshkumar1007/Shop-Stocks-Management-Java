<%-- 
    Document   : generatestock
    Created on : 19 Feb, 2022, 11:45:27 AM
    Author     : Ganesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="shop.shop1;" %>
<%@page import="java.util.*;" %>
<%!ArrayList<ArrayList> hai = new ArrayList();%>
<%
    shop1 obj=new shop1();
    hai = obj.data();
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Generate Stock</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                            <h1 style="font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif, Times, serif;">Stock Details</h1>

                                    <table class="table table-striped">
                            <thead class="thead-dark" style="background-color: black; color: white">
                                <tr>
                                    <th>Id</th>
                                    <th>Stock Name</th>
                                    <th>Cost Price</th>
                                    <th>Selling Price</th>
                                </tr>
                            </thead>
                            <tbody>

                                    <%for(ArrayList<String> x : hai)
                                    {%>
                                    <tr>
                                     <% for(String y : x)
                                     {%>
                                     <td>
                                         <%=y%>
                                     </td>
                                     <%}%>
                                     </tr>
                                     <%}%>
                            </tbody>
                        </table>
                </div>
            </div>
        </div>
    </body>
</html>
