package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import shop.shop1;;
import java.sql.*;;
import java.util.*;;
import java.util.*;;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    shop1 obj=new shop1();
    obj.connect();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=s, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("     <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\n");
      out.write("<script>\n");
      out.write("     $(document).ready(function(){\n");
      out.write("        $(\"#bill3\").on(\"keyup\",function(){\n");
      out.write("            var val1 = $(\"#bill3\").val();\n");
      out.write("            \n");
      out.write("            $(\"#bill4\").on(\"keyup\",function(){\n");
      out.write("                var val2 = $(\"#bill4\").val();\n");
      out.write("            \n");
      out.write("            console.log(val1*val2)\n");
      out.write("            $(\"#bill5\").val(val1*val2);\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("         \n");
      out.write("        $(\"#bill4\").on(\"keyup\",function(){\n");
      out.write("            var val1 = $(\"#bill4\").val();\n");
      out.write("            \n");
      out.write("            $(\"#bill3\").on(\"keyup\",function(){\n");
      out.write("                var val2 = $(\"#bill3\").val();\n");
      out.write("            \n");
      out.write("            console.log(val1*val2)\n");
      out.write("            $(\"#bill5\").val(val1*val2);\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    });\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("   #i1:hover{\n");
      out.write("        background-color: black;\n");
      out.write("        color:white;\n");
      out.write("   }\n");
      out.write("</style>\n");
      out.write("    <title>Stocks</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" id =\"hai\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a href=\"#\" class=\"navbar-brand\">Welcome</a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"firstlogin.html\"><i  class=\"fa fa-sign-in\"></i> Login</a></li>\n");
      out.write("                <li><a href=\"login.html\"><i class=\"fa fa-home\"></i> Home page</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </nav>\n");
      out.write("    <div class=\"container\" >\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 \" style=\"margin-top: 150px;\">\n");
      out.write("                <ul class=\"nav  nav-stacked\" >\n");
      out.write("                    <h1><i class=\"fa fa-dashboard\"></i>Dashboard</h1>\n");
      out.write("                    <hr>\n");
      out.write("                    <li><a href=\"stock.jsp\" id=\"i1\" ><i class=\"fa fa-houzz\"></i> Stocks</a></li>\n");
      out.write("                    <li><a href=\"purchase.jsp\" id=\"i1\"><i class=\"fa fa-shopping-cart\"></i> Purchase</a></li>\n");
      out.write("                    <li><a href=\"#\" id=\"i1\"><i class=\"fa fa-print\"></i> Bill</a></li>\n");
      out.write("                    <li><a href=\"sales.jsp\" id=\"i1\"><i class=\"fa fa-money\"></i> Sales</a></li>\n");
      out.write("                    <hr>\n");
      out.write("                    <li><a href=\"#\" id=\"i1\"><i class=\"fa fa-cogs\"></i> Settings</a></li>\n");
      out.write("                    <li><a href=\"#\" id=\"i1\"><i class=\"fa fa-key\"></i> Change password</a></li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <h1></h1>\n");
      out.write("                <h1 style=\"padding-top:150px ;\"><i class=\"fa fa-print\"></i>Bill</h1><hr>\n");
      out.write("                <form action=\"bill\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <h4 style=\"font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;\"><label  class=\"control-label\">Customer Name</label>   <input type=\"text\" name=\"bill1\" id=\"bill1\" ></h4>\n");
      out.write("\n");
      out.write("                        </div>  \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <h4 style=\"font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;\"><label  class=\"control-label\">Product</label>      <input type=\"text\" name=\"bill2\" id=\"bill2\" ></h4>\n");
      out.write("\n");
      out.write("                        </div>     \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <h4 style=\"font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif, Times, serif;\"><label  class=\"control-label\">Quantity</label>   <input type=\"text\" name=\"bill3\" id=\"bill3\" ></h4>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <h4 style=\"font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif, Times, serif;\"><label class=\"control-label\">Price</label>   <input type=\"text\" name=\"bill4\" id=\"bill4\" > </h4>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <h4 style=\"font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif, Times, serif;\"><label  class=\"control-label\">Total</label>   <input type=\"text\" name=\"bill5\" id=\"bill5\" readonly=\"readonly\"></h4>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                        </div>  \n");
      out.write("                        <button class=\"btn btn-primary\"><i class=\"fa fa-save\"></i>  Save and Print</button>               \n");
      out.write("                </form>\n");
      out.write("                <hr>\n");
      out.write("                <form action=\"generatebill.jsp\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button class=\"btn btn-primary \" ><i class=\"fa fa-cogs\"></i> Generate Bill report</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");

//        Connection con = null;
//        try{
//            obj.connect();
//            PreparedStatement pst = con.prepareStatement("select selling_price from stock where stock_name=?");
//            
      out.write("\n");
      out.write("//            <script>\n");
      out.write("//        $(document).ready(function(){\n");
      out.write("//           $(\"#bill2\").on(\"keyup\",function(){\n");
      out.write("//            var n = ( $(\"#bill2\").val()).toLowerCase();\n");
      out.write("//            console.log(n);\n");
      out.write("//\n");
      out.write("//           });\n");
      out.write("//        });\n");
      out.write("//    </script>\n");
      out.write("//       ");

//            pst.setString(1, n);
//        }
//        catch(Exception e)
//        {
//            System.out.print(e);
//        }
//    
//     
//    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
