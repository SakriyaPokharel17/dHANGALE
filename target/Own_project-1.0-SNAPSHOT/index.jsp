<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <!-- <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->

    <title>dHANGALE</title>
    <link rel="stylesheet " href="stylesheet/index.css">
</head>

<body>
<div class="main" >

    <!-- Header Section -->
    <!-- Navbar -->
    <div class="navbar">
        <div class="icon">
            <h2 class="logo">
                <img alt="dHANGALE logo" class="logo-image" src="images/logo.png">
            </h2>
        </div>
        <div class="menu">
            <ul>
                <!-- <li>
                    <a href="#home">Home</a>
                </li> -->
                <li>
                    <a href="#aboutus">About Us</a>
                </li>
                <li>
                    <a href="#contact">Contact</a>
                </li>
                <li>
                    <a href="#designs">Design</a>

                </li>
            </ul>
        </div>

    </div>
    <!-- Navbar Closed -->
<div>
    <a href="pages/nav-bar.jsp">Go</a>
</div>
    <!-- Body content Home -->
    <div class="body-content">
        <div class="content" id="home">
            <h1>dHANGALE</h1>
            <h2>frames</h2><br>
            <p class="par">
                An online store to buy a
                <b>Photo Frame</b>
            </p>

            <button class="btn"><a href="#">Order</a></button>
        </div>
    </div>
    <!-- Body content Home closed -->
    <!-- Body Content Order -->
    <!-- <div id="order" class="order"> -->
    <!-- <div class="form1"> -->
    <div class="trans">
        <form action="hello-servlet?form=member_login" class="order-form">

            <h2>Place your order</h2>
            <label><input class="user-input username" type="email" name="email" placeholder="Enter Your email" required></label>
            <label><input class="user-input password" type="password" name="password" placeholder="Enter Your password" required></label>
            <button class="btn-submit" type="button" value="submit"><a href="#">Submit</a></button>
            <p>
            <p class="links">
                <a class="member" href="hello-servlet?form=be_member">
                    <span class="create">Create account</span> and be a member.
                </a>
            </p>
            <p class="links"><a href="hello-servlet?form=be_admin"><span>Be an Admin</span></a></p>


        </form>
        <!-- </div> -->
    </div>
    <!-- </div> -->

</div>
<!-- About us -->
<div class="aboutus" id="aboutus">
    <div class="about-content">
        <h1>About Us</h1>
        <p>
         This is a web site that aims to help the customer to get the <b>Photo Frame </b>in a best price availbale.
        </p>
    </div>
</div>

<!-- About Us closed -->
<!-- Contact Us -->
<div class="contact" id="contact">

    <div class="about-content">
        <h1>Contact Us</h1>
        <p class="contact-content">
            <span>
                Tel:    9804040404<br>
                email:  dhangale@frames.com
            </span>
        </p>
    </div>
</div>
<!-- Contact Closed -->
<%--<div class="frames" id="frames">--%>
<%--    <h1 class="frameheading">Frames Designs</h1>--%>
<%--</div>--%>
<%--<a href="">Admin Register</a>--%>





</body>

</html>