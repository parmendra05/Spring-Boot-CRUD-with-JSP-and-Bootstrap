<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>list</title>
</head>
<body>



<div class="container">

  
  <div><h1> <a class="active" href="list/home"><i class="fa fa-home "></i></a>
  List of Student Information Table</h1>  
  <h2><a href="list/register">Add New</a>  </h2>   </div>
  <table class="table table-dark table-striped">
    <thead>
      <tr>
        <th>Roll</th>
        <th>Name</th>
        <th>City</th>
        <th>Email</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${studentlist}" var="sl">
      <tr>
        <td>${sl.roll}</td>
        <td>${sl.name}</td>
        <td>${sl.city}</td>
        <td>${sl.email}</td>
        <td>
        <a href="/list/${sl.reg_no}/update">
                <button type="submit" class="btn btn-primary">Update</button>
                </a>
                <a href="/list/${sl.reg_no}/delete">
                <button type="submit" class="btn btn-danger">Delete</button>
                </a>
        
        </td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>


</body>
</html>