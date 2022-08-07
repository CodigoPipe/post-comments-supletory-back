package com.sofka.postcommentsuplementary.entity;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PostDTO {

    private Integer postId;

    private String title;

    private String content;

    private Integer numberOfLikes;

    private List<UserLike> userLikes = new ArrayList<>();
    //private Set<UserLike> userLikes = new LinkedHashSet<>();

    private List<Comment> comments = new ArrayList<>();
    //private Set<Comment> comments = new LinkedHashSet<>();


    //Constructor

    public PostDTO(Integer postId, String title, String content, Integer numberOfLikes, List<UserLike> userLikes, List<Comment> comments) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.numberOfLikes = numberOfLikes;
        this.userLikes = userLikes;
        this.comments = comments;
    }

    public PostDTO(String title, String content) {
        this.title = title;
        this.content = content;
        this.numberOfLikes = 0;
    }

    //methods

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(Integer numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public List<UserLike> getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(List<UserLike> userLikes) {
        this.userLikes = userLikes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }


}
