package com.campusdual;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<User> userList=new ArrayList<>();
    private List<Post> postList=new ArrayList<>();

    public User(String name, List<User> userList, List<Post> postList) {
        this.name = name;
        this.userList = userList;
        this.postList = postList;
    }

    public User(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userList=" + userList +
                ", postList=" + postList +
                '}';
    }


    //añadir usuario
    public void addUser(User user){
        userList.add(user);

    }

    //añadir post

    public void addPost(Post post){
        postList.add(post);
    }

    //dejar de seguir un usuario

    public void unfollowUser(User user){

        if(!userList.contains(user)){
            System.out.println("El usuario no existe");
        }else{
            userList.remove(userList.indexOf(user));
            System.out.println("Has dejado de seguir  a este usuario");
        }

        }


    // seguir usuario
    public void followUser(User user){
        userList.add(user);
    }

    // borrar usuario

    public void deleteUser(User user){
      userList.remove(user);
    }


    //borrar post
    public void deletePost(Post post){
       postList.remove(post);
    }

    //listar los posts de un usuario
    public void listPost(){

        for(Post p: postList){
            System.out.println(p);

        }


    }



}
