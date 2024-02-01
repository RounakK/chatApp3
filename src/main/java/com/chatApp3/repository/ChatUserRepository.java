package com.chatApp3.repository;

import com.chatApp3.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ChatUserRepository extends CrudRepository<User, String> {
}
