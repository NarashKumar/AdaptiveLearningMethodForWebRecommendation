/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.customsearch.Customsearch;
import com.google.api.services.customsearch.model.Result;
//import com.google.api.services.customsearch.model.Search;
import javax.servlet.http.HttpSession;
//import com.google.api.services.customsearch.model.Search;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Java
 */
@WebServlet(name = "Search", urlPatterns = {"/Search"})
public class Search extends HttpServlet {
 String a="";
 String b="";
 String c="";
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
            out.println("<title>Servlet Search</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Search at " + request.getContextPath() + "</h1>");
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
        String query=request.getParameter("query");
        session1.setAttribute("query",query );
        session1.setAttribute("Status", "in"); 
        String username = session1.getAttribute("Username").toString();


       
//        Customsearch customsearch = new Customsearch(new NetHttpTransport(), new JacksonFactory(), null);
////                Customsearch customsearch = new Customsearch(new NetHttpTransport(), new JacksonFactory(), new HttpRequestInitializer() {
////            @Override
////            public void initialize(HttpRequest httpRequest) throws IOException {
////
////            }
////        });
//
//       
//
//        try {
//            com.google.api.services.customsearch.Customsearch.Cse.List list = customsearch.cse().list(query);
//            list.setKey("AIzaSyBM2RwKYQ79Ni1YkghlCA4a5Pa50Q3tMgg");
//            list.setCx("012717866225345692672:eyopo45yhi8");
//            com.google.api.services.customsearch.model.Search results = list.execute();
//            List<Result> items = results.getItems();
//            
//            int i=1;
//            for(Result result: items)
//            {
//                System.out.println(i);
////                System.out.println(result.getHtmlTitle());
////                System.out.println(result.getHtmlSnippet());
////                System.out.println(result.getFormattedUrl());
//                a=result.getHtmlTitle();
//                b=result.getHtmlSnippet();
//                c=result.getFormattedUrl();
//            session1.setAttribute("a[i]", a);
//            session1.setAttribute("b[i]", b);
//            session1.setAttribute("c[i]", c);
//             //   System.out.println(result);
//                ++i;
//            }
////            session1.setAttribute("a", a);
////            session1.setAttribute("a", b);
////            session1.setAttribute("a", c);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        
            Connection con=null;
            Statement st=null;
            ResultSet rs1=null;
            int i=0;
        
        try{
        
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customsearch","root","password");
          st=con.createStatement();
          rs1=st.executeQuery("select * from clickthroughs where username='"+username+"' and query='"+query+"'");

                  if(rs1.next())
          {
             query= rs1.getString(5);
          }
          
        String r[]=Custom.search(query);
        
            session1.setAttribute("a",r[0] );
            session1.setAttribute("b",r[1] );
            session1.setAttribute("c",r[2] );
            session1.setAttribute("d", r[3]);
            session1.setAttribute("e", r[4]);
            session1.setAttribute("f", r[5]);
            session1.setAttribute("g", r[6]);
            session1.setAttribute("h", r[7]);
            session1.setAttribute("i", r[8]);
            session1.setAttribute("j", r[9]);
            session1.setAttribute("k", r[10]);
            session1.setAttribute("l", r[11]);
            session1.setAttribute("m", r[12]);
            session1.setAttribute("n", r[13]);
            session1.setAttribute("o", r[14]);
            session1.setAttribute("p", r[15]);
            session1.setAttribute("q", r[16]);
            session1.setAttribute("r", r[17]);
            session1.setAttribute("s", r[18]);
            session1.setAttribute("t", r[19]);
            session1.setAttribute("u", r[20]);
            session1.setAttribute("v", r[21]);
            session1.setAttribute("w", r[22]);
            session1.setAttribute("x", r[23]);
            session1.setAttribute("y", r[24]);
            session1.setAttribute("z", r[25]);
            session1.setAttribute("aa", r[26]);
            session1.setAttribute("bb", r[27]);
            session1.setAttribute("cc", r[28]);
            session1.setAttribute("dd", r[29]);
            
            
        response.sendRedirect("Resilts.jsp");
        processRequest(request, response);

        
        
            }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
            
        
        
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
