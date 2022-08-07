package com.sofka.postcommentsuplementary.entity;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CommentDTO {


    private Integer commentId;

    private String commentContent;

    private Integer numberOfLikesComment;

    private Post postIdpost;

    private List<UserLike> userLikes = new ArrayList<>();
    //private Set<UserLike> userLikes = new LinkedHashSet<>();


    //Constructors

    public CommentDTO(Integer commentId, String commentContent, Integer numberOfLikesComment, Post postIdpost, List<UserLike> userLikes) {
        this.commentId = commentId;
        this.commentContent = commentContent;
        this.numberOfLikesComment = numberOfLikesComment;
        this.postIdpost = postIdpost;
        this.userLikes = userLikes;
    }

    public CommentDTO(String commentContent, Post postIdpost) {
        this.commentContent = commentContent;
        this.postIdpost = postIdpost;
        this.numberOfLikesComment = 0;
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
