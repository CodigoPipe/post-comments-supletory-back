package com.sofka.postcommentsuplementary.service;

import com.sofka.postcommentsuplementary.entity.Post;
import com.sofka.postcommentsuplementary.entity.PostDTO;
import com.sofka.postcommentsuplementary.updateDTO.PostUpdateDTO;

import java.util.List;

public interface PostService {

    PostDTO createPost(PostDTO postDTO);

    PostUpdateDTO updatePost(PostUpdateDTO postUpdateDTO);

    void deletePost(Integer postId);

    //esto es solo para probar en postman, borrar despues
    List<Post> findAllPost();

    //PostDTO updatePost(PostDTO postDTO);


}
