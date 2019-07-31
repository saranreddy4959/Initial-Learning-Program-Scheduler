<%@ page import="com.bean.Schedule" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<TITLE>Lg List</TITLE>
<link rel="icon" type="image/ico" href="favicon.ico"/>
<link rel="Stylesheet" href="list.css"/>
</head>
<body>
<center></center>
<img src="images/logo.png">
<h1 class="header-text">ILP Schedule</h1>
</center>
<%ArrayList<Schedule> list=(ArrayList<Schedule>)request.getAttribute("list"); %>

<%System.out.println(list); %>
<style> table,th,td{
 border: 1px solid black;
}
</style>
<table bgcolor="white">
<tr  class="tabl">

<th>BATCH</th>
<th>LG</th>
<th>SCHEDULEDATE</th>
<th>SLOT </th>
<th>COURSEID</th>
<th>COURSENAME</th>
<th> FACULTY NAME</th>
</tr>

<tr>
<%for(Schedule schedule:list){ %>
<tr>
<td><%=schedule.getBatch() %></td>
<td><%=schedule.getLg() %></td>
<td><%=schedule.getSch_date() %></td>
<td><%=schedule.getSlot() %></td>
<td><%=schedule.getCourse_id() %></td>
<td><%=schedule.getCourse_name() %></td>
<td><%=schedule.getFaculty()%></td>

</tr>
<%} %>


</table>













</body>
</html>