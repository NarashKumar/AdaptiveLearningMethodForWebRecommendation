<%-- 
    Document   : index
   
    Author     : Mujahid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<META Http-Equiv="Cache-Control" Content="no-cache">
<META Http-Equiv="Pragma" Content="no-cache">
<META Http-Equiv="Expires" Content="0">
<html dir="ltr" lang="en-US">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<title>Search</title>

	<!-- CSS -->
	<link rel="stylesheet" href="style_1.css" type="text/css" />

	<!-- Fonts -->
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,700italic,400,600,700' rel='stylesheet' type='text/css'>

	<!-- jQuery -->
	<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>

	<!-- jQuery Easing -->
	<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>

	<!-- Functions -->
	<script type="text/javascript" src="js/functions.js"></script>
        <script type="text/javascript">
            
       	function call()
	{
		var q=document.getElementById("query").value;
		window.location.href = "sematic.jsp?"+q;
	}
</script>
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
        String Username=session.getAttribute("Username").toString();
	String path="C:/Users/System32/Downloads/google-maps-api-master/Lesson03-HelloMaps/MM.html";
%>
<style>
.logoutLblPos{

   position:fixed;
   right:10px;
   top:5px;
}
</style>
<style>
.button1 {font-size: 20px;
color: black;}
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

	<body>
            <form align="right" name="form1" method="post" action="Logout">
  <label class="logoutLblPos">
  <input class="button-0"name="submit2" type="submit" id="submit2" value="log out">
  </label>
</form>
		<div id="search-form">
			<form class="form-container" name="form1" method="post" action="Search">
				<input type="text" class="search-field" name="query" id="query" value="Type search text here..." />
				<div class="submit-container">
					<input type="submit" value="" name="submit" id="submit" class="submit" />
                                       
				</div>
                                
			</form>
			<div class="popup">
				<p>Please fill out this field.</p>
			</div>
		</div>
             <input type="button" value="" id="" name="sematicButton" onClick="call()" /></td>
             
	

	</body>
</html>
