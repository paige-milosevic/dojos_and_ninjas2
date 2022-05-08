<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Dojo</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<form:form action="/dojos/new" method="post" modelAttribute="dojo">
			<h1>New Dojo</h1>
			<form:errors path="name" class="errors"></form:errors>
			<form:label path="name" >Name: </form:label>
			<form:input type="text" path="name"/>
			<button type="submit">Create</button>
		</form:form>
	</div>

</body>
</html>