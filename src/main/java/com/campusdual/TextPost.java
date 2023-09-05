package com.campusdual;

import java.util.Date;
import java.util.List;

public class TextPost extends Post{

    private String content;

    public TextPost(Date fecha, List<Comment> commentList, String content) {
        super(fecha, commentList);
        this.content = content;
    }

    public TextPost(Date fecha, List<Comment> commentList) {
        super(fecha, commentList);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

