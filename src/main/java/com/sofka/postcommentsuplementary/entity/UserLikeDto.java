package com.sofka.postcommentsuplementary.entity;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UserLikeDto {

    private Integer userId;

    private String userName;

    private String dni;

    private List<Comment> comments = new ArrayList<>();
    //private Set<Comment> comments = new LinkedHashSet<>();

    private List<Post> posts = new ArrayList<>();
    //private Set<Post> posts = new LinkedHashSet<>();


    //Constructors

    public UserLikeDto(Integer userId, String userName, String dni, List<Comment> comments, List<Post> posts) {
        this.userId = userId;
        this.userName = userName;
        this.dni = dni;
        this.comments = comments;
        this.posts = posts;
    }

    public UserLikeDto(String userName, String dni) {
        this.userName = userName;
        this.dni = dni;
    }

    //methods

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }


}
