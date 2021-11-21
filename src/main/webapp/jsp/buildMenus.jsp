<html>
<body>
<h2>BuildMenus</h2>
<%
System.out.println("build Menus page redirecting");
String contextPath=request.getContextPath();
%>

<%
String conextPath = request.getContextPath();
String url = conextPath+"/buildMenus";
%>
<script>
      var contextPath="<%=contextPath%>";
      var indexUrl = contextPath+"/frameset?__report=Report/SalesInvoice.rptdesign"
      window.location.href=indexUrl;
</script
</body>
</html>