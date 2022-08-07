package com.sofka.postcommentsuplementary.service;


import com.sofka.postcommentsuplementary.entity.Comment;
import com.sofka.postcommentsuplementary.entity.CommentDTO;
import com.sofka.postcommentsuplementary.mapper.MapperComment;
import com.sofka.postcommentsuplementary.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepo commentRepo;

    @Override
    public CommentDTO createComment(CommentDTO commentDTO) {

        Comment comment = new Comment(commentDTO.getCommentContent(), commentDTO.getPostIdpost());
        return MapperComment.returnCommentDTO(commentRepo.save(comment));

    }

    @Override
    public List<Comment> findAllComments() {
        return commentRepo.findAll();
    }
}
