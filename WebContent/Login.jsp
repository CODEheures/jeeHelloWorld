<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel='stylesheet' type='text/css' href='styles.css'>
</head>
<body>
	<h1>Veuillez vous identifier</h1>
	<h2><%= new Date() %></h2>
	<% for(int i=1; i<=6 ; i++) { %>
	<h<%= i %>>Titre de niveau <%= i %></h<%= i %>>
	<% } %>
	<p>Ok 8</p>
</body>
</html>