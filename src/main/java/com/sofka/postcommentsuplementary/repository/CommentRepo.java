package com.sofka.postcommentsuplementary.repository;

import com.sofka.postcommentsuplementary.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer> {
}
