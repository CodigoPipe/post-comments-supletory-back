package com.sofka.postcommentsuplementary.service;


import com.sofka.postcommentsuplementary.entity.Comment;
import com.sofka.postcommentsuplementary.entity.CommentDTO;
import com.sofka.postcommentsuplementary.mapper.MapperComment;
import com.sofka.postcommentsuplementary.mapperUpdate.CommentUpdateMapper;
import com.sofka.postcommentsuplementary.repository.CommentRepo;
import com.sofka.postcommentsuplementary.updateDTO.CommentUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepo commentRepo;

    @Override
    public CommentDTO createComment(CommentDTO commentDTO) {

        Comment comment = MapperComment.returnComment(commentDTO);
        comment.setNumberOfLikesComment(0);
        return MapperComment.returnCommentDTO(commentRepo.save(comment));

    }

    @Override
    public CommentUpdateDTO updateComment(CommentUpdateDTO commentUpdateDTO) {
         Comment comment = commentRepo.findById(commentUpdateDTO.getCommentId()).get();
         comment.setCommentContent(commentUpdateDTO.getCommentContent());
         return CommentUpdateMapper.returnCommentUpdateDTO(commentRepo.save(comment));
    }

    @Override
    public void deleteComment(Integer commentId) {

        Comment comment = commentRepo.findById(commentId).get();
        commentRepo.delete(comment);

    }

    @Override
    public List<Comment> findAllComments() {
        return commentRepo.findAll();
    }
}
