<html>
<body>
<h2>Hello World!</h2>
<% System.out.println("index page redirecting"); %>
<%
String conextPath = request.getContextPath();
String url = conextPath+"/jsp/buildMenus.jsp";
System.out.println("got url = " + url);
%>
<jsp:forward page="/buildMenus"/>
</body>
</html>
