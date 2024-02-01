package com.chatApp3.service.impl;


import com.chatApp3.model.User;
import com.chatApp3.repository.ChatUserRepository;
import com.chatApp3.service.ChatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ChatUserServiceImpl implements ChatUserService {

    @Autowired
    private ChatUserRepository userRepository;


    @Override
    public User createUser(String userName) {
        User user = new User(UUID.randomUUID().toString(), userName);
        return userRepository.save(user);
    }

    @Override
    public User getUser(String userId) {
        Optional<User> userResult =  userRepository.findById(userId);
        if(userResult.isPresent()){
            return userResult.get();
        }else{
            return null;
        }
    }


}
