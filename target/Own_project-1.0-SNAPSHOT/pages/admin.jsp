<%--
  Created by IntelliJ IDEA.
  User: activ
  Date: 7/5/2022
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Login|Register</title>
</head>
<body>


<div class="register_admin" >
    <form method="post" action="hello-servlet?form=admin_register">
        <h1>Register Admin</h1>
        <label>
            Firstname:
        </label>
        <label>
            <input type="text" name="firstname" placeholder="Enter your Firstname" required>
        </label>
        <br>

        <label>
            Middlename:
        </label>
        <label>
            <input type="text" name="middlename" placeholder="Enter your Middlename" required>
        </label>
        <br>
        <label>
            Lastname:
        </label>
        <label>
            <input type="text" name="lastname" placeholder="Enter your Lastname" required>
        </label>
        <br>
        <label>
            Email:
        </label>
        <label>
            <input type="email" name="email" placeholder="Enter your Email" required>
        </label>
        <br>
        <label>
            Password:
        </label>
        <label>
            <input type="password" name="password" placeholder="Enter your Password" required>
        </label>
        <br>
        <label>
            Profile Picture:
        </label>
        <input type="file" name="dp" required>
        <br>
        <button type="submit" value="submit">Register</button>
    </form>
</div>

<div class="login_admin" >
    <h1>Admin Login</h1>
    <form method="post" action="hello-servlet?form=admin_login" >
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
        <button type="submit" value="submit">Login</button>
    </form>
</div>
</body>
</html>
