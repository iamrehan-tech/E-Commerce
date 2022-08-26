
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User</title>
<%@include file="component/CS_JS.jsp"%>



<style>
.form-control {
	border-radius: 0px;
}

#success {
	border-radius: 0px;
}

#warning {
	border-radius: 0px;
}
</style>


</head>
<body>
	<%@include file="component/navbar.jsp"%>

	<div class="row mt-5 ">
		<div class="container-fluid">
			<div class="col-md-6 offset-md-3">
				<div class="card">

					<div class="card-body px-5">

						<form method="post" style="color: white;border-radius:0px;" action="Register">
               
							<h3 class="text-center my-3">
								<img class="center" class="center" style="width: 10%;"
									alt="Responsive image"
									src="<c:url value="/resources/img/personal.png"/>">
							</h3>

							<div class="row g-3">
							
							
								<div class="col-md-6">

									<!-- <label for="name" class="form-label">User Name</label> 
									<input name="username" type="text" class="form-control"
										placeholder="Enter name" aria-describedby="nameHelp"> -->
										
				<label for="validationServer01">First name</label>
				 <input type="text" class="form-control is-valid" id="validationServer01" placeholder="First name" name="username"
										required>
									 <p class="valid-feedback">Enter correct name!</p> 
								</div>
         
								<div class="col-md-6">

									<label for="email" class="form-label">User Email</label> <input
										name="useremail" type="email" class="form-control " id="validationServer01"
										placeholder="Enter email" aria-describedby="emailHelp">
										

								</div>
								<div class="col-md-6">


									<label for="password" class="form-label">User Password</label>
									<input name="userpassword" type="password" class="form-control "
										placeholder="Enter password" aria-describedby="passwordHelp">
                                       
								</div>
								<div class="col-md-6">

									<label for="phone" class="form-label">User confirm
										password</label> <input name="userconfirmpassword" type="password"
										class="form-control " placeholder="Enter confirm password "
										aria-describedby="passwordHelp">
                                      
								</div>
							 	<div class="col-md-12">

									<label for="address" class="form-label">User Address</label>
									<textarea name="useraddress" style="height: 70px;"
										class="form-control " placeholder="Enter User address"></textarea>

								</div>
							
							<!--	<div class="col-md-6">

									<label for="UserType" class="form-label">User Type</label> <input
										type="text" name="usertype" class="form-control"
										placeholder="User Which Type admin/user">

								</div> -->

								<div class="col-12">
									<div class="container text-center">
										<button class="btn btn-outline-success" id="success">Register</button>
										<button class="btn btn-outline-warning" id="warning">Reset</button>

									</div>
								</div>
								</div>
						</form>

					</div>

				</div>


			</div>

		</div>

	</div>
</body>
</html>