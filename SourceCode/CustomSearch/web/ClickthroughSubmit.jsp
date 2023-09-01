<%-- 
    Document   : ClickthroughSubmit
    
    Author     : Java
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="sub.css" type="text/css" />
        <style type="text/css">
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
<style>
body {
    background-color: bisque;
}
</style>
    </head>
    <body>

        <div class="diffuse-light">Submitted clickthrough</div>
<link async href="http://fonts.googleapis.com/css?family=Arizonia" data-generated="http://enjoycss.com" rel="stylesheet" type="text/css"/>
                    <form align="right" name="form1" method="post" action="Logout">
  <label class="logoutLblPos">
                                <input class="button-0"align="center"name="submit2" type="submit" id="submit2" value="log out">
  </label>
</form>
    </body>
</html>
