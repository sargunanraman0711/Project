<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="logo"><img src="https://static1.squarespace.com/static/5893f93486e6c0558d840b31/t/5a81bb8be2c483b9d5125722/1521751132166/?format=1500w" width="20" height="20"/></a>
    </div>
    <ul class="nav navbar-nav">
      <li class=""><a href="">Home</a></li>
      <li><a href="aboutus">About</a></li>
      <li><a href="contactus">Contact</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
          
      <c:if test="${empty SuccessMessage}">
     
    	  <li><a href="register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
    	  <li><a href="logout"><span class="glyphicon glyphicon-log-in"></span> Log Out</a></li>
    </c:if> 
    </ul>
        <ul class="nav navbar-nav navbar-right">
 		
    </ul>
  </div>
</nav>
  


</body>
</html>