package com.esprit.Controller;

import com.esprit.entities.User;
import com.esprit.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api")
public class UserController {

    @Autowired(required=true)
    IUserService userService;

//    @Autowired
//    private UserReposiory userReposiory;

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }


    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @DeleteMapping("/user/{id}")
    public boolean deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return true;
    }

    @PostMapping("/user")
    public void createUser(@RequestBody User user){
         userService.addUser(user);
    }

    @PutMapping("/user")
    @ResponseBody
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

}
