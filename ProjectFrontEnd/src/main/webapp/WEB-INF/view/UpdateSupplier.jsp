<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<%@include file="Home1.jsp"%>

<title>Update supplier</title>
<style>
.background
{
   height: 800px;
   background-image: url("https://wallpapertag.com/wallpaper/full/1/d/b/106821-vertical-bamboo-background-1920x1080-image.jpg");
   background-repeat: no-repeat;
   background-size: 100%;
}
</style>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="background">
<h4 align="center">Supplier Updation</h4>
<div class="container">
    <form class="form-horizontal" action="<c:url value="/UpdateSupplier"/>" method="post">
  <div class="form-group">
    <label class="control-label col-sm-2" for="text">Supplier ID:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" readonly id="supid" name="supid" value="${supplierInfo.supplierId}"/>
    </div>
  </div>

  <div class="form-group">
    <label class="control-label col-sm-2" for="text">Supplier Name:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="supname" name="supname" value="${supplierInfo.supplierName}"/>
    </div>
  </div>
	
  <div class="form-group">
    <label class="control-label col-sm-2" for="text">Location:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="suploc" name="suploc" value="${supplierInfo.location}"/>
    </div>
  </div>
  
  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Submit</button>
      <button type="submit" class="btn btn-default">Reset</button>
    </div>
  </div>
	
	</form>
	</div>
	
	
<div class="container">
	   <table class="table table-bordered">
	   <thead>
		<td>Supplier ID</td>
		<td>Supplier Name</td>
		<td>Location</td>
		<td>Operation</td>
		
	</thead>
	<c:forEach items="${listSupplier}" var="supplier">
	<tr>
		<td>${supplier.supplierId}</td>
		<td>${supplier.supplierName}</td>
		<td>${supplier.location}</td>
		<td>
		<a href="<c:url value="/updateSupplier/${supplier.supplierId}"/>">Update</a>/
		<a href="<c:url value="/deleteSupplier/${supplier.supplierId}"/>">Delete</a>
		</td>
	</tr>
	</c:forEach>
	
</table>
</div>
</div>

<--!%@ include file="Footer.jsp" %-->

</body>
</html>