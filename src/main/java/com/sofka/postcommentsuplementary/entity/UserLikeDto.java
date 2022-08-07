package com.sofka.postcommentsuplementary.entity;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserLikeDto {

    private Integer userId;

    private String userName;

    private String dni;

    private Set<Comment> comments = new LinkedHashSet<>();

    private Set<Post> posts = new LinkedHashSet<>();


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

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
}
