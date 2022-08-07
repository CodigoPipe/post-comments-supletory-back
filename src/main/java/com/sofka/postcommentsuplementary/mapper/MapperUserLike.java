package com.sofka.postcommentsuplementary.mapper;


import com.sofka.postcommentsuplementary.entity.UserLike;
import com.sofka.postcommentsuplementary.entity.UserLikeDto;

public class MapperUserLike {


    public UserLike returnUserLike(UserLikeDto userLikeDto){
        return new UserLike(userLikeDto.getUserName(), userLikeDto.getDni());
    }

    public UserLikeDto returnUserLikeDTO(UserLike userLike){
        return new UserLikeDto(userLike.getUserId(), userLike.getUserName(), userLike.getDni(), userLike.getComments(), userLike.getPosts());
    }


}