package com.mahicodecrafts.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahicodecrafts.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
