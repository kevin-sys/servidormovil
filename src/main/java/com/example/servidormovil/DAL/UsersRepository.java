/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.servidormovil.DAL;
import com.example.servidormovil.ENTITY.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kevin
 */

public interface UsersRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
}
