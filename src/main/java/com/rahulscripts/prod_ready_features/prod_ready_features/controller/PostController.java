package com.rahulscripts.prod_ready_features.prod_ready_features.controller;

import com.rahulscripts.prod_ready_features.prod_ready_features.dto.PostDto;
import com.rahulscripts.prod_ready_features.prod_ready_features.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    @GetMapping
    private List<PostDto> getAllPosts(){
        return postService.getAllPosts();
    }

    @PostMapping("/createPost")
    private ResponseEntity<PostDto> createNewPost(@RequestBody PostDto postDto){
        return new ResponseEntity<>(postService.createNewPost(postDto), HttpStatus.CREATED);
    }

    @GetMapping("/{postId}")
    private PostDto getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);
    }
}
