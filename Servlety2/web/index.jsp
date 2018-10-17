<%@ page import="model.Person" %><%--
  Created by IntelliJ IDEA.
  User: Krzysztof Podlaski
  Date: 10.10.2018
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table>
    <tr>
      <td> Sokol 1</td><td><img src="images/sokol.png"></td>
    </tr>
  </table>
  <%
      for (int i=0; i<10;i++){
          out.println(i);
      }
      Person osoba = new Person("Adam","Adamiak");
  %>
  <b>
      <%=2*3+17
      %>
      <% for(int i = 0; i<3; i++){

      %>
      <%=osoba.desc()

      %>
      <% } %>

  </b>
  </body>
</html>
