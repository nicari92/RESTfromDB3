<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Auto Complete with Spring MVC</title>
<script src="${pageContext.request.contextPath }/resources/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath }/resources/js/jquery-ui.js"></script>
<link
	href="${pageContext.request.contextPath }/resources/css/jquery-ui.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript">
	$(document).ready(function() {
		$('#cityName').autocomplete({
			source : '${pageContext.request.contextPath }/hotel/search',
		});
	});
</script>
</head>


<body>
	  <form action = "/hotel/result" method = "GET">
        Search Hotel by City
		<input type="text" id="cityName" name="cityName">
         <br />
         <input type = "submit" value = "Submit" />
      </form>
</body>
</html>