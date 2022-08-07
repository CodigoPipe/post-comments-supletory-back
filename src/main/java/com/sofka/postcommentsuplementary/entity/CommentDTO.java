package com.sofka.postcommentsuplementary.entity;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CommentDTO {


    private Integer commentId;

    private String commentContent;

    private Integer numberOfLikesComment;

    private PostDTO postIdpost;

    private List<UserLikeDTO> userLikes = new ArrayList<>();
    //private Set<UserLike> userLikes = new LinkedHashSet<>();


    //Constructors

    public CommentDTO(Integer commentId, String commentContent, Integer numberOfLikesComment, PostDTO postIdpost, List<UserLikeDTO> userLikes) {
        this.commentId = commentId;
        this.commentContent = commentContent;
        this.numberOfLikesComment = numberOfLikesComment;
        this.postIdpost = postIdpost;
        this.userLikes = userLikes;
    }

    public CommentDTO(String commentContent, PostDTO postIdpost) {
        this.commentContent = commentContent;
        this.postIdpost = postIdpost;
        this.numberOfLikesComment = 0;
    }

    public CommentDTO() {
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

    public PostDTO getPostIdpost() {
        return postIdpost;
    }

    public void setPostIdpost(PostDTO postIdpost) {
        this.postIdpost = postIdpost;
    }

    public List<UserLikeDTO> getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(List<UserLikeDTO> userLikes) {
        this.userLikes = userLikes;
    }

}
