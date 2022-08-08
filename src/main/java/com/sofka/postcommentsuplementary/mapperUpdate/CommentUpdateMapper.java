package com.sofka.postcommentsuplementary.mapperUpdate;

import com.sofka.postcommentsuplementary.entity.Comment;
import com.sofka.postcommentsuplementary.entity.CommentDTO;
import com.sofka.postcommentsuplementary.updateDTO.CommentUpdateDTO;


public class CommentUpdateMapper {

    public static Comment returnComment(CommentUpdateDTO commentUpdateDTO){

        Comment comment = new Comment();
        comment.setCommentId(commentUpdateDTO.getCommentId());
        comment.setCommentContent(commentUpdateDTO.getCommentContent());
        comment.setNumberOfLikesComment(commentUpdateDTO.getNumberOfLikesComment());

        return comment;

    }

    public static CommentUpdateDTO returnCommentUpdateDTO(Comment comment){

        CommentUpdateDTO commentUpdateDTO = new CommentUpdateDTO();
        commentUpdateDTO.setCommentId(comment.getCommentId());
        commentUpdateDTO.setCommentContent(comment.getCommentContent());
        commentUpdateDTO.setNumberOfLikesComment(comment.getNumberOfLikesComment());

        return commentUpdateDTO;
    }
}
