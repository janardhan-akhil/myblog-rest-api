package com.myblog_rest_api.myblog_rest_api.service;

import com.myblog_rest_api.myblog_rest_api.entity.Comment;
import com.myblog_rest_api.myblog_rest_api.payload.CommentDto;

import java.util.List;

public interface CommentService {

    CommentDto createComment(long postId,CommentDto commentDto);
    List<CommentDto> getCommentPostById(long postId);

    CommentDto updateComment(long postId, long id, CommentDto commentDto);

    void deleteComment(long postId, long commentId);
}
