<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="AdminHome.jsp" %>
<div class="background">
<div class="container">
			<div class="row main">
				<div class="panel-heading">
	               <div class="panel-title text-center">
	               		<h3 class="title">Login</h3>
	               		<hr />
	               	</div>
	            </div> 
	            <div class="formAlign">
				<div class="main-login main-center">
					<form id="login-form" class="form-horizontal" action="perform_login" method="POST" role="form">
						<div class="form-group">
							<label for="UserName" class="cols-sm-2 control-label">Username</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="glyphicon glyphicon-user" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="username" id="username"  placeholder="Enter your Username"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="Password" class="cols-sm-2 control-label">Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="glyphicon glyphicon-lock" aria-hidden="true"></i></span>
									<input type="password" class="form-control" id="password" name="password" placeholder="Enter your Password"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<button type="submit" class="btn btn-primary btn-lg btn-block login-button">Login</button>
						</div>
					</form>
				</div>
				</div>
			</div>
		</div></div>
		

<%@include file="Footer.jsp" %>

</body>
</html>