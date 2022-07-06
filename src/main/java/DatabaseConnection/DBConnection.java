package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBConnection {
    Connection connection = null;

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db_url = "jdbc:mysql://localhost:3306/dhangale_project";//
            String user = "root";
            String password = "";

            this.connection = DriverManager.getConnection(db_url,user,password);
            if (connection != null){
            System.out.println("Hurray DB connected.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DBConnection db_conn = new DBConnection();
    }
    public PreparedStatement getConnection(String query){
            PreparedStatement preparedStatement = null;
        try {
                preparedStatement = connection.prepareStatement(query);
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return preparedStatement;
    }
}
