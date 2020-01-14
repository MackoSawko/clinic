package com.uz.clinic.controllers;

import com.uz.clinic.domain.User;
import com.uz.clinic.domain.VisitDto;
import com.uz.clinic.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }
    
    @GetMapping("/id/{id}")
    public Optional<User> getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @GetMapping("/email/{email}")
    public User getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }

    @DeleteMapping
    public void deleteUser(int id){
        userService.removeUser(id);
    }

    @PatchMapping("/update/{id}")
    public void upadteUser(@PathVariable int id, @RequestBody User updatedUser){
        userService.updateUser(id, updatedUser);
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }


}
