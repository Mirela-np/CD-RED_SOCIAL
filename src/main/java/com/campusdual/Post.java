package com.campusdual;

import java.util.Date;
import java.util.List;

public class Post {

    private Date fecha;
    private List<Comment> commentList;

    public Post(Date fecha, List<Comment> commentList) {
        this.fecha = fecha;
        this.commentList = commentList;
    }

    public Post() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    //añadir comentario

    public void addComment(Comment comment){
        commentList.add(comment);

    }

    // borrar comentario

    public void deleteComment(Comment comment){
        commentList.remove(comment);
    }


    //numero de comentarios que tiene un post

    public int countComments(List<Comment> commentList){
        return commentList.size();

    }

//listar los comentarios que tiene un post
    public void listComments(List<Comment> commentList){

        for(Comment c: commentList){
            System.out.println(c);

        }
    }


    @Override
    public String toString() {
        return "Post{" +
                "fecha=" + fecha +
                ", commentList=" + commentList +
                '}';
    }
}
