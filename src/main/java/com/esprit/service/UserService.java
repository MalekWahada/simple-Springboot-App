package com.esprit.service;

import com.esprit.entities.User;
import com.esprit.repositories.UserReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired(required=true)
    UserReposiory userRepo;

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepo.deleteById(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepo.findAll();
    }

    @Override
    public User updateUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User getUser(Long userId) {
        return userRepo.findById(userId).get();
    }
}
