package com.campusdual;

import java.util.Date;
import java.util.List;

public class VideoPost extends Post{


    private String titulo;
    private int quality;
    private int duration;

    public VideoPost(Date fecha, List<Comment> commentList, String titulo, int quality, int duration) {
        super(fecha, commentList);
        this.titulo = titulo;
        this.quality = quality;
        this.duration = duration;
    }

    public VideoPost(Date fecha, List<Comment> commentList) {
        super(fecha, commentList);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
