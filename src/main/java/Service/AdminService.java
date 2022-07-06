package Service;

import DatabaseConnection.DBConnection;
import Model.Admin;

import java.io.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminService {
//Register admin
    public void addAdmin(Admin admin){
        String insert_query = "INSERT INTO `admin_table`(`admin_firstname`, `admin_middlename`, `admin_lastname`, `admin_email`, `admin_password`, `admin_dp`)" + "VALUES (?,?,?,?,?,?);";

        PreparedStatement preparedStatement = new DBConnection().getConnection(insert_query);

        try{
            preparedStatement.setString(1,admin.getAdmin_firstname());
            preparedStatement.setString(2, admin.getAdmin_middlename());
            preparedStatement.setString(3, admin.getAdmin_lastname());
            preparedStatement.setString(4, admin.getAdmin_email());
            preparedStatement.setString(5, admin.getAdmin_password());
            InputStream inputStream = new FileInputStream(admin.getAdmin_dp());
            preparedStatement.setBlob(6, inputStream);



        }catch(SQLException | FileNotFoundException e){
            e.printStackTrace();

        }
    }
// admin login
    public Admin getAdmin(String email, String password){
        Admin admin = null;

        String select_query = "SELECT * from admin_table WHERE admin_email=?, admin_password=?";
        PreparedStatement preparedStatement = new DBConnection().getConnection(select_query);

        try{
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,password);

            ResultSet rs =preparedStatement.executeQuery();
                while (rs.next()){
                admin = new Admin();
                admin.setAdmin_id(rs.getInt("admin_id"));
                admin.setAdmin_firstname(rs.getString("admin_firstname"));
                admin.setAdmin_middlename(rs.getString("admin_middlename"));
                admin.setAdmin_lastname(rs.getString("admin_lastname"));
                admin.setAdmin_email(rs.getString("admin_email"));
                admin.setAdmin_password(rs.getString("admin_password"));
                admin.setAdmin_dp((File) rs.getBlob("admin_dp"));
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return admin;
    }
}
