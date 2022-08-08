package com.sofka.postcommentsuplementary.updateDTO;



public class CommentUpdateDTO {

    private Integer commentId;

    private String commentContent;

    private Integer numberOfLikesComment;

    public CommentUpdateDTO(Integer commentId, String commentContent, Integer numberOfLikesComment) {
        this.commentId = commentId;
        this.commentContent = commentContent;
        this.numberOfLikesComment = numberOfLikesComment;
    }

    public CommentUpdateDTO(Integer commentId, String commentContent) {
        this.commentId = commentId;
        this.commentContent = commentContent;
    }

    public CommentUpdateDTO() {
    }

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
}
