package com.sofka.postcommentsuplementary.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcomment", nullable = false)
    private Integer commentId;

    @Column(name = "comment_content", nullable = false)
    private String commentContent;

    @Column(name = "number_of_likes_comment", nullable = false)
    private Integer numberOfLikesComment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "post_idpost", nullable = false)
    private Post postIdpost;

    @ManyToMany
    @JoinTable(name = "user_like_has_comment",
            joinColumns = @JoinColumn(name = "comment_idcomment"),
            inverseJoinColumns = @JoinColumn(name = "user_like_iduser_like"))
    private List<UserLike> userLikes = new ArrayList<>();
    //private Set<UserLike> userLikes = new LinkedHashSet<>();


    //constructors

    public Comment(Integer commentId, String commentContent, Integer numberOfLikesComment, Post postIdpost, List<UserLike> userLikes) {
        this.commentId = commentId;
        this.commentContent = commentContent;
        this.numberOfLikesComment = numberOfLikesComment;
        this.postIdpost = postIdpost;
        this.userLikes = userLikes;
    }

    public Comment(String commentContent, Post postIdpost) {
        this.commentContent = commentContent;
        this.postIdpost = postIdpost;
        this.numberOfLikesComment = 0;
    }

    public Comment() {
    }

    //methods

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getNumberOfLikesComment() {
        return numberOfLikesComment;
    }

    public void setNumberOfLikesComment(Integer numberOfLikesComment) {
        this.numberOfLikesComment = numberOfLikesComment;
    }

    public Post getPostIdpost() {
        return postIdpost;
    }

    public void setPostIdpost(Post postIdpost) {
        this.postIdpost = postIdpost;
    }

    public List<UserLike> getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(List<UserLike> userLikes) {
        this.userLikes = userLikes;
    }


}