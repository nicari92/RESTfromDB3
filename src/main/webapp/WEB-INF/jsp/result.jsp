<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Auto Complete with Spring MVC</title>
<script src="${pageContext.request.contextPath }/resources/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath }/resources/js/jquery-ui.js"></script>
<link
	href="${pageContext.request.contextPath }/resources/css/jquery-ui.css"
	rel="stylesheet" type="text/css">
</head>

<body>
      <h2>Lista dei Hotel:</h2>	
		<c:set var = "i" scope = "session" value = "${0}"/>
		<c:forEach items="${hotels}" var="item">
		<c:if test = "${i == 0}">
        		<ui:define name="content"><c:url value = "${item.getName()}" ></c:url></ui:define>
     		</c:if>
     		<c:if test = "${i != 0}">
			<c:out value="${item.getName()}" />
		</c:if>
		<c:set var = "i" scope = "session" value = "${i + 1}"/>
		</br>
	</c:forEach>
</body>
</html>