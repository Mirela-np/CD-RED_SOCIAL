package com.campusdual;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class TextPost extends Post{

    private String content;

    public TextPost(LocalDateTime fecha, List<Comment> commentList, String content) {
        super(fecha, commentList);
        this.content = content;
    }



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

