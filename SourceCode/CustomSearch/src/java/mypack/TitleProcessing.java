/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.commondb.Common_DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Java
 */
@WebServlet(name = "TitleProcessing", urlPatterns = {"/TitleProcessing"})
public class TitleProcessing extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TitleProcessing</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TitleProcessing at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                HttpSession session1=request.getSession();
        String clickthrough=request.getParameter("tit");
        String username = session1.getAttribute("Username").toString();
        String query = session1.getAttribute("query").toString();
        session1.setAttribute("Status", "in"); 

        
        System.out.println("title processing before-----"+clickthrough);
            StopWordsManager sw=new StopWordsManager();
            String minedword = sw.removeStopWords(clickthrough);
            System.out.println("after processing-----"+minedword);
            Connection con=null;
            Statement st=null;
            ResultSet rs1=null;
            int i=0;
        try{
        
         Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customsearch","root","password");
          st=con.createStatement();
          
		ResultSet rr=Common_DB.ViewParticularData("customsearch","clickthroughs","query",query);
		if(rr.next()){
			i=Common_DB.UpdateTable("customsearch","UPDATE clickthroughs set minedword='"+minedword+"' WHERE query='"+query+"' ");			
			}
	else {
                  i=Common_DB.UpdateTable("customsearch","INSERT INTO clickthroughs(username,query,clickthroughs1,minedword) VALUES('"+username+"','"+query+"','"+clickthrough+"','"+minedword+"') ");			
             	}
          
			if(i>0){				
				                response.sendRedirect("ClickthroughSubmit.jsp");
				
			}
                        else
                        {
                            response.sendRedirect("Failed.jsp");
                         }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        
        
        
        
        
               

        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
