package com.sofka.postcommentsuplementary.mapper;

import com.sofka.postcommentsuplementary.entity.Post;
import com.sofka.postcommentsuplementary.entity.PostDTO;

public class MapperPost {

    private Post returnPost(PostDTO postDTO){
        return new Post(postDTO.getTitle(), postDTO.getContent());
    }

    private PostDTO returnPostDTO(Post post){
        return new PostDTO(post.getPostId(), post.getTitle(), post.getContent(), post.getNumberOfLikes(), post.getUserLikes(), post.getComments());
    }

}
