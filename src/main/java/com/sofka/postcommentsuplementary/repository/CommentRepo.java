package com.sofka.postcommentsuplementary.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.stream.events.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment,Integer> {
}
