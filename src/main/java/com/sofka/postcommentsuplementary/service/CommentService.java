package com.sofka.postcommentsuplementary.service;

import com.sofka.postcommentsuplementary.entity.Comment;
import com.sofka.postcommentsuplementary.entity.CommentDTO;

import java.util.List;

public interface CommentService {

    CommentDTO createComment(CommentDTO commentDTO);

    void deleteComment(Integer commentId);

    List<Comment> findAllComments();
}
