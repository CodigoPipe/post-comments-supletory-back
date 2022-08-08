package com.sofka.postcommentsuplementary.controller;


import com.sofka.postcommentsuplementary.entity.Comment;
import com.sofka.postcommentsuplementary.entity.CommentDTO;
import com.sofka.postcommentsuplementary.entity.Post;
import com.sofka.postcommentsuplementary.entity.PostDTO;
import com.sofka.postcommentsuplementary.service.CommentService;
import com.sofka.postcommentsuplementary.service.PostService;
import com.sofka.postcommentsuplementary.updateDTO.CommentUpdateDTO;
import com.sofka.postcommentsuplementary.updateDTO.PostUpdateDTO;
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

    //POST METHODS
    @GetMapping("all/posts")
    public List<Post> getAllPosts(){
        return postService.findAllPost();
    }

    @DeleteMapping("delete/post/{postId}")
    public void deletePost(@PathVariable Integer postId){
        postService.deletePost(postId);
    }


    @PostMapping("create/post")
    public PostDTO createPost(@RequestBody PostDTO postDTO){
        return postService.createPost(postDTO);
    }

    @PutMapping("update/post")
    public PostUpdateDTO updatePost(@RequestBody PostUpdateDTO postUpdateDTO){
        return postService.updatePost(postUpdateDTO);
    }




    //COMMENT METHODS

    @PostMapping("create/comment")
    public CommentDTO createComment(@RequestBody CommentDTO commentDTO){
        return commentService.createComment(commentDTO);
    }

    @GetMapping("all/comments")
    public List<Comment> getAllComments(){
        return commentService.findAllComments();
    }

    @PutMapping("update/comment")
    public CommentUpdateDTO updateComment(@RequestBody CommentUpdateDTO commentUpdateDTO){
        return commentService.updateComment(commentUpdateDTO);
    }

    @DeleteMapping("delete/comment/{commentId}")
    public void deleteCooment(@PathVariable Integer commentId){
        commentService.deleteComment(commentId);
    }










}
