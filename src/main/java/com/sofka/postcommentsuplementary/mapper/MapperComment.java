package com.sofka.postcommentsuplementary.mapper;

import com.sofka.postcommentsuplementary.entity.Comment;
import com.sofka.postcommentsuplementary.entity.CommentDTO;

public class MapperComment {

    public static Comment returnComment(CommentDTO commentDTO){
        return new Comment(commentDTO.getCommentContent(), commentDTO.getPostIdpost());
    }

    public static CommentDTO returnCommentDTO(Comment comment){
        return new CommentDTO(comment.getCommentId(), comment.getCommentContent(), comment.getNumberOfLikesComment(), comment.getPostIdpost(), comment.getUserLikes());
    }


}
