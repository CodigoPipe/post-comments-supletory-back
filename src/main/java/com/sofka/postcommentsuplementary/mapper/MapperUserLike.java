package com.sofka.postcommentsuplementary.mapper;


import com.sofka.postcommentsuplementary.entity.*;

import java.util.ArrayList;
import java.util.List;

public class MapperUserLike {


    MapperComment mapperComment = new MapperComment();
    MapperPost mapperPost = new MapperPost();
    public UserLike returnUserLike(UserLikeDTO userLikeDto){
        UserLike userLike = new UserLike();
        userLike.setUserId(userLikeDto.getUserId());
        userLike.setUserName(userLikeDto.getUserName());
        userLike.setDni(userLikeDto.getDni());

        List<Comment> comments = new ArrayList<>();
        for(CommentDTO comment: userLikeDto.getComments()){
            comments.add(mapperComment.returnComment(comment));
        }
        userLike.setComments(comments);

        List<Post> posts = new ArrayList<>();
        for(PostDTO post: userLikeDto.getPosts()){
            posts.add(mapperPost.returnPost(post));
        }
        userLike.setPosts(posts);

        return userLike;
    }

    public UserLikeDTO returnUserLikeDTO(UserLike userLike){
        UserLikeDTO userLikeDTO = new UserLikeDTO();
        userLikeDTO.setUserId(userLike.getUserId());
        userLikeDTO.setUserName(userLike.getUserName());
        userLikeDTO.setDni(userLike.getDni());

        List<CommentDTO> comments = new ArrayList<>();
        for(Comment comment: userLike.getComments()){
            comments.add(mapperComment.returnCommentDTO(comment));
        }
        userLikeDTO.setComments(comments);

        List<PostDTO> posts = new ArrayList<>();
        for(Post post: userLike.getPosts()){
            posts.add(mapperPost.returnPostDTO(post));
        }
        userLikeDTO.setPosts(posts);

        return userLikeDTO;
    }


}
