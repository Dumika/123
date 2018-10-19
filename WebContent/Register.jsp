<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Student Registration Form</h2>
  <form action="insertServlet" method="post">
  <div class="form-group">
      <label for="indexNum">Index Number:</label>
      <input type="text" class="form-control" id="indexNum" placeholder="Enter index number" name="index">
    </div>
    <div class="form-group">
      <label for="stuName">Student Name:</label>
      <input type="text" class="form-control" id="stuName" placeholder="Enter your name" name="name">
    </div>
    <div class="form-group">
      <label for="mobileNum">Mobile Number:</label>
      <input type="text" class="form-control" id="mobileNum" placeholder="Enter Mobile Number" name="mobile">
    </div>
    <div class="form-group">
      <label for="email">Email Address:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
    
    <button type="submit" class="btn btn-default">Submit</button>
    <br>
    <br>
    
  </form>
</div>

</body>
</html>