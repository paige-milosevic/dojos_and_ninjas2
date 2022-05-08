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
		<form:form action="/ninja/create" method="post" modelAttribute="ninja">
			<h1>New Ninja</h1>
			<div>
				<form:label path="dojo">Dojo</form:label>
				<form:select path="dojo">
					<c:forEach items="${dojos}" var="dojo">
					<option value="${dojo.id}"><c:out value="${dojo.name}"></c:out></option>
					</c:forEach>
				</form:select>
			</div>
			<div>
				<form:label path="firstName">First Name: </form:label>
				<form:input path="firstName" type="text"/>
			</div>
			<div>
				<form:label path="lastName">Last Name: </form:label>
				<form:input path="lastName" type="text"/>
			</div>
			<div>
				<form:label path="age">Age: </form:label>
				<form:input path="age" type="number"/>
			</div>
			<button type="submit">Create</button>
		</form:form>
	</div>
</body>
</html>