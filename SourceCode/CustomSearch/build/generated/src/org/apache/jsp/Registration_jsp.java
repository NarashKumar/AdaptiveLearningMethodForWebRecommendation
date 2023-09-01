package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>Registration</title>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\" />\n");
      out.write("        \n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("<p class=\"texto\">Registration</p>\n");
      out.write("<div class=\"fontawesome-user\">\n");
      out.write("<form name=\"form1\" method=\"post\" action=\"UserRegServlet\">\n");
      out.write("\n");
      out.write("<span class=\"fontawesome-user\"></span><input type=\"text\" name=\"username\" id=\"username\" required placeholder=\"username\" autocomplete=\"off\"> <br><br>\n");
      out.write("<span class=\"fontawesome-envelope-alt\"></span><input type=\"text\" id=\"email\" required placeholder=\"Email\" autocomplete=\"off\"><br><br>\n");
      out.write("<span class=\"fontawesome-lock\"></span><input type=\"password\" name=\"password\" id=\"password\" required placeholder=\"Password\" autocomplete=\"off\"> <br><br>\n");
      out.write("<input type=\"submit\" type=\"submit\" name=\"submit\" id=\"submit\" value=\"submit\" title=\"Registra tu cuenta\">  <br><br>\n");
      out.write("    \n");
      out.write("</form>               \n");
      out.write("                        </body>\n");
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
