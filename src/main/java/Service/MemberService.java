package Service;

import DatabaseConnection.DBConnection;
import Model.Admin;
import Model.Member;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberService {
//    member register
    public void addMember(Member member){

            String insert_query = "INSERT INTO `member_table`(`member_firstname`, `member_middlename`, `member_lastname`, `member_email`, `member_password`, `member_dp`) VALUES (?,?,?,?,?,?)";

            PreparedStatement preparedStatement = new DBConnection().getConnection(insert_query);

            try{
                preparedStatement.setString(1,member.getMember_firstname());
                preparedStatement.setString(2, member.getMember_middlename());
                preparedStatement.setString(3, member.getMember_lastname());
                preparedStatement.setString(4, member.getMember_email());
                preparedStatement.setString(5, member.getMember_password());
                InputStream inputStream = new FileInputStream(member.getMember_dp());
                preparedStatement.setBlob(6, inputStream);



            }catch(SQLException | FileNotFoundException e){
                e.printStackTrace();

            }
        }
//        Member login

}

