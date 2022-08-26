
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

	<div class="row mt-3 mx-2">


		<div class="col-md-12">

			<div class="row" mt-4>

				<div class="col-md-12">

					<div class="card-group">

						<c:forEach var="product" items="${filter}">
							<div class="col-md-3">
								<div class="card" style="border-radius:0px;">
									<div class="container text-center mt-1">
										<%-- <img alt="profile"  src="<c:url value="/resources/img/${product.pphotos}"/>"/> --%>
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
									<small style="font-size: 18px;"> Discount </small><strong style="font-family: initial; font-size: 18px;" class="discount" >
											*${product.productdiscount}</strong>
										</h4>
											
								<c:if test="${keys==true}">			
										<h4 style="font-family: initial; font-size: 18px;">*
											${product.producdesc}</h4>
								

	                                   <%--   <c:if test="${keys==true}"> --%>
											<h4
												style="font-family: initial; color: brown; font-size: 18px;margin-left:1em;">
												<strong>Price : &#8377; ${product.productprice}</strong>
											</h4>

										</c:if>
									</div>


									<!-- <div class="card-footer"> -->

                                    	<c:if test="${key6==true}">

			                         <h4 style= "color: black; margin-left:1em;font-size:18px;">&#8377; ${product.producdesc}</h4> 

										</c:if>

										<c:if test="${key6==true}">

			                         <h4 style= "color: brown;margin-left:1em;">&#8377; ${product.productprice}</h4> 

										</c:if>
										
										<c:if test="${keys==true}">
										<form action="pincodes" method="post">
											<div class="form-group">

												<input name="pincode" style="border:none;" type="text" class="form-control"
													placeholder="Enter pincode check product available or not"
													aria-describedby="emailHelp">
											</div>
											<button name="pcode" style="margin-left:1.5em;margin-bottom:1em;border-radius:0px;" class="btn btn-outline-warning ">Check</button>
									   
											
										</form>
										</c:if>
										
								<!-- 	</div> -->

								</div>


							</div>


						</c:forEach>


					</div>

				</div>


			</div>


		</div>

	</div>
	
	  <script>
</script>

</body>
</html>









