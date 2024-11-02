package com.myblog_rest_api.myblog_rest_api.repository;

import com.myblog_rest_api.myblog_rest_api.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findPostById(long postId);
}
