package com.sofka.postcommentsuplementary.service;

import com.sofka.postcommentsuplementary.entity.UserLike;
import com.sofka.postcommentsuplementary.entity.UserLikeDTO;
import com.sofka.postcommentsuplementary.mapper.MapperUserLike;
import com.sofka.postcommentsuplementary.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    UserRepo userRepo;


    @Override
    public UserLikeDTO createUserLike(UserLikeDTO userLikeDTO) {

        UserLike userLike = MapperUserLike.returnUserLike(userLikeDTO);
        return MapperUserLike.returnUserLikeDTO(userRepo.save(userLike));

    }

    @Override
    public List<UserLike> findAllUsers() {
        return userRepo.findAll();
    }
}
