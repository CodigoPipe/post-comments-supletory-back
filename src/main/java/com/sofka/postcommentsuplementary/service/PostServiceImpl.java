package com.sofka.postcommentsuplementary.service;


import com.sofka.postcommentsuplementary.entity.Post;
import com.sofka.postcommentsuplementary.entity.PostDTO;
import com.sofka.postcommentsuplementary.mapper.MapperPost;
import com.sofka.postcommentsuplementary.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepo postRepo;


    @Override
    public PostDTO createPost(PostDTO postDTO) {

        Post post = MapperPost.returnPost(postDTO);
        post.setNumberOfLikes(0);
        return MapperPost.returnPostDTO(postRepo.save(post));
    }

    @Override
    public void deletePost(Integer postId) {

        Post post = postRepo.findById(postId).get();
        postRepo.delete(post);


    }

    //SOLO para probar postmanm, borrar al final
    @Override
    public List<Post> findAllPost() {
        return postRepo.findAll();
    }

    /*@Override
    public PostDTO updatePost(PostDTO postDTO) {

        Post post = postRepo.findById(postDTO.getPostId()).get();
        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getContent());

        return MapperPost.returnPostDTO(postRepo.save(post));

    }*/


}
