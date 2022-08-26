
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<%@include file="component/CS_JS.jsp"%>
</head>
<style>
.discount{
color:brown;
}

</style>
<body>
	<%@include file="component/navbar.jsp"%>


	<form action="filterproduct" method="post" class="form-inline mt-3 "
		style="margin-left: 1.5em;">
		<div class="form-group col-md-4" style="margin-left: 24em;">
			<label for="inputState"></label><strong> </strong></br> <select
				id="inputState" class="form-control" name="filtering" style="border-radius: 0px;">
				<option selected>Search price by range</option>
				<option
					label="Search Product bitween  &#x20b9;100 to  &#x20b9;1000">
					1000</option>
	    
	            <option label="Search Product bitween &#x20b9;1000 to => &#x20b9;5000">1001</option>
	            <option label="Search Product bitween &#x20b9;5000 to => &#x20b9;10000">5001</option>
				<option label="Above Price of Product Up to => &#x20b9;10000">10001</option>
			</select>
			<button style="border-radius: 0px;" class="btn btn-outline-success">submit</button>
		</div>
	</form>

	<div class="row mt-3 mx-2">

		<div class="col-md-12">

			<div class="row" mt-4>

				<div class="col-md-12">

					<div class="card-group">

						<c:forEach var="product" items="${result}">
							<div class="col-md-3" style="width:100%;">
								<div class="card" style="margin-top:0.5em;border-radius: 0px;">
									<div class="container text-center mt-1">
										<%-- <img alt="profile"  src="<c:url value="/resources/img/${product.pphotos}"/>"/> --%>
										<img class="img-fluid" alt="Responsive image"
											src="<c:url value="/resources/img/${product.pphotos}" />">
									</div>

									<div class="card-body ">

										<h4>
											<strong
												style="font-family: initial; color: brown; font-size: 18px;">*
												${product.productname}</strong>
										</h4>

										<h4>
											<strong style="font-family: initial; font-size: 18px;">*
												${product.productbrand}</strong>
										</h4>
										<h4>
									<small style="font-size: 18px;"> Discount </small><strong style="font-family: initial; font-size: 18px;" class="discount" >
											*${product.productdiscount}</strong>
										</h4>
										<h4>
										<c:if test="${keys==true}">
											 <strong style="font-family: initial; font-size: 14px;">*
												${product.producdesc} </strong> 
										</c:if>
										</h4>

									</div>


									<!-- <div class="card-footer"> -->
										<form action="login" style="align:center;">
											<button class="btn btn-outline-warning text-black" style="border-radius: 0px;">View
												Price & Desc</button>
										</form>

									<!-- </div> -->

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









