package com.myblog_rest_api.myblog_rest_api.repository;

import com.myblog_rest_api.myblog_rest_api.entity.Comment;
import com.myblog_rest_api.myblog_rest_api.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {


}
