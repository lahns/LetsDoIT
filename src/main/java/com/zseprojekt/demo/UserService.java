package com.zseprojekt.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository UserRepository;

    public User createUser(User user){
        return UserRepository.save(user);
    }
    public List<User> createUsers(List<User> users){
        return UserRepository.saveAll(users);
    }
    public User getUserById(int id){
        return UserRepository.findById(id).orElse(null);
    }
    public List<User> getUsers(){
        return UserRepository.findAll();
    }
    public User updateUser(User user){
        User oldUser=null;
        Optional<User> optionaluser = UserRepository.findById(user.getId());
        if(optionaluser.isPresent()){
            oldUser=optionaluser.get();
            oldUser.setUsername(user.getUsername());
            oldUser.setPassword(user.getPassword());
            UserRepository.save(oldUser);
        }
        else{
            return new User();
        }
        return oldUser;
    }
    public String deleteUser(int id){
        UserRepository.deleteById(id);
        return "User got deleted";
    }
}
