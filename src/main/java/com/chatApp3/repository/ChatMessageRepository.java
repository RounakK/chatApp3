package com.chatApp3.repository;


import com.chatApp3.model.Message;
import com.chatApp3.model.User;

public interface ChatMessageRepository {
    public Message getMessage(User user1, User user2, Integer numberOfMessages);
}
