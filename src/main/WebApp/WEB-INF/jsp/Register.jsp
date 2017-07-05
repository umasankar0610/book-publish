<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<style>
input[type=text], input[type=password] {
    width: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
	
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 10%;
}
</style>

<body>
<title>welcome to BookShop</title>
</head>

<body>
<h1>Register</h1>
<form action="adduser" method="POST">
<div>
<label><b>ID</b></label>
<input type="text" name="id" placeholder="enter the id" required>
</div>



<div>
<label><b>UserName</b></label>

<input type="text" name="username" placeholder="enter the username" required>
</div>

<div>
<label><b>Password</b></label>
<input type="password" name="password" placeholder="enter the password" required>
</div>

<div>
<label><b>MobileNo</b></label>
<input type="text" name="mobileno"  placeholder="enter the mobileno" required>
</div>
<div>
<label><b>mailid</b></label>
<input type="text" name="emailid"  placeholder="enter the emailid" required>
</div>


<div>
<label><b>active</b></label>
<input type="text" name="active" >
</div>

<div>
<label><b>role</b></label>
<select name="role">
<option value="user">select</option>
<option value="user">USER</option>
<option value="admin">ADMIN</option>
<option value="author">AUTHOR</option>
</select>
</div>
<div >
<button align="middle" type="submit">Register</button>
</div>
</form>
</body>
</html>