/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.util;

import com.myportfolio.api.security.entity.Rol;
import com.myportfolio.api.security.enums.RolNombre;
import com.myportfolio.api.security.service.RolService;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 **
 * @author brand
 */
@Component
public class CreateRoles implements 
  ApplicationListener<ContextRefreshedEvent> {
    
    

    
    @Autowired
    RolService rolService;

    
    public void run(String... args) throws Exception {
     
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody*/
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
      // Esta clase se ejecuta una sola vez para crear los roles /
    /**   Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);:

        rolService.save(rolAdmin);
        rolService.save(rolUser); //Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        * */
    
    }
}
