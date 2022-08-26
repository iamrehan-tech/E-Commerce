
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<%@include file="component/CS_JS.jsp"%>
</head>
<body>
	<%@include file="component/navbar.jsp"%>
<div class="alert alert-danger alert-dismissible fade show" role="alert">
  <strong>This Product is not available in this pincode!!  </strong>
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
  
</div>

	<form action="filterproduct" method="post" class="form-inline mt-3 "
		style="margin-left: 1.5em;">
		<div class="form-group col-md-4" style="margin-left: 24em;">
			<label for="inputState"></label><strong> </strong></br> <select
				id="inputState" class="form-control" name="filtering">
				<option selected>select price by range</option>
				<option
					label="Search Product bitween  &#x20b9;100 to  &#x20b9;10000">
					10000</option>

				<option label="Above Price of Product Up to => &#x20b9;20000">20000</option>
			</select>
			<button style="margin-left: 1em;" class="btn btn-outline-success">submit</button>
		</div>
	</form>


	<div class="row mt-3 mx-2">


		<div class="col-md-12">

			<div class="row" mt-4>

				<div class="col-md-12">

					<div class="card-group">

						<c:forEach var="product" items="${result}">
							<div class="col-md-4">
								<div class="card">
									<div class="container text-center mt-1">
										<%-- <img alt="profile"  src="<c:url value="/resources/img/${product.pphotos}"/>"/> --%>
										<img class="img-fluid" alt="Responsive image"
											src="<c:url value="/resources/img/${product.pphotos}" />">
									</div>

									<div class="card-body">

										<h4
											style="font-family: initial; color: brown; font-size: 18px;">*
											${product.productname}</h4>
										<h4 style="font-family: initial; font-size: 18px;"">*
											${product.producdesc}</h4>
										<h4 style="font-family: initial; font-size: 18px;">*
											${product.productbrand}</h4>

									</div>


									<div class="card-footer">


										<c:if test="${pincode1==true}">
											<h4
												style="font-family: initial; color: brown; font-size: 18px;">
												<strong>Price : &#8377; ${product.productprice}</strong>
											</h4>

										</c:if>
										<form action="pincodes" method="post">
											<div class="form-group">
												<input name="pincode" type="text" class="form-control"
													placeholder="Enter pincode check Product available or not"
													aria-describedby="emailHelp">
											</div>
											<button name="pcode" class="btn btn-outline-primary ">Check</button>

										</form>
									</div>

								</div>


							</div>


						</c:forEach>


					</div>

				</div>
			</div>

		</div>
	</div>
</body>
</html>









