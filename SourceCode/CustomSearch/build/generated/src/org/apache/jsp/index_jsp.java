package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("  <title>CodePen - Log-in</title>\n");
      out.write("\n");
      out.write("  <link rel='stylesheet' href='http://codepen.io/assets/libs/fullpage/jquery-ui.css'>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<h1 align=\"center\" color=#FFFFFF>Web Page Recommendation</h1><br>\n");
      out.write("  <div class=\"login-card\">\n");
      out.write("    <h1>Log in</h1><br>\n");
      out.write("  <form name=\"form1\" method=\"post\" action=\"LoginServlet\">\n");
      out.write("    <input type=\"text\" name=\"username\" id=\"username\">\n");
      out.write("    <input type=\"password\" name=\"password\" id=\"password\">\n");
      out.write("    <input type=\"submit\" name=\"submit\" id=\"submit\" class=\"login login-submit\" value=\"submit\">\n");
      out.write("  </form>\n");
      out.write("\n");
      out.write("  <div class=\"login-help\">\n");
      out.write("    <a href=\"#\">Register</a> • <a href=\"#\">Forgot Password</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- <div id=\"error\"><img src=\"https://dl.dropboxusercontent.com/u/23299152/Delete-icon.png\" /> Your caps-lock is on.</div> -->\n");
      out.write("\n");
      out.write("  <script src='http://codepen.io/assets/libs/fullpage/jquery_and_jqueryui.js'></script>\n");
      out.write("\n");
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
