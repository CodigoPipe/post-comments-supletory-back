package com.sofka.postcommentsuplementary.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpost", nullable = false)
    private Integer postId;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "number_of_likes", nullable = false)
    private Integer numberOfLikes;

    @ManyToMany
    @JoinTable(name = "user_like_has_post",
            joinColumns = @JoinColumn(name = "post_idpost"),
            inverseJoinColumns = @JoinColumn(name = "user_like_iduser_like"))
    @JsonBackReference
    private List<UserLike> userLikes = new ArrayList<>();
    //private Set<UserLike> userLikes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "postIdpost")
    @JsonManagedReference
    private List<Comment> comments = new ArrayList<>();
    //private Set<Comment> comments = new LinkedHashSet<>();

    //Constructors

    public Post(Integer postId, String title, String content, Integer numberOfLikes, List<UserLike> userLikes, List<Comment> comments) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.numberOfLikes = 0;
        this.userLikes = userLikes;
        this.comments = comments;
    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.numberOfLikes = 0;
    }

    public Post() {
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