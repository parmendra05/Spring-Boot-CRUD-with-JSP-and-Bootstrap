<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="h-100">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>register</title>
</head>
<body class="h-100">


<div class="container h-100">
    <div class="row h-100 justify-content-center align-items-center">
        <div class="col-10 col-md-8 col-lg-6">
<form:form action="saveData"  modelAttribute="student" method='post'>
<h1> Registarion form</h1>
<div class="form-group">
      <label for="usr">Roll :</label>
      <form:input path="roll" class="form-control" value="${student.roll}"/>
    </div>
    
    <div class="form-group">
      <label for="usr">Name :</label>
      <form:input path="name" class="form-control" value="${student.name}" />
    </div>
    
     <div class="form-group">
      <label for="usr">City :</label>
      <form:input path="city" class="form-control" value="${student.city}"/>
      
    </div>
    
    <div class="form-group">
      <label for="usr">Email :</label>
      <form:input path="email" class="form-control" value="${student.email}"/>
      
    </div>
    
    <button type="submit" class="btn btn-primary">Submit</button>
    <a href="/list">Cancel</a>
</form:form>
</div>
</div>
</div>

</body>
</html>