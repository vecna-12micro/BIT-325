<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vehicle Registration</title>
</head>

<body>
<h2>Welcome to NTSA Online Car Registration Portal</h2>

<form action="registerservlet" method="post">

<table>

<tr>
<td> Vehicle Name</td>
<td> <input type="text" name="VM"> </td>
</tr>

<tr>
<td> Number Plate </td>
<td> <input type="text" name="NP"> </td>
</tr>

<tr>
<td> Owner's Name</td>
<td> <input type="text" name="ON"> </td>
</tr>

<tr>
<td> Mileage </td>
<td> <input type="number" name="Mil"> </td>
</tr>

<tr>
<td> Chasis Code </td>
<td> <input type="text" name="cc"> </td>
</tr>

</table>

<input type="submit" value= "Register" >  

<input type="reset" value="Go Back">
</form>
</body>
</html>