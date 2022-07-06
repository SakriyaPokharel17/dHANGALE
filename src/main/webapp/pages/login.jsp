<%--
  Created by IntelliJ IDEA.
  User: activ
  Date: 7/2/2022
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

<div class="login_member" width="50%" align="left">
    <form method="post" action="hello-servlet?form=admin_login">
        <label>
                Email:
        </label>
        <input type="email" name="email" placeholder="Enter your Email">
        <br>
        <label>
            Password:
        </label>
        <input type="password" name="password" placeholder="Enter your Password">
        <br>
    </form>
</div>

</body>
</html>
