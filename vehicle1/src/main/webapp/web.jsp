<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

	<h1>vehicle Data Base</h1>
	<h3>I N S E R T</h3>
	<form action="process">
		<input type="text" placeholder="Id" name=id><br> <input
			type="text" placeholder="VName" name=vName><br> <input
			type="text" placeholder="vColor" name=vColor><br> <input
			type="text" placeholder="vNum" name=vNum><br> <input
			type="submit">
	</form>
	<br>
	<hr>
	<!-- G E T B Y I D  -->
	<h3>G E T B Y I D</h3>
	<form action="getById">
		<input type="text" placeholder="IdNum" name=id><br> <input
			type="submit"><br>
		<h4>vehicle Details :</h4>
		${key}
	</form>
	<br>
	<hr>

	<!-- G E T B Y N A M E -->
	<h3>G E T B Y N A M E</h3>
	<form action="getByvName">
		<input type="text" placeholder="getByvName" name=vName><br>
		<input type="submit"><br>
		<h4>vehicleName :</h4>
		${key1}
	</form>
	<br>
	<hr>
	<!-- D E L E T E B Y I D -->
	<h3>D E L E T E B Y I D</h3>
	<form action="deleteById">
		<input type="text" placeholder="deleteById" name=id><br>
		<input type="submit"><br>
		<h4>deleted Id: ${key2}</h4>
	</form>
	<br>
	<hr>
	<h3>U P D A T E B Y I D</h3>
	<form action="updateById">
		<input type="text" placeholder="Id" name=id><br> <input
			type="text" placeholder="VName" name=vName><br> <input
			type="text" placeholder="vColor" name=vColor><br> <input
			type="text" placeholder="vNum" name=vNum><br> <input
			type="submit">
		<h3>updated details:${key5}</h3>
	</form>
	<br>
	<hr>
	<h3>G E T A L L</h3>
	<form action="getall">
		<input type="submit">
		${all}<br>
	</form>


</body>
</html>