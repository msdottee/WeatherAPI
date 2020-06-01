<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forecast</title>
</head>
<body>
<h1>Forecast for <c:out value="${forecast.location}"/></h1>
<ul>
<c:forEach items="${dailyForecastList}" var="dailyForecast">
<li><c:out value="${dailyForecast.day} - ${dailyForecast.textForecast}"/></li>
</c:forEach>
</ul>

</body>
</html>