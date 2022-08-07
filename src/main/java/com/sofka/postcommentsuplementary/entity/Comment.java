package com.sofka.postcommentsuplementary.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcomment", nullable = false)
    private Integer id;

    @Column(name = "comment_content", nullable = false)
    private String commentContent;

    @Column(name = "number_of_likes_comment", nullable = false)
    private Integer numberOfLikesComment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "post_idpost", nullable = false)
    private Post postIdpost;

    @ManyToMany
    @JoinTable(name = "user_like_has_comment",
            joinColumns = @JoinColumn(name = "comment_idcomment"),
            inverseJoinColumns = @JoinColumn(name = "user_like_iduser_like"))
    private Set<UserLike> userLikes = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getNumberOfLikesComment() {
        return numberOfLikesComment;
    }

    public void setNumberOfLikesComment(Integer numberOfLikesComment) {
        this.numberOfLikesComment = numberOfLikesComment;
    }

    public Post getPostIdpost() {
        return postIdpost;
    }

    public void setPostIdpost(Post postIdpost) {
        this.postIdpost = postIdpost;
    }

    public Set<UserLike> getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(Set<UserLike> userLikes) {
        this.userLikes = userLikes;
    }

}