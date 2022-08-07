package com.sofka.postcommentsuplementary.service;


import com.sofka.postcommentsuplementary.entity.Post;
import com.sofka.postcommentsuplementary.entity.PostDTO;
import com.sofka.postcommentsuplementary.mapper.MapperPost;
import com.sofka.postcommentsuplementary.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepo postRepo;

    @Autowired
    MapperPost mapperPost;


    @Override
    public PostDTO createPost(PostDTO postDTO) {

        Post post = mapperPost.returnPost(postDTO);
        return mapperPost.returnPostDTO(postRepo.save(post));
    }


}
