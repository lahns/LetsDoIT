package com.zseprojekt.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserrController {
    @Autowired
    private UserrService userService;

    @PostMapping("/addUser")
    public Userr addUser(@RequestBody Userr user) {
        System.out.println(user);
        return userService.createUser(user);
    }
    @PostMapping("/addUsers")
    public List<Userr> addUsers(@RequestBody List<Userr> users){
        return userService.createUsers(users);
    }
    @GetMapping("/user/{id}")
    public Userr getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    @GetMapping("/users")
    public List<Userr> getAllUsers(){
        return userService.getUsers();
    }
    @PutMapping("/updateUser")
    public Userr updateUser(@RequestBody Userr user){
        return userService.updateUser(user);
    }
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }
}
