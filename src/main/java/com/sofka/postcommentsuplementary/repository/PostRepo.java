package com.sofka.postcommentsuplementary.repository;


import com.sofka.postcommentsuplementary.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepo extends JpaRepository<Post,Integer> {


}
