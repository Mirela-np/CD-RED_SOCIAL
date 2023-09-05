package com.campusdual;

import java.util.List;

public class User {

    private String name;
    private List<User> userList;
    private List<Post> postList;

    public User(String name, List<User> userList, List<Post> postList) {
        this.name = name;
        this.userList = userList;
        this.postList = postList;
    }

    public User() {
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
        userList.remove(user);

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
    public void listPost(List<Post> postList){

        for(Post p: postList){
            System.out.println(p);

        }

    }


}
