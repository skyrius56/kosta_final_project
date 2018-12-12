<%@page import="java.util.Date"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="ex1.TodayBean"%>
<%@page import="ex1.HelloBean"%>
<%@page import="ex1.HelloMain"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	ApplicationContext ctx = new GenericXmlApplicationContext("ex1/hello.xml");
	TodayBean tb = ctx.getBean("today",TodayBean.class);
%>

<%= tb.printToday() %>


</body>
</html>