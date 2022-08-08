package com.sofka.postcommentsuplementary.mapperUpdate;

import com.sofka.postcommentsuplementary.entity.*;
import com.sofka.postcommentsuplementary.updateDTO.PostUpdateDTO;

public class PostUpdateMapper {

    public static Post returnPost(PostDTO postDTO){

        Post post = new Post();
        post.setPostId(postDTO.getPostId());
        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getContent());
        post.setNumberOfLikes(postDTO.getNumberOfLikes());

        return post;
    }

    public static PostUpdateDTO returnPostUpdateDTO(Post post){

        PostUpdateDTO postUpdateDTO = new PostUpdateDTO();
        postUpdateDTO.setPostId(post.getPostId());
        postUpdateDTO.setTitle(post.getTitle());
        postUpdateDTO.setContent(post.getContent());
        postUpdateDTO.setNumberOfLikes(post.getNumberOfLikes());

        return postUpdateDTO;
    }

}
