package com.myblog_rest_api.myblog_rest_api.service;

import com.myblog_rest_api.myblog_rest_api.payload.PostDto;
import com.myblog_rest_api.myblog_rest_api.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostDto updatePost(PostDto postDto, long id);
    PostResponse getAllPosts(int pageNo, int pageSize,String sortBy,String sortDir);
    PostDto getPostById(long id);
    void deletePost(long id);


}
