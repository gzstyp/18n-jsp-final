<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%
final String path = request.getContextPath();
final String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8" />
    <base href="<%=basePath%>">
    <title><spring:message code='login.title'/></title>
    <link rel="shortcut icon" href="images/favicon.ico" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
  </head>
  <body>
    <spring:message code='login.span'/><br/>
    <spring:message code='login.username'/><br/>
    <spring:message code='login.password'/><br/>
  </body>
</html>