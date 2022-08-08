package com.sofka.postcommentsuplementary.updateDTO;

public class PostUpdateDTO {

    private Integer postId;

    private String title;

    private String content;

    private Integer numberOfLikes;

    public PostUpdateDTO(Integer postId, String title, String content, Integer numberOfLikes) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.numberOfLikes = numberOfLikes;
    }

    public PostUpdateDTO() {
    }

    public PostUpdateDTO(Integer postId, String title, String content) {
        this.postId = postId;
        this.title = title;
        this.content = content;
    }


    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(Integer numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }
}
