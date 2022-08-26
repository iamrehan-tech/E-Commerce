<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <script type="<c:url value="resources/img/mobile.png" />">

</script> --%>
<style>
.dropbtn {
  background-color: #343a40;
  color: white;
  padding: 8px;
  font-size: 16px;
  border: none;
  height: 38px;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #ddd;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: #47d7ac;}


#logout{
margin-right:-2em;
margin-left:1em;
}

#search-input{
margin-left:1em;
}
</style>

<nav class="navbar navbar-expand-lg  custom-bg" style="background:#00695C">

<img  class="img-fluid" alt="Responsive image"src="<c:url value="/resources/img/logo.png"/>">

  <div class="container" >
 
    <a class="navbar-brand" href="#" style="color:#47d7ac;font-family: cursive;">E-Commerce Website</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
      <!-- <img style="max-width: 30px; color:white;" src="img/house.svg" /> -->
        
     
   <%--   <a class="nav-link active"  aria-current="true" aria-current="page" href="Addproduct" style="color:white">
     <img  class="center" class="center" style="width:10%; margin-right:0.5em;" alt="Responsive image"src="<c:url value="/resources/img/shopping.png"/>"><button type="button" style="background-color:#00695C;border-radius: 0px;" class="btn btn-danger btn-sm">AddProduct</button> </a>
    --%>     
        

      </ul>
      



   
      <ul class="navbar-nav ml-auto">
    
    
       <li class="nav-item">
           <a class="nav-link active"  aria-current="true" aria-current="page" href="data" style="color:white"> Home</a>   
          </li>

				<div class="dropdown">
					<button class="dropbtn">Search Product By</button>
					<div class="dropdown-content">
						<a href="#">ID</a> <a href="#">Product Name</a> <a href="#">Product
							Brand</a>
					</div>
				</div>

				<li>
           <form action="search" method="post" class="form-inline">   
            <div class="search-container" >
 
          
			 <input name="searchingvalue" type="search" style="border-radius: 0px;" class="form-control"  id="search-input" placeholder="Search..." aria-label="Search" />
			 	
          </div>         
           </form>
         
          </li>
     <c:choose>
               <c:when test="${keys==true||key1==true||keys3==true||key6==true||key==true || pincode1==true || pincode==true}">
            
       <form action="logout" method="post">
       <button style="margin-right:1em; border-radius:0px;" class="btn btn-outline-success" id="logout">Logout</button>
       </form>
        
      </c:when >
      <c:otherwise>
   <!--    <li class="nav-item">
           <a class="nav-link active"  aria-current="true" aria-current="page" href="data" style="color:white"> Home</a>   
          
             
        </li> -->
        
        	   <li class="nav-item">
          <!-- <a class="nav-link active" aria-current="page" href="login" style="color:white">Login</a> -->
         <a href="login"> <button type="button" class="btn btn-dark" style="margin-left:1em;border-radius:0em;">Login</button> </a>
       
        </li>

     <!--  <img style="max-width: 30px; color:white;" src="register.svg"  /> -->
        <li class="nav-item">
          <!-- <a class="nav-link active" aria-current="page" href="index" style="color:white">Register</a> -->
          <a href="Registerpage"> <button type="button" class="btn btn-dark" style="margin-left:1em;border-radius:0em;" >Register</button> </a>
        </li>
      
      </c:otherwise>
      </c:choose>
     <!--       <li>
           <form action="search" method="post" class="form-inline">   
            <div class="search-container" >
 
          
			 <input name="searchingvalue" type="search" style="border-radius: 0px;" class="form-control"  id="search-input" placeholder="Search..." aria-label="Search" />
			 	 <button class="btn btn-outline-success my-2 my-sm-0 " type="submit">Search</button>  
          </div>         
           </form>
         
          </li> -->
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#" style="color:white"></a>
        </li>
        
     
      </ul>
    
    </div>
  </div>
</nav>




