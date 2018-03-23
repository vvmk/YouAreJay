package com.complexaesthetic.youarejay.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * filename:
 * project: YouAreJay
 * author: https://github.com/vvmk
 * date: 3/22/18
 */

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long userId;

    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    private Date joinedOn;

    private String githubId;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "recipientId")
    private List<Message> receivedMessages;

    public User() {
        // -_-
    }

    public Date getJoinedOn() {
        return joinedOn;
    }

    public void setJoinedOn(Date joinedOn) {
        this.joinedOn = joinedOn;
    }

    public List<Message> getReceivedMessages() {
        return receivedMessages;
    }

    public void setReceivedMessages(List<Message> receivedMessages) {
        this.receivedMessages = receivedMessages;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithubId() {
        return githubId;
    }

    public void setGithubId(String githubId) {
        this.githubId = githubId;
    }
}
