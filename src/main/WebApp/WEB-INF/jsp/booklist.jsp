<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LIST OF BOOKS</title>
</head>
<body>
<div class="wrapper">

			
			<div class="content">
				<div class="container-fluid">

					<div class="row">
						<div class="col-md-4">
							
									<h4>List of Books</h4>
								
							


<c:forEach items="${books}" var="Book">
<div>
							<img src ="../assets/images/download.jpg" alt="book" style="width:304px;height:228px;">	
								  <div>
								    <p><span>ID:</span>${Book.id}</p>
									<p><span>BOOKNAME:</span>${Book.bookname}</p>
									<p><span>PRICE:</span>${Book.price}</p>
								<div>
										<button type="btn"><a href="../Book/${Book.id}">ViewDetails</a></button>
									</div>
								</c:forEach>
							</div>

						
						
</div>
</div>
</div>
</div>


</body>
</html>
