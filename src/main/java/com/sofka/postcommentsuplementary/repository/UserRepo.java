package com.sofka.postcommentsuplementary.repository;


import com.sofka.postcommentsuplementary.entity.UserLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserLike, Integer> {


}
