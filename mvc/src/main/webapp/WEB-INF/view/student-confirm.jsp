<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Greetings!</h2>
	You are welcome ${student.name}, ${student.surname} <br><br>
	Your age is: ${student.age}<br><br>
	Country: ${student.country}<br><br>
	Preferred programming language: ${student.programmingLanguage}<br><br>
	Operating systems:
	<ul>
		<c:forEach var="os" items="${student.operatingSystem}">
		<li>${os}</li>
		</c:forEach>
	</ul>
</body>
</html>