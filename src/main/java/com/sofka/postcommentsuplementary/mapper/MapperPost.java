package com.sofka.postcommentsuplementary.mapper;

import com.sofka.postcommentsuplementary.entity.*;

import java.util.ArrayList;
import java.util.List;

public class MapperPost {

    MapperUserLike mapperUserLike = new MapperUserLike();
    MapperComment mapperComment = new MapperComment();

    public Post returnPost(PostDTO postDTO){
        Post post = new Post();
        post.setPostId(postDTO.getPostId());
        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getContent());
        post.setNumberOfLikes(postDTO.getNumberOfLikes());

        List<UserLike> userLikes = new ArrayList<>();
        for(UserLikeDTO like: postDTO.getUserLikes()){
            userLikes.add(mapperUserLike.returnUserLike(like));
        }
        post.setUserLikes(userLikes);

        List<Comment> comments = new ArrayList<>();
        for(CommentDTO comment: postDTO.getComments()){
            comments.add(mapperComment.returnComment(comment));
        }
        post.setComments(comments);

        return post;
    }

    public PostDTO returnPostDTO(Post post){

        PostDTO postDTO = new PostDTO();
        postDTO.setPostId(post.getPostId());
        postDTO.setTitle(post.getTitle());
        postDTO.setContent(post.getContent());
        postDTO.setNumberOfLikes(post.getNumberOfLikes());

        List<UserLikeDTO> userLikes = new ArrayList<>();
        for(UserLike like: post.getUserLikes()){
            userLikes.add(mapperUserLike.returnUserLikeDTO(like));
        }
        postDTO.setUserLikes(userLikes);

        List<CommentDTO> comments = new ArrayList<>();
        for(Comment comment: post.getComments()){
            comments.add(mapperComment.returnCommentDTO(comment));
        }
        postDTO.setComments(comments);

        return postDTO;
    }

}
