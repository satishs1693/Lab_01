<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@page import ="java.util.*,java.io.*"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><bean:write name="helloForm" property="hello"/></title>
</head>
<body>
    <h1><bean:write name="helloForm" property="hello"/></h1>
<%out.print("satish"); %>
<%=session%></br>
<%=session.getSessionContext()%></br>
<%=session.getId()%></br>
<%request.setAttribute("satish", "satishkkkkkkkkk") ;%>

<h1>${param.java}</h1>
<%!
	public int add ( int a, int b){
	return a+b;
   }
%>
<% %>
<%for (int i =0 ; i < 5 ; i++){ %>
	<br>The i value =<%=add(i, i+1)%></br>
<% }%>
</body>
</html>	