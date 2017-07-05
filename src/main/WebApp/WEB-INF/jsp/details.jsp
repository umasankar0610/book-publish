<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book details</title>
</head>
<body>

<div align="left">
<h1>BookDetails</h1>

     
       
<img src ="../assets/images/download1.jpg" alt="book" align="left" style="width:150px;height:200px;">
	<form action="../orderItems/addToCart" method="POST">

	<input type="hidden" name="book_id" value="${selectbook.id}" />


			<p><span>ID:</span>${selectbook.id}</p>
			<p><span>BOOKNAME:</span>${selectbook.bookname}</p>
			<p><span>AUTHORNAME:</span>${selectbook.authorname}</p>
			<p><span>PUBLISHDATE:</span>${selectbook.publishdate}</p>
			<p><span>PRICE:</span>${selectbook.price}</p>
			<p><span>CONTENT:</span>${selectbook.content}</p>
			<p><span>STATUS:</span>${selectbook.status}</p>
			
			<p><span>QUANTITY:</span><input type="number" name="quantity" min="1" max="100"></p>
										<button type="submit">add to cart</button>
									</form>
			
</div>

</body>
</html>
	


