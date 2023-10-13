package com.codebuddies.blog.repository;

import com.codebuddies.blog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
