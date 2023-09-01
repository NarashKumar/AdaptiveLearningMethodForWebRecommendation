package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SearchBox_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"login-box.css\" rel=\"stylesheet\" type=\"text/css\" />        \n");
      out.write("<style>              \n");
      out.write("#login-box {\n");
      out.write("\twidth:333px;\n");
      out.write("\theight: 352px;\n");
      out.write("\tpadding: 58px 76px 0 76px;\n");
      out.write("\tcolor: #ebebeb;\n");
      out.write("\tfont: 12px Arial, Helvetica, sans-serif;\n");
      out.write("\tbackground: url(images/login-box-backg.png) no-repeat left top;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-box img {\n");
      out.write("\tborder:none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-box h2 {\n");
      out.write("\tpadding:0;\n");
      out.write("\tmargin:0;\n");
      out.write("\tcolor: #ebebeb;\n");
      out.write("\tfont: bold 44px \"Calibri\", Arial;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#login-box-name {\n");
      out.write("\tfloat: left;\n");
      out.write("\tdisplay:inline;\n");
      out.write("\twidth:80px;\n");
      out.write("\ttext-align: right;\n");
      out.write("\tpadding: 14px 10px 0 0;\n");
      out.write("\tmargin:0 0 7px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-box-field {\n");
      out.write("\tfloat: left;\n");
      out.write("\tdisplay:inline;\n");
      out.write("\twidth:230px;\n");
      out.write("\tmargin:0;\n");
      out.write("\tmargin:0 0 7px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".form-login  {\n");
      out.write("\twidth: 205px;\n");
      out.write("\tpadding: 10px 4px 6px 3px;\n");
      out.write("\tborder: 1px solid #0d2c52;\n");
      out.write("\tbackground-color:#1e4f8a;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tcolor: #ebebeb;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box-options  {\n");
      out.write("\tclear:both;\n");
      out.write("\tpadding-left:87px;\n");
      out.write("\tfont-size: 11px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box-options a {\n");
      out.write("\tcolor: #ebebeb;\n");
      out.write("\tfont-size: 11px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("        <div style=\"padding: 100px 0 0 250px;\">\n");
      out.write("        <div id=\"login-box\">\n");
      out.write("        <center>\n");
      out.write("        <form name=\"form1\" method=\"post\" action=\"Search\">\n");
      out.write("            <br>\n");
      out.write("            </br>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div align=\"center\"><font size=\"20\" >Enter Query</font></div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            </br>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                   \n");
      out.write("                    <td>\n");
      out.write("                        <label for=\"query\"></label>\n");
      out.write("                        <input type=\"text\" name=\"query\" id=\"query\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("              </table>            \n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div align=\"center\">\n");
      out.write("                            <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"submit\">\n");
      out.write("                        </div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("        </center>    \n");
      out.write("    </body>      \n");
      out.write("</html>\n");
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
