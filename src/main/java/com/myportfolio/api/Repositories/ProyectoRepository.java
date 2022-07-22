/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.Repositories;

import com.myportfolio.api.Models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author brand
 */
public interface ProyectoRepository extends JpaRepository<Proyecto,Long> {
    
}
