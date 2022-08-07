package com.sofka.postcommentsuplementary.mapper;

import com.sofka.postcommentsuplementary.entity.Comment;
import com.sofka.postcommentsuplementary.entity.CommentDTO;

public class MapperComment {

    private Comment returnComment(CommentDTO commentDTO){
        return new Comment(commentDTO.getCommentContent(), commentDTO.getPostIdpost());
    }

    private CommentDTO returnCommentDTO(Comment comment){
        return new CommentDTO(comment.getCommentId(), comment.getCommentContent(), comment.getNumberOfLikesComment(), comment.getPostIdpost(), comment.getUserLikes());
    }


}
