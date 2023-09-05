package com.campusdual;

import java.util.Date;
import java.util.List;

public class ImagePost extends Post{

    private String title;
    private double size;

    public ImagePost(Date fecha, List<Comment> commentList, String title, double size) {
        super(fecha, commentList);
        this.title = title;
        this.size = size;
    }

    public ImagePost(Date fecha, List<Comment> commentList) {
        super(fecha, commentList);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
