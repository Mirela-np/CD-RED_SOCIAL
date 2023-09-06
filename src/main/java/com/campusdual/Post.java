package com.campusdual;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private LocalDateTime fecha;
    private List<Comment> commentList=new ArrayList<>();

    public Post(LocalDateTime fecha, List<Comment> commentList) {
        this.fecha = fecha;
        this.commentList = commentList;
    }

    public Post() {
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
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
        if(!commentList.contains(comment)){
            System.out.println("El comentario no existe");
        }else{
            commentList.remove(commentList.indexOf(comment));
            System.out.println("Comentario eliminado ");
        }
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
