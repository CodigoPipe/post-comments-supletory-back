package com.sofka.postcommentsuplementary.mapper;

import com.sofka.postcommentsuplementary.entity.Comment;
import com.sofka.postcommentsuplementary.entity.CommentDTO;
import com.sofka.postcommentsuplementary.entity.UserLike;
import com.sofka.postcommentsuplementary.entity.UserLikeDTO;

import java.util.ArrayList;
import java.util.List;

public class MapperComment {


    //MapperUserLike mapperUserLike = new MapperUserLike();
    //MapperPost mapperPost = new MapperPost();
    public static Comment returnComment(CommentDTO commentDTO){

        Comment comment = new Comment();
        comment.setCommentId(commentDTO.getCommentId());
        comment.setCommentContent(commentDTO.getCommentContent());
        comment.setNumberOfLikesComment(commentDTO.getNumberOfLikesComment());
        comment.setPostIdpost(MapperPost.returnPost(commentDTO.getPostIdpost()));

        List<UserLike> userLikes = new ArrayList<>();
        for(UserLikeDTO like: commentDTO.getUserLikes()){
            userLikes.add(MapperUserLike.returnUserLike(like));
        }
        comment.setUserLikes(userLikes);

        return comment;

    }

    public static CommentDTO returnCommentDTO(Comment comment){

        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setCommentId(comment.getCommentId());
        commentDTO.setCommentContent(comment.getCommentContent());
        commentDTO.setNumberOfLikesComment(comment.getNumberOfLikesComment());
        commentDTO.setPostIdpost(MapperPost.returnPostDTO(comment.getPostIdpost()));

        List<UserLikeDTO> userLikes = new ArrayList<>();
        for(UserLike like: comment.getUserLikes()){
            userLikes.add(MapperUserLike.returnUserLikeDTO(like));
        }
        commentDTO.setUserLikes(userLikes);

        return commentDTO;
    }


}
