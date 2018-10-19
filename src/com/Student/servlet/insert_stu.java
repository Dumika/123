package com.Student.servlet;

import java.sql.*;
class insert_stu{
final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
final String DB_URL = "jdbc:mysql://localhost/student_register";
final String USER = "root";
final String PASS = "";

//Data inserting sql
public void insertTable(String index,String name,String mobile,String email) {
Connection con = null;
PreparedStatement pstmt = null;
try {
Class.forName(JDBC_DRIVER);
try {
System.out.println("Connecting to Database...");
con = DriverManager.getConnection(DB_URL, USER, PASS);
System.out.println("Executing SQL...");
String sql = "INSERT INTO register " +
"VALUES (?, ?, ?, ?)";
pstmt = con.prepareStatement(sql);

pstmt.setString(1, index);
pstmt.setString(2, name);
pstmt.setString(3, mobile);
pstmt.setString(4, email);

int affectedRows = pstmt.executeUpdate();
System.out.println(affectedRows + " row(s) affected !!");
System.out.println("Recode Insert successfully...");
} catch (SQLException e) {
e.printStackTrace();
} finally {
try {
if (null != pstmt) {
pstmt.close();
}
if (null != con) {
con.close();
}
} catch (SQLException e) {
e.printStackTrace();
}
}
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
}

//Data inserting method
public void insertData(String index,String name,String mobile,String email) {
	insert_stu ea=new insert_stu();
	ea.insertTable(index,name,mobile,email);
	System.out.println("Data insert successfully");
}

//Data selecting sql
public void recodeSelector(String index) {
Connection con = null;
PreparedStatement pstmt = null;
ResultSet rs=null;
try {
Class.forName(JDBC_DRIVER);
try {
System.out.println("Connecting to Database...");
con = DriverManager.getConnection(DB_URL, USER, PASS);
System.out.println("Executing SQL...");
String sql;
sql= "Select * From register Where IndexNo = ?";

pstmt = con.prepareStatement(sql);

pstmt.setString(1, index);
rs=pstmt.executeQuery();
while(rs.next()) {
	String indexNo=rs.getString("IndexNo");
	String name=rs.getString("Name");
	String mobile=rs.getString("Mobile");
	String email=rs.getString("Email");
	System.out.println("Index is:"+indexNo);
	System.out.println("Name is:"+name);
	System.out.println("Mobile is:"+mobile);
	System.out.println("Email is:"+email);
}

//int affectedRows = pstmt.executeUpdate();
//System.out.println(affectedRows + " row(s) affected !!");

System.out.println("Recode selected successfully...");
} catch (SQLException e) {
e.printStackTrace();
} finally {
try {
if (null != rs) {
rs.close();
}
if (null != con) {
con.close();
}
if (null != pstmt) {
pstmt.close();
}
} catch (SQLException e) {
e.printStackTrace();
}
}
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
}

//Data selecting method
public void selectData(String index) {
	insert_stu insert_1=new insert_stu();
	insert_1.recodeSelector(index);
}
}
