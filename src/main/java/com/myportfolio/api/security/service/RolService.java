/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.security.service;

import com.myportfolio.api.security.entity.Rol;
import com.myportfolio.api.security.enums.RolNombre;
import com.myportfolio.api.security.repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author brand
 */

@Service
public class RolService {
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
    
    return rolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol ){
        rolRepository.save(rol);
    }
}
