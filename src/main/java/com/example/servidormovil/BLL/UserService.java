/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.servidormovil.BLL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.servidormovil.ENTITY.User;
import com.example.servidormovil.DAL.UsersRepository;

/**
 *
 * @author kevin
 */
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UsersRepository repository;

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public String deleteUser(int id) {
        repository.deleteById(id);
        return "El usuario con el id: " + id + " Se ha eliminado";
    }

    public User updateUser(User user) {
        User existingUser = repository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setAddress(user.getAddress());
        return repository.save(existingUser);
    }

    public User getUserById(int id) {
        return repository.findById(id).orElse(null);
    }

}
