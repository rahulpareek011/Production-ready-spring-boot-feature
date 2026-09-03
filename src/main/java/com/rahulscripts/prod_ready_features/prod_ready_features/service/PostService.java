package com.rahulscripts.prod_ready_features.prod_ready_features.service;

import com.rahulscripts.prod_ready_features.prod_ready_features.dto.PostDto;

import java.util.List;

public interface PostService {
    public List<PostDto> getAllPosts();
    public PostDto createNewPost(PostDto postDto);
    public PostDto getPostById(Long postId);
}
