package Service;

import DatabaseConnection.DBConnection;
import Model.Frame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FrameService {
    public void addFrame(Frame frame){
// Add frame
        String insert_query = "INSERT INTO `frame_table`(`frame_code`, `frame_rate`, `frame_width`, `frame_image`, `frame_type`) VALUES (?,?,?,?,?,)";
        PreparedStatement preparedStatement = new DBConnection().getConnection(insert_query);

        try{
            preparedStatement.setString(1, frame.getFrame_code());
            preparedStatement.setInt(2,frame.getFrame_rate());
            preparedStatement.setInt(3, frame.getFrame_width());
            InputStream inputStream = new FileInputStream(frame.getFrame_image());
            preparedStatement.setBlob(4, inputStream);
            preparedStatement.setString(5, frame.getFrame_type());


        }catch(SQLException | FileNotFoundException e){
            e.printStackTrace();

        }
    }
//    get frame
}
