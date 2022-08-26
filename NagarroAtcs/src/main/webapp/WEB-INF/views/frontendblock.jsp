
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<%@include file="component/CS_JS.jsp"%>
<style>

.form-control{
border-radius:0px;
}
#submit{
border-radius:0px;
}
#pinc{
border-radius: 0px;
}
.discount{
color:brown;
}
</style>
</head>
<body>
	<%@include file="component/navbar.jsp"%>

<c:if test="${pincode==true}">
 <div class="alert alert-success alert-dismissible fade show" role="alert" id="pinc">
  <strong>${pin1}  </strong>
  
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div> 
</c:if>

<c:if test="${pincode1==true}">
 <div class="alert alert-danger alert-dismissible fade show" role="alert" id="pinc">
  <strong>${pin2}  </strong>
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
  
</div> 
</c:if>
	<form action="filterproduct" method="post" class="form-inline mt-3 "
		style="margin-left: 1.5em;">
		<div class="form-group col-md-4" style="margin-left: 24em;">
			<label for="inputState"></label><strong> </strong></br> <select
				id="inputState" class="form-control" name="filtering">
				<option selected >select price by range</option>
				<option
					label="Search Product bitween  &#x20b9;100 to  &#x20b9;10000">
					10000</option>
					  <option label="Search Product bitween &#x20b9;1000 to => &#x20b9;5000">1001</option>
	            <option label="Search Product bitween &#x20b9;5000 to => &#x20b9;10000">5001</option>

				<option label="Above Price of Product Up to => &#x20b9;10000">10000</option>
			</select>
			<button class="btn btn-outline-success" id="submit">submit</button>
		</div>
	</form>


	<div class="row mt-3 mx-2">


		<div class="col-md-12">

			<div class="row" mt-4>

				<div class="col-md-12">

					<div class="card-group">

						<c:forEach var="product" items="${result}">
							<div class="col-md-3">
								<div class="card" style="margin-top:0.5em;border-radius:0px;">
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
											
									<strong style="font-family: initial; font-size: 14px;">*
											${product.producdesc} </strong>
											
												<h4>
									<small style="font-size: 18px;"> Discount </small><strong style="font-family: initial; font-size: 18px;" class="discount" >
											*${product.productdiscount}</strong>
										</h4>

									</div>


									<!-- <div class="card-footer"> -->


										<c:if test="${keys==true}">
											<h4
												style="font-family: initial; color: brown; font-size: 18px;margin-left:1em;">
												<strong>Price : &#8377; ${product.productprice}</strong>
											</h4>

										</c:if>
									
                                
									    
										<form action="pincodes" method="post">
									 	
											<div class="form-group">
												<input name="pincode" type="text" style="border:none;" class="form-control"
													placeholder="Using pincode check Product available or not"
													aria-describedby="emailHelp">
											</div>
											 <button name="pcode" class="btn btn-outline-warning " style="border-radius:0px;">Check</button>
											
                                         
										</form>
									
										
									</div>
										

								<!-- </div> -->


							</div>


						</c:forEach>


					</div>

				</div>
			</div>

		</div>
	</div>
	
	
<!--  <script>
function myFunction()
{
     /* location.href = "login"; */
     

	if ("${pincode}" == false) {
		alert("added successfully");
	
		
		} else {
			alert("not added successfully");
			
		}

	}
</script> -->
	
</body>
</html>









