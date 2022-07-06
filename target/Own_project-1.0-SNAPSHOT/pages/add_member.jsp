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
    <title>dHANGALE</title>
</head>
<body>
<h1>
    Be a member:
</h1>
<div class="member_admin">
    <form method="post" action="hello-servlet?form=member_register">
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
            <input type="text" name="middlename" placeholder="Enter your Middlename"required>
        </label>
        <br>
        <label>
            Lastname:
        </label>
        <input type="text" name="lastname" placeholder="Enter your Lastname" required>
        <br>
        <label>
            Email:
        </label>
        <input type="email" name="email" placeholder="Enter your Email" required>
        <br>
        <label>
            Password:
        </label>
        <input type="password" name="password" placeholder="Enter your Password" required>
        <br>
        <label>
            Profile Picture:
        </label>
        <input type="file" name="dp" required>
        <br>
        <button type="submit" value="submit">Register</button>
    </form>
</div>


</form>



</body>
</html>
