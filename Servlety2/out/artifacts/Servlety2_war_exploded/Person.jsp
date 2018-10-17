<%@ page import="dao.basicimpl.RamDAO" %>
<%@ page import="dao.DAO" %>
<%@ page import="model.Person" %><%--
  Created by IntelliJ IDEA.
  User: Ewa
  Date: 17.10.2018
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    DAO dao = new RamDAO();
    int id = Integer.parseInt(request.getParameter("id"));
    Person p = dao.getPersonById(id);
%>
<html>
<head>
    <title><% p.getName();%>  <%=p.getSurname()%><%=p.getFoto()%></title>
</head>
<body>
<table>
    <tr>
        <td>Imie: </td><td><%=p.getName()%></td>
    </tr>
    <tr>
        <td>Nazwisko: </td><td><%=p.getSurname()%></td>
    </tr>
    <tr>
       <td>Foto: <img src=<%=p.getFoto()%> height="400" width="400"></td>
    </tr>
</table>
</body>
</html>
