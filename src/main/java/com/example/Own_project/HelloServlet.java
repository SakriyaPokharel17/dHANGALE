package com.example.Own_project;

import Model.Admin;
import Model.Member;
import Service.AdminService;
import com.mysql.cj.jdbc.Blob;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

//    doGet methode
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        doPost(request,response);

    }
//    doPost methode
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        String action = request.getParameter("form");

// try clock
        try {
// admin_register
            if (action.equalsIgnoreCase("be_admin")) {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("pages/admin.jsp");
                requestDispatcher.forward(request, response);
            }
            if (action.equalsIgnoreCase("admin_register")){
                Admin admin = new Admin();

                admin.setAdmin_firstname(request.getParameter("firstname"));
                admin.setAdmin_middlename(request.getParameter("middlename"));
                admin.setAdmin_lastname(request.getParameter("lastname"));
                admin.setAdmin_email(request.getParameter("email"));
                admin.setAdmin_password(request.getParameter("password"));
                admin.setAdmin_dp((request.getParameter("dp")));

                new AdminService().addAdmin(admin);
                RequestDispatcher requestDispatcher  = request.getRequestDispatcher("index.jsp");
                requestDispatcher.forward(request,response);
            }
//member register
            if(action.equalsIgnoreCase("be_member")){
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("pages/add_member.jsp");
                requestDispatcher.forward(request,response);
            }
            if(action.equalsIgnoreCase("member_register")){
                Member member = new Member();


            }
//            frame register

//            admin login
            if (action.equalsIgnoreCase("admin_login")){
                Admin admin = null;

                String email, password;
                email = request.getParameter("email");
                password= request.getParameter("password");

                admin = new AdminService().getAdmin(email,password);
                if (admin!= null){
                    HttpSession session = request.getSession();
                    session.setAttribute("admin_user",admin.getAdmin_firstname());
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("add_frame.jsp");
                    requestDispatcher.forward(request,response);
                }
            }
//            member login


// catch block
        }catch (ServletException e){
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}