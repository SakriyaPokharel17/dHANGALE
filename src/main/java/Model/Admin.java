package Model;

import com.mysql.cj.jdbc.Blob;

import java.io.File;

public class Admin {
    private int admin_id;
    private String admin_firstname;
    private String admin_middlename;
    private String admin_lastname;
    private String admin_email;
    private String admin_password;
    private Blob admin_dp;

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_firstname() {
        return admin_firstname;
    }

    public void setAdmin_firstname(String admin_firstname) {
        this.admin_firstname = admin_firstname;
    }

    public String getAdmin_middlename() {
        return admin_middlename;
    }

    public void setAdmin_middlename(String admin_middlename) {
        this.admin_middlename = admin_middlename;
    }

    public String getAdmin_lastname() {
        return admin_lastname;
    }

    public void setAdmin_lastname(String admin_lastname) {
        this.admin_lastname = admin_lastname;
    }

    public String getAdmin_email() {
        return admin_email;
    }

    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public Blob getAdmin_dp() {
        return admin_dp;
    }

    public void setAdmin_dp(Blob admin_dp) {
        this.admin_dp = admin_dp;
    }

    public Admin(){

    }

}
