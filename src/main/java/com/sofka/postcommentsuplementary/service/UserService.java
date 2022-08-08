package com.sofka.postcommentsuplementary.service;


import com.sofka.postcommentsuplementary.entity.UserLike;
import com.sofka.postcommentsuplementary.entity.UserLikeDTO;

import java.util.List;

public interface UserService {

    UserLikeDTO createUserLike(UserLikeDTO userLike);

    List<UserLike> findAllUsers();
}
