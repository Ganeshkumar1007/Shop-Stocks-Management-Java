package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class purchase_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        $(\"#vendor3\").on(\"keyup\",function(){\n");
      out.write("            var val1 = $(\"#vendor3\").val();\n");
      out.write("            \n");
      out.write("            $(\"#vendor4\").on(\"keyup\",function(){\n");
      out.write("                var val2 = $(\"#vendor4\").val();\n");
      out.write("            \n");
      out.write("            console.log(val1*val2)\n");
      out.write("            $(\"#vendor5\").val(val1*val2);\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("         $(\"#vendor4\").on(\"keyup\",function(){\n");
      out.write("            var val1 = $(\"#vendor4\").val();\n");
      out.write("            \n");
      out.write("            $(\"#vendor3\").on(\"keyup\",function(){\n");
      out.write("                var val2 = $(\"#vendor3\").val();\n");
      out.write("            \n");
      out.write("            console.log(val1*val2)\n");
      out.write("            $(\"#vendor5\").val(val1*val2);\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    <title>Purchase</title>\n");
      out.write("    <style>\n");
      out.write("   #i1:hover{\n");
      out.write("        background-color: black;\n");
      out.write("        color:white;\n");
      out.write("   }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" id =\"hai\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a href=\"#\" class=\"navbar-brand\">Welcome</a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"firstlogin.html\" class=\"fa fa-sign-in\"> Login</a></li>\n");
      out.write("                <li><a href=\"login.html\" class=\"fa fa-home\"> Home page</a></li>\n");
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
      out.write("                    <li><a href=\"#\" id=\"i1\"><i class=\"fa fa-shopping-cart\"></i> Purchase</a></li>\n");
      out.write("                                        <li><a href=\"bill.jsp\" id=\"i1\"><i class='fa fa-print'></i> Bill</a></li>\n");
      out.write("\n");
      out.write("                    <li><a href=\"sales.jsp\" id=\"i1\"><i class=\"fa fa-money\"></i> Sales</a></li>\n");
      out.write("                    <hr>\n");
      out.write("                    <li><a href=\"#\" id=\"i1\"><i class=\"fa fa-cogs\"></i> Settings</a></li>\n");
      out.write("                    <li><a href=\"#\" id=\"i1\"><i class=\"fa fa-key\"></i> Change password</a></li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <h1></h1>\n");
      out.write("                <h1 style=\"padding-top:150px ;\"><i class=\"fa fa-shopping-cart\"></i> Purchase</h1><hr>\n");
      out.write("                <form action=\"purchase\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <h4 style=\"font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;\"><label  class=\"control-label\">Vendor Name</label>   <input type=\"text\" name=\"vendor1\" id=\"vendor1\" ></h4>\n");
      out.write("\n");
      out.write("                        </div>  \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <h4 style=\"font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;\"><label  class=\"control-label\">Product Name</label>      <input type=\"text\" name=\"vendor2\" id=\"vendor2\" ></h4>\n");
      out.write("\n");
      out.write("                        </div>     \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <h4 style=\"font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif, Times, serif;\"><label  class=\"control-label\">Quantity</label>   <input type=\"text\" name=\"vendor3\" id=\"vendor3\" ></h4>\n");
      out.write("\n");
      out.write("                        </div>  \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <h4 style=\"font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif, Times, serif;\"><label  class=\"control-label\">Cost-Price</label>   <input type=\"text\" name=\"vendor4\" id=\"vendor4\" ></h4>\n");
      out.write("\n");
      out.write("                        </div>  \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <h4 style=\"font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif, Times, serif;\"><label  class=\"control-label\">Total</label>   <input type=\"text\" name=\"vendor5\" id=\"vendor5\" readonly=\"readonly\"></h4>\n");
      out.write("\n");
      out.write("                        </div>  \n");
      out.write("                        <button class=\"btn btn-primary\"><i class=\"fa fa-save\"></i>  Save</button>               \n");
      out.write("                </form>\n");
      out.write("                <hr>\n");
      out.write("                <form action=\"generatepurchase.jsp\">\n");
      out.write("                    \n");
      out.write("                    <h4> <button class=\"btn btn-primary \" ><i class=\"fa fa-cogs\"></i> Generate Purchase report</button></h4>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
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
