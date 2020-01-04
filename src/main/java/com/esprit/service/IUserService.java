package com.esprit.service;

import com.esprit.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserService {

    public void addUser(User user);
//    public String getFirstNameByUserId(Long userId);
//    public String getLastNameByUserId(Long userId);
    public void deleteUser(Long userId) ;
    public List<User> getAllUsers();
    public User updateUser(User user);
    public User getUser(Long userId);
}
