package com.chatApp3.service;


import com.chatApp3.model.User;
import org.springframework.stereotype.Service;


public interface ChatUserService {

    public User createUser(String userName);

    public User getUser(String userId);

}
