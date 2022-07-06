package Model;

import java.io.File;

public class Frame {
    private int frame_id;
    private String frame_code;
    private int frame_rate;
    private int frame_width;
    private File frame_image;
    private String frame_type;

    public int getFrame_id() {
        return frame_id;
    }

    public void setFrame_id(int frame_id) {
        this.frame_id = frame_id;
    }

    public String getFrame_code() {
        return frame_code;
    }

    public void setFrame_code(String frame_code) {
        this.frame_code = frame_code;
    }

    public int getFrame_rate() {
        return frame_rate;
    }

    public void setFrame_rate(int frame_rate) {
        this.frame_rate = frame_rate;
    }

    public int getFrame_width() {
        return frame_width;
    }

    public void setFrame_width(int frame_width) {
        this.frame_width = frame_width;
    }

    public File getFrame_image() {
        return frame_image;
    }

    public void setFrame_image(File frame_image) {
        this.frame_image = frame_image;
    }

    public String getFrame_type() {
        return frame_type;
    }

    public void setFrame_type(String frame_type) {
        this.frame_type = frame_type;
    }

    public Frame(){

    }
}
