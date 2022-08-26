
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<%@include file="component/CS_JS.jsp"%>
<style>
.discount{
color:brown;
}
</style>
</head>
<body>
	<%@include file="component/navbar.jsp"%>


	<div class="row mt-3 mx-2">


		<div class="col-md-12">

			<div class="row" mt-4>

				<div class="col-md-12">

					<div class="card-group">

						<c:forEach var="product" items="${searchapi}">
							<div class="col-md-3">
								<div class="card" style="margin-top:0.5em;border-radius:0px;">
									<div class="container text-center mt-1">

										<img class="img-fluid" alt="Responsive image"
											src="<c:url value="/resources/img/${product.pphotos}" />">
									</div>

									<div class="card-body">

										<h4
											style="font-family: initial; color: brown; font-size: 18px;">*
											${product.productname}</h4>
											<h4 style="font-family: initial; font-size: 18px;">*
											${product.productbrand}</h4>
										<h4>
											<small style="font-size: 18px;"> Discount </small><strong
												style="font-family: initial; font-size: 18px;"
												class="discount"> *${product.productdiscount}</strong>
										</h4>



									</div>


								<!-- 	<div class="card-footer"> -->


										<c:if test="${keys==true}">
											<h4>
												<strong style="font-family: fantasy;margin-left:1em;">Price :
													&#8377; ${product.productprice}</strong>
													<h4 style="font-family: initial; font-size: 14px;">*
											${product.producdesc}</h4> 
											</h4>
										</c:if>

                                   <c:if test="${keys==true}">
										<form action="pincodes" method="post">
											<div class="form-group">

												<input name="pincode" style="border:none;" type="text" class="form-control"
													placeholder="Enter pin code" aria-describedby="emailHelp">
											</div>

											<button name="pcode" class="btn btn-outline-warning " style="border-radius:0px;">Check</button>

										</form>
                                      </c:if>
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









