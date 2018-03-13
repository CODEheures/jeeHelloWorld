<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Veuillez vous identifier</title>
	<link rel='stylesheet' type='text/css' href='styles.css'>
</head>
<body>
	<h1>Veuillez vous identifier</h1>
	<form method='post' action='login'>
		<label for='txtLogin'>Login</label>
		<input type='text' name='txtLogin' id='txtLogin' value='${ login }'/><br />
		<label for='txtPassword'>Password</label>
		<input type='password' name='txtPassword' id='txtPassword'/><br /><br />
		<input type='submit' value='Soumettre' />
	</form>
</body>
</html>