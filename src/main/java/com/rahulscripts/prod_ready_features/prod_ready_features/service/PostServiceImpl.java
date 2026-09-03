package com.rahulscripts.prod_ready_features.prod_ready_features.service;

import com.rahulscripts.prod_ready_features.prod_ready_features.dto.PostDto;
import com.rahulscripts.prod_ready_features.prod_ready_features.entity.PostEntity;
import com.rahulscripts.prod_ready_features.prod_ready_features.exceptions.ResourceNotFoundException;
import com.rahulscripts.prod_ready_features.prod_ready_features.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<PostDto> getAllPosts() {
        return postRepository
                .findAll()
                .stream()
                .map(postEntity -> modelMapper.map(postEntity, PostDto.class))
                .toList();
    }

    @Override
    public PostDto createNewPost(PostDto postDto) {
        PostEntity postEntity = postRepository.save(modelMapper.map(postDto, PostEntity.class));
        return modelMapper.map(postEntity, PostDto.class);
    }

    @Override
    public PostDto getPostById(Long postId) {
        PostEntity postEntity = postRepository
                .findById(postId)
                .orElseThrow(() -> new ResourceNotFoundException("Post not found with id: " + postId));
        return modelMapper.map(postEntity, PostDto.class);
    }


}
