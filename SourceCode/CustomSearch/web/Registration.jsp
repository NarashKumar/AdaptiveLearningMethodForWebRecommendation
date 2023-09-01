<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Registration</title>
        
      
        <link rel="stylesheet" href="styles.css" />
         
      
    </head>
    <script>  
function validateform(){ 
  
var nameRegex =/^[A-Za-z]+$/;
var name=document.form1.username.value.match(nameRegex);  
var password=document.form1.password.value;
var email=document.form1.email.value.indexOf("@");
var confirm=document.form1.confirm.value;

  
if (name==null || name==""){  
  alert(" please Don't give numbers");  
  return false;  
}

else if(password.length<6){  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }  
  else if(email==-1){
      alert("Enter valid email id");
      return false;
  }
  else if(password!=confirm){
      alert("Password does not match");
      return false;
  }
}  
</script> 
    
    <body>

<p class="texto">Registration</p>
<div class="fontawesome-user">
<form name="form1" method="post" action="UserRegServlet" onsubmit="return validateform()">

<span class="fontawesome-user"></span><input type="text" name="username" id="username" required placeholder="username" autocomplete="off"> <br><br>
<span class="fontawesome-envelope-alt"></span><input type="email" name="email" id="email" required placeholder="Email" autocomplete="off"><br><br>
<span class="fontawesome-lock"></span><input type="password" name="password" id="password" required placeholder="Password" autocomplete="off"> <br><br>
<span class="fontawesome-lock"></span><input type="password" name="confirm" id="confirm" required placeholder="Confirm password" autocomplete="off"> <br><br>
<span class="fontawesome-lock"></span><select name="Gender"><option>Male</option><option>Female</option></select> <br><br>

<input type="submit" type="submit" name="submit" id="submit" value="submit" title="Registra tu cuenta">  <br><br>
    
</form>               
                        </body>
</html>