package com.campusdual;

import com.campusdual.util.Input;

import java.time.LocalDateTime;
import java.util.*;
import java.util.List;

import static com.campusdual.util.Input.integer;

public class Main {


    static List<User> users = new ArrayList<>();
    static List<Post> posts = new ArrayList<>();
    static List<Comment>comments=new ArrayList<>();
    static User user;
    static Post post;

    static Comment comment;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;



        System.out.println("======RED SOCIAL=======");
        System.out.println("Que deseas hacer : \n 1.Log in  \n 2.Salir      \n ");
        while(!salir){
            int option=Input.integer();
            switch(option){
                case 1:
                    System.out.println("======RED SOCIAL=======");
                    System.out.println("Introduce un nombre de usuario");
                    break;
                case 2:
                    break;

            }
        }










        System.out.println("===========================");
        System.out.println("Opciones: \n 1.Crear  usuario \n  2.Añadir usuario \n  3.Añadir post \n  4.Añadir comentario \n  5.Dejar de seguir \n  6.Seguir \n  7.Eliminar usuario  \n  " +
                "8.Eliminar post  \n  9.Eliminar comentario  \n  10.Listar posts  \n  11.Listar comentarios \n  12.Mostrar numero de comentarios de un post  \n  13.Salir");
        System.out.println("============================");



        while (!salir) {
            int opcion_menu = Input.integer();
            switch (opcion_menu) {

                case 1:
                    createUser(user);
                    break;
                case 2:
                    addUser(user);
                    break;
                case 3:
                    addPost(post);
                    break;
                case 4:

                    addComment(user);
                    break;
                case 5:
                    Unfollow(user);
                    break;
                case 6:
                    Follow(user);
                    break;
                case 7:
                    deleteUser(user);
                    break;
                case 8:
                    deletePost(post);
                    break;
                case 9:
                    deleteComment(comment);
                    break;
                case 10:
                    listPost(post);
                    break;
                case 11:
                    listComment();
                    break;
                case 12:
                    commentsByNumber();
                default:
                    System.out.println("No hay mas opciones");

            }
        }
    }



    private static List<User> createUser(User user){
        List<User> users=new ArrayList<>();
        User u1=new User("Lucia");
        System.out.println("se ha creado el usuario : "+ u1.getName());
        User u2=new User("Alex");
        System.out.println("se ha creado el usuario :"+ u2.getName());
        User u3=new User("Ana");
        System.out.println("se ha creado el usuario :"+ u3.getName());
        User u4=new User("Ona");


        u1.followUser(u2);
        u1.followUser(u3);
        u2.followUser(u1);
        u2.followUser(u3);
        u3.followUser(u1);
        u3.followUser(u4);
        u4.followUser(u1);
        u4.followUser(u3);


        users.add(u1);
        users.add(u2);
        users.add(u3);

        return users;

    }

    private static void listComment() {
        for(Post p:posts){
            System.out.println(p.getCommentList());
        }
    }

    private static void listPost(Post p) {
        String userName=Input.string("Choose for an username lo list\n");

        for(User u: users){
            if(u.getName().equals(userName)){
                System.out.println(u.getPostList());
            }
        }
    }

    private static void deleteComment(Comment comment) {
        post.deleteComment(comment);

    }

    private static void deletePost(Post post) {
        user.deletePost(post);
    }

    private static void deleteUser(User user) {
        user.deleteUser(user);

    }

    private static void Follow(User user) {
        String addFriend = Input.string("search for an user name to add \n");
        for (User u : users) {
            if (u.getName().equals(addFriend)) {
                user.followUser(u);
            }
        }
        System.out.println(users);
    }

    private static void Unfollow(User user) {
        String name = Input.string("Friend to unfollow\n");
        for (User u : users) {
            if (u.getName().equals(name)) {
                user.unfollowUser(u);
            }
        }
    }

    private static void addComment(User user ) {

        //crear comentario

        String text=Input.string("Leave a comment\n");
        LocalDateTime comDate=LocalDateTime.now();
        Comment comment=new Comment(text,comDate,user);

        //obtengo posts usuario

       List <Post>usersPost=user.getPostList();

        // comentar post



    }

    private static List<Post> addPost(Post post) {
        System.out.println("What are you thinking? ");
        System.out.println("1.Text");
        System.out.println("2.Image");
        System.out.println("3.Video");
        int option = Input.integer();
        TextPost tp = null;
        ImagePost ip = null;
        VideoPost vp = null;


        switch (option) {
            case 1:
                String content = Input.string("Text content");
                LocalDateTime actualDate = LocalDateTime.now();
                tp = new TextPost(actualDate, comments, content);
                System.out.println(" se ha creado el textpost " + tp);

                break;
            case 2:
                actualDate = LocalDateTime.now();
                String title = Input.string("Image title");
                double size = Input.real("Image size");
                ip = new ImagePost(actualDate, comments, title, size);
                System.out.println(" se ha creado el imagepost " + ip);
                break;
            case 3:
                actualDate = LocalDateTime.now();
                String title2 = Input.string("Videos title");
                int quality = Input.integer("Videos quality");
                int duracion = Input.integer("Videos duracion");
                vp = new VideoPost(actualDate, comments, title2, quality, duracion);
                System.out.println(" se ha creado el videopost " + vp);
                break;

        }

        posts.add(tp);
        posts.add(ip);
        posts.add(vp);

        //añadir post a usuario
        for (Post p : posts) {
            for (User u : users) {
                u.addPost(p);

            }
        }


            return posts;
        }


    public static void addUser(User user){
         user=new User(Input.string("Enter an username: "));
        users.add(user);
        System.out.println(users);
    }

    private static void commentsByNumber() {


    }


}


