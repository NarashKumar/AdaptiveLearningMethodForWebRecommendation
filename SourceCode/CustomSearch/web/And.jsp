<%-- 
    Document   : Resilts
    Created on : Jun 19, 2016, 8:53:26 PM
    Author     : Java
--%>

<%@page import="mypack.Custom"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page  import="mypack.StopWordsManager" %>
<%@page import="java.sql.*"%>
<%@page import="com.commondb.Common_DB"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Results Page</title>
        	<link rel="stylesheet" href="newcss.css" type="text/css" />
<style>
body {
    background-color: pink;
}
</style>

    </head>
    <body align="center">

        
               
        <p>
            <%
String Status = session.getAttribute("Status").toString();

%>
<%=Status%>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
if(Status=="out")
       {
    response.sendRedirect("index.jsp");
}
%>
        <%
       
         HttpSession session1=request.getSession();
         
        String query=request.getQueryString();
        session1.setAttribute("query",query );
        String username=session.getAttribute("Username").toString();
     
            Connection con=null;
            Statement st=null;
            ResultSet rs1=null;
            int iii=0;
        
        try{
        
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customsearch","root","password");
          st=con.createStatement();
          rs1=st.executeQuery("select * from clickthroughs where username='"+username+"' and query='"+query+"'");

                  if(rs1.next())
          {
             query= rs1.getString(5);
          }
         
         }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }


        Custom custom=new Custom();
        String rr[]=custom.search(query);
        System.out.println("Ant search query");
               
        String a=rr[0];
        String b=rr[1];
        String c=rr[2];
        String d=rr[3];
        String e=rr[4];
        String f=rr[5];
        String g=rr[6];
        String h=rr[7];
        String i=rr[8];
        String j=rr[9];
        String k=rr[10];
        String l=rr[11];
        String m=rr[12];
        String n=rr[13];
        String o=rr[14];
        String p=rr[15];
        String q=rr[16];
        String r=rr[17];
        String s=rr[18];
        String t=rr[19];
        String u=rr[20];       
        String v=rr[21];
        String w=rr[22];
        String x=rr[23];
        String y=rr[24];
        String z=rr[25];
        String aa=rr[26];
        String bb=rr[27];
        String cc=rr[28];
        String dd=rr[29];
        
            
        
        

         
        %>
        </p>
        <p> </p>
        <p>                <font color="FFFFFF">       </font>   <h1>Search results</h1>
        </p>
                            <form align="right" name="form1" method="post" action="Logout">
  <label class="logoutLblPos">
  <input class="button-0"name="submit2" type="submit" id="submit2" value="log out">
  </label>
</form>
        <form align="right" name="form1" method="post" action="TitleProcessing">
                         <h3 align="right">Clickthrough submit</h3>
                        <input type="text" name="tit" id="tit">
                        <input class="myButton" type="submit" name="submit" id="submit" value="submit">
                        
        </form>
        <h3 align="center"></h3>
       <a onclick="msg('<%=a%>')" href="http://<%=c%>" target="_blank"><%=a%> </a><br>
       <h7> <%=b%> </h7>
               <h3 align="center"></h3>
       <a  href="http://<%=f%>"  onclick="msg('<%=d%>')" target="_blank"><%=d%> </a><br>
       <h7> <%=e%> </h7>
               <h3 align="center"></h3>
       <a  href="http://<%=i%>" onclick="msg('<%=g%>')" target="_blank"><%=g%> </a><br>
       <h7> <%=h%> </h7><br>
               <h3 align="center"></h3>
       <a  href="http://<%=l%>" onclick="msg('<%=j%>')" target="_blank"><%=j%> </a><br>
       <h7> <%=k%> </h7><br>
               <h3 align="center"></h3>
       <a  href="http://<%=o%>" onclick="msg('<%=m%>')" target="_blank"><%=m%> </a><br>
       <h7> <%=n%> </h7><br>
               <h3 align="center"></h3>
       <a  href="http://<%=r%>" onclick="msg('<%=p%>')" target="_blank"><%=p%> </a><br>
       <h7> <%=q%> </h7><br>
               <h3 align="center"></h3>
       <a  href="http://<%=u%>" onclick="msg('<%=s%>')" target="_blank"><%=s%> </a><br>
       <h7> <%=t%> </h7><br>
               <h3 align="center"></h3>
       <a  href="http://<%=x%>" onclick="msg('<%=v%>')" target="_blank"><%=v%> </a><br>
       <h7> <%=w%> </h7><br>
               <h3 align="center"></h3>
       <a  href="http://<%=aa%>" onclick="msg('<%=y%>')" target="_blank"><%=y%> </a><br>
       <h7> <%=z%> </h7><br>
               <h3 align="center"></h3>
       <a  href="http://<%=dd%>" onclick="msg('<%=bb%>')" target="_blank"><%=bb%> </a><br>
       <h7> <%=cc%> </h7><br>
 

   
        
       <script>
function msg(title) {

  var val=document.getElementById('tit').value;
	if(val=='') {
		document.getElementById('tit').value=title;
	}
	else {
	document.getElementById('tit').value=title;
	alert(title);
	}
}
</script>
        

        
    </body>
</html>
