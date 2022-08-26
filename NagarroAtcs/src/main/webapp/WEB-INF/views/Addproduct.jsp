<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="component/CS_JS.jsp"%>
<%@page isELIgnored="false"%>


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

#uploadbtn {
	border-radius: 0px;
	margin-top: 0em;
	width: 16.5%;
	margin-left: 0.1em;
}
</style>


</head>
<body>
	<%
	String name = (String) request.getAttribute("filename");
	%>


	<%@include file="component/navbar.jsp"%>


	<h4>
		<strong>${msgaddproduct}</strong>
	</h4>
	<div class="row mt-5 ">
		<div class="container-fluid">
			<div class="col-md-6 offset-md-3">
				<div class="card-body px-5">

					<form action="uploadimage" method="post"
						style="margin-bottom: -3em;" enctype="multipart/form-data"
						class="form-inline">

						<h4>
							<strong>${msg}</strong> ${msg1}
						</h4>


						<input type="file" style="margin-top: 2em;" name="profile"
							class="form-control-file" /><br>

						<button class="btn btn-outline-success form-inline is-valid" id="uploadbtn"
							style="margin-top: 0em;">upload</button>
							<p class="valid-feedback">please choose file first!</p>
					</form>

					<form method="post" action="Addproduct">
						<h4 class="text-center my-3">
							<img class="img-fluid" style="width: 7%;" alt="Responsive image"
								src="<c:url value="/resources/img/basket.png"/>">
						</h4>

						<div class="row g-3">


							<div class="col-md-6">

								<label for="UserType" class="form-label">productname</label> <input
									type="text" name="productname" class="form-control"
									placeholder="productname">

							</div>

							<div class="col-md-6">
								<label for="address" class="form-label"> productlocation</label>
								<input name="productlocation" class="form-control"
									placeholder="Enter productlocation" />
							</div>

							<div class="col-md-6">
								<label for="password" class="form-label">Product code</label> <input
									name="productcode" type="text" class="form-control"
									placeholder="Enter Product code"
									aria-describedby="passwordHelp">
							</div>
							<div class="col-md-6">


								<label for="phone" class="form-label">productdiscount</label> <input
									name="productdiscount" type="text" class="form-control"
									placeholder="Enter productdiscount"
									aria-describedby="passwordHelp">

							</div>


							<div class="col-md-6">

								<label for="UserType" class="form-label">product Brand</label> <input
									type="text" name="productbrand" class="form-control"
									placeholder="productname">

							</div>

							<div class="col-md-6">


								<label for="UserType" class="form-label">serviceability</label>

								<input type="text" name="serviceability" class="form-control"
									placeholder="productname" multiple>

							</div>

							<div class="col-md-6">
								<div class="col-md-12"
									style="color: #a31a1a; margin-left: -1em;">
									<p>
										<strong>${negative}</strong>
									</p>
								</div>

								<label for="UserType" class="form-label">productprice</label> <input
									type="text" name="productprice" class="form-control"
									placeholder="productprice">

							</div>




							<div class="col-md-12">
								<label for="email" class="form-label">Productdescripton</label>

								<textarea name="producdesc" style="height: 70px;"
									class="form-control" placeholder="Enter description"></textarea>
							</div>


							<!-- <form action="uploadimage" method="post" -->
							<%-- 	<form 
								style="margin-bottom: -3em;" enctype="multipart/form-data"
								class="form-inline">

								<h4>
									<strong>${msg}</strong> ${msg1}
								</h4>


								<input type="file" name="profile"
									class="form-control-file" /><br>

								<button class="btn btn-outline-success form-inline" onclick="myFinction()"
									id="uploadbtn" style="margin-top: 0em;">upload</button>
							</form> --%>


							<div class="col-12">
								<div class="container text-center">
									<button class="btn btn-outline-success" id="success">AddProduct</button>
									<button class="btn btn-outline-warning" id="warning">Reset</button>

								</div>
							</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>