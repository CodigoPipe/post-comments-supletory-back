package com.sofka.postcommentsuplementary.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "user_like")
public class UserLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser_like", nullable = false)
    private Integer userId;

    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;

    @Column(name = "dni", nullable = false, length = 20)
    private String dni;

    @ManyToMany
    @JoinTable(name = "user_like_has_comment",
            joinColumns = @JoinColumn(name = "user_like_iduser_like"),
            inverseJoinColumns = @JoinColumn(name = "comment_idcomment"))
    private Set<Comment> comments = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "user_like_has_post",
            joinColumns = @JoinColumn(name = "user_like_iduser_like"),
            inverseJoinColumns = @JoinColumn(name = "post_idpost"))
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