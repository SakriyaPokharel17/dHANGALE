package Model;

import java.io.File;

public class Member {

    private int member_id;
    private String member_firstname;
    private String member_middlename;
    private String member_lastname;
    private String member_email;
    private String member_password;
    private File member_dp;

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getMember_firstname() {
        return member_firstname;
    }

    public void setMember_firstname(String member_firstname) {
        this.member_firstname = member_firstname;
    }

    public String getMember_middlename() {
        return member_middlename;
    }

    public void setMember_middlename(String member_middlename) {
        this.member_middlename = member_middlename;
    }

    public String getMember_lastname() {
        return member_lastname;
    }

    public void setMember_lastname(String member_lastname) {
        this.member_lastname = member_lastname;
    }

    public String getMember_email() {
        return member_email;
    }

    public void setMember_email(String member_email) {
        this.member_email = member_email;
    }

    public String getMember_password() {
        return member_password;
    }

    public void setMember_password(String member_password) {
        this.member_password = member_password;
    }

    public File getMember_dp() {
        return member_dp;
    }

    public void setMember_dp(File member_dp) {
        this.member_dp = member_dp;
    }

    public Member(){

    }
}
