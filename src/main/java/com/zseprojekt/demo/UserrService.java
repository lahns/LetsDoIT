package com.zseprojekt.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserrService {
    @Autowired
    private UserRepository UserRepository;

    public Userr createUser(Userr user){
        return UserRepository.save(user);
    }
    public List<Userr> createUsers(List<Userr> users){
        return UserRepository.saveAll(users);
    }
    public Userr getUserById(int id){
        return UserRepository.findById(id).orElse(null);
    }
    public List<Userr> getUsers(){
        return UserRepository.findAll();
    }
    public Userr updateUser(Userr user){
        Userr oldUser=null;
        Optional<Userr> optionaluser = UserRepository.findById(user.getId());
        if(optionaluser.isPresent()){
            oldUser=optionaluser.get();
            oldUser.setUsername(user.getUsername());
            oldUser.setPassword(user.getPassword());
            UserRepository.save(oldUser);
        }
        else{
            return new Userr();
        }
        return oldUser;
    }
    public String deleteUser(int id){
        UserRepository.deleteById(id);
        return "User got deleted";
    }
}
