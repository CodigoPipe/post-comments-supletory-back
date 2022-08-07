package com.sofka.postcommentsuplementary.controller;


import com.sofka.postcommentsuplementary.entity.Post;
import com.sofka.postcommentsuplementary.entity.PostDTO;
import com.sofka.postcommentsuplementary.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/")
public class Controller {


    @Autowired
    private PostService service;

    @GetMapping("all/posts")
    public List<Post> getAllPosts(){
        return service.findAllPost();
    }

    @PostMapping("create/post")
    public PostDTO createPost(@RequestBody PostDTO postDTO){
        return service.createPost(postDTO);
    }
}
