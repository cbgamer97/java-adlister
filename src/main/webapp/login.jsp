<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if(request.getMethod().equalsIgnoreCase("post")){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals("admin") && password.equals("password")){
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
  <h1>Please Log In</h1>
      <form method="post" action="login.jsp">
          <label for="username">Username:</label>
          <input type="text" id="username" name="username" />
          <label for="password">Password:</label>
          <input type="password" id="password" name="password" />
          <input type="submit" value="Login">
      </form>
  </body>
</html>
