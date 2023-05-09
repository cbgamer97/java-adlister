<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if(request.getMethod().equals("POST")){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equalsIgnoreCase("admin") && password.equals("password")){
            response.sendRedirect("/profile.jsp");
        } else {
            response.sendRedirect("/profile.jsp");
        }
    }
%>

<html>
  <head>
    <title>Title</title>
  </head>
  <body>
      <form method="post" action="login.jsp">
          <label for="username">Username:</label>
          <input type="text" id="username" name="username" />
          <label for="password">Password:</label>
          <input type="password" id="password" name="password" />
          <input type="submit" value="Login">
      </form>
  </body>
</html>
