package com.chatApp3.controller;



import com.chatApp3.model.User;
import com.chatApp3.service.ChatUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class ChatAppController {

    @Autowired
    private ChatUserService chatUserService;

    @PutMapping("/create")
    public User createUser(@Valid @RequestParam("user_name") String userName){
        return chatUserService.createUser(userName);
    }

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable String userId){
        return chatUserService.getUser(userId);
    }


}
