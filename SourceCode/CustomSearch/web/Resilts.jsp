<%-- 
    Document   : Resilts
    Created on : Jun 19, 2016, 8:53:26 PM
    Author     : Java
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page  import="mypack.StopWordsManager" %>

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
<style type="text/css">
.button-0 {
    position: relative;
    padding: 10px 40px;
    margin: 0px 10px 10px 0px;
    float: left;
    border-radius: 10px;
    font-family: 'Helvetica', cursive;
    font-size: 10px;
    color: #FFF;
    text-decoration: none;  
    background-color: #3498DB;
    border-bottom: 5px solid #2980B9;
    text-shadow: 0px -2px #2980B9;
    /* Animation */
    transition: all 0.1s;
    -webkit-transition: all 0.1s;
}

.button-0:hover, 
.button-0:focus {
    text-decoration: none;
    color: #fff;
}

.button-0:active {
    transform: translate(0px,5px);
    -webkit-transform: translate(0px,5px);
    border-bottom: 1px solid;
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
       
        
        String a=session.getAttribute("a").toString();
        String b=session.getAttribute("b").toString();
        String c=session.getAttribute("c").toString();
        String d=session.getAttribute("d").toString();
        String e=session.getAttribute("e").toString();
        String f=session.getAttribute("f").toString();
        String g=session.getAttribute("g").toString();
        String h=session.getAttribute("h").toString();
        String i=session.getAttribute("i").toString();
        String j=session.getAttribute("j").toString();
        String k=session.getAttribute("k").toString();
        String l=session.getAttribute("l").toString();
        String m=session.getAttribute("m").toString();
        String n=session.getAttribute("n").toString();
        String o=session.getAttribute("o").toString();
        String p=session.getAttribute("p").toString();
        String q=session.getAttribute("q").toString();
        String r=session.getAttribute("r").toString();
        String s=session.getAttribute("s").toString();
        String t=session.getAttribute("t").toString();
        String u=session.getAttribute("u").toString();        
        String v=session.getAttribute("v").toString();
        String w=session.getAttribute("w").toString();
        String x=session.getAttribute("x").toString();
        String y=session.getAttribute("y").toString();
        String z=session.getAttribute("z").toString();
        String aa=session.getAttribute("aa").toString();
        String bb=session.getAttribute("bb").toString();
        String cc=session.getAttribute("cc").toString();
        String dd=session.getAttribute("dd").toString();
               
        
        
        

       
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
       <a onclick="msg('<%=a%>')" href="http://<%=c%>" target="_blank"><%=a%> </a><br
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
