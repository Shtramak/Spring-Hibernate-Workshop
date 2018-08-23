<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	<h3>Student form</h3>
	<form:form action="studentProcess" modelAttribute="student" method="GET">
		
		Name: <form:input path="name"/><br>
		
		Surname: <form:input path="surname"/><br>
		
		Age: <form:input path="age"/><br>
		
		Country: <form:select path="country">
			<form:options items="${student.countries}"/>
			<form:option label="PL" value="Poland"/>
		</form:select>
		
		Preferred programming language:<br><br>
		Java <form:radiobutton path="programmingLanguage" value="Java"/>
		C# <form:radiobutton path="programmingLanguage" value="C#"/>
		PHP <form:radiobutton path="programmingLanguage" value="PHP"/><br><br>
		
		Operating Systems:<br>
		<form:checkbox path="operatingSystem" value="Microsoft Windows"/> Microsoft Windows <br>
		<form:checkbox path="operatingSystem" value="Linux"/> Linux <br>
		<form:checkbox path="operatingSystem" value="MAC"/> MAC <br><br>
		
		<input type="submit" value="Submith"/>
		
	</form:form>
</body>
</html>