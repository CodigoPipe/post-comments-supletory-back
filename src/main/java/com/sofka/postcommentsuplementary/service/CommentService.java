package com.sofka.postcommentsuplementary.service;

import com.sofka.postcommentsuplementary.entity.Comment;
import com.sofka.postcommentsuplementary.entity.CommentDTO;
import com.sofka.postcommentsuplementary.updateDTO.CommentUpdateDTO;

import java.util.List;

public interface CommentService {

    CommentDTO createComment(CommentDTO commentDTO);

    CommentUpdateDTO updateComment(CommentUpdateDTO commentUpdateDTO);

    void deleteComment(Integer commentId);

    List<Comment> findAllComments();
}
