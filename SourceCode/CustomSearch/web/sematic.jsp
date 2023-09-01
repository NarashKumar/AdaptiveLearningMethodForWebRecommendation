

<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sematic Words</title>
       <script>
function msg(title) {


	alert(title);
	
}
</script>
</head>
<body align="center">
<%!
public String semanticSearch(String query, String path) {
    try {
        
        System.out.println("@@@@@@@@ "+path+"Query:"+query);
        File[] semanticdb = new File("D:/WORDS/").listFiles();
        System.out.println("$$$$$ "+semanticdb.length);
            for(File semanticfile : semanticdb) {
                if(semanticfile.isDirectory()) {
                    File[] semanticfile1 = new File(semanticfile.getAbsolutePath()).listFiles();
                        for(File readfile : semanticfile1) {
                            BufferedReader reader = new BufferedReader(new FileReader(readfile));
                            String line = reader.readLine();
                            String[] splitwords = line.split(" ");
                                for(String word : splitwords) {
                                    if(query.equalsIgnoreCase(word)) {
                                        return line;
                                    }
                                }
                        }
                   
                }
                else if(semanticfile.isFile()) {
                BufferedReader reader = new BufferedReader(new FileReader(semanticfile));
                String line = reader.readLine();
                String[] splitwords = line.split(" ");
                    for(String word : splitwords) {
                        if(query.equalsIgnoreCase(word)) {
                            return line;
                        }
                    }
                }
            }
        }
         catch (Exception ex) {
            System.out.println(ex.getMessage());
         	//Logger.getLogger(SearchSemantic.class.getName()).log(Level.SEVERE, null, ex);
        }
    return "not found";
}

%>
<%
String query,semword;

query=request.getQueryString();
ServletContext servletContext = getServletContext();
String contextPath = servletContext.getRealPath(File.separator);
System.out.println(contextPath);
//Sematic sem=new Sematic();
String match=semanticSearch( query,contextPath);





System.out.println(match);
 StringTokenizer stk=new StringTokenizer(match," ");
 while(stk.hasMoreElements())
{
    semword=stk.nextToken();
System.out.println(semword);
%>

<a  href="And.jsp?<%=semword%>" onclick="msg('<%=semword%>')" target="_blank"><%=semword%> </a><br>

<% 
}
 
 
 
%>
</body>
</html>