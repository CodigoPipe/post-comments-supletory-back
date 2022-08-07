package com.sofka.postcommentsuplementary.controller;


import com.sofka.postcommentsuplementary.entity.Comment;
import com.sofka.postcommentsuplementary.entity.CommentDTO;
import com.sofka.postcommentsuplementary.entity.Post;
import com.sofka.postcommentsuplementary.entity.PostDTO;
import com.sofka.postcommentsuplementary.service.CommentService;
import com.sofka.postcommentsuplementary.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/")
public class Controller {


    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    //Borrar al final, solo para probar
    @GetMapping("all/posts")
    public List<Post> getAllPosts(){
        return postService.findAllPost();
    }

    @GetMapping("all/comments")
    public List<Comment> getAllComments(){
        return commentService.findAllComments();
    }


    @PostMapping("create/post")
    public PostDTO createPost(@RequestBody PostDTO postDTO){
        return postService.createPost(postDTO);
    }

    @PostMapping("create/comment")
    public CommentDTO createComment(@RequestBody CommentDTO commentDTO){
        return commentService.createComment(commentDTO);
    }


}
