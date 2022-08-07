package com.sofka.postcommentsuplementary.entity;

import java.util.ArrayList;
import java.util.List;

public class UserLikeDTO {

    private Integer userId;

    private String userName;

    private String dni;

    private List<CommentDTO> comments = new ArrayList<>();
    //private Set<Comment> comments = new LinkedHashSet<>();

    private List<PostDTO> posts = new ArrayList<>();
    //private Set<Post> posts = new LinkedHashSet<>();


    //Constructors

    public UserLikeDTO(Integer userId, String userName, String dni, List<CommentDTO> comments, List<PostDTO> posts) {
        this.userId = userId;
        this.userName = userName;
        this.dni = dni;
        this.comments = comments;
        this.posts = posts;
    }

    public UserLikeDTO(String userName, String dni) {
        this.userName = userName;
        this.dni = dni;
    }

    public UserLikeDTO() {
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

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }

    public List<PostDTO> getPosts() {
        return posts;
    }

    public void setPosts(List<PostDTO> posts) {
        this.posts = posts;
    }


}
