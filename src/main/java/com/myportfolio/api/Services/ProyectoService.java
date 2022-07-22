/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.Services;

import com.myportfolio.api.Models.Proyecto;
import com.myportfolio.api.Repositories.ProyectoRepository;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author brand
 */
@Service
@Transactional
public class ProyectoService {

    @Autowired
    ProyectoRepository proyectoRepository;

    public ArrayList<Proyecto> getAllProyectos() {

        return (ArrayList<Proyecto>) proyectoRepository.findAll();
    }

    public Proyecto saveProyecto(Proyecto proyecto) {

        
           return proyectoRepository.save(proyecto);
            

        

    }

    public Boolean removeProyecto(Long id) {
        try {
            proyectoRepository.deleteById(id);
            return true;

        } catch (Exception e) {
            return false;

        }

    }

    public Boolean editProyecto(Proyecto proyecto) {
        try {
            proyectoRepository.save(proyecto);
            return true;

        } catch (Exception e) {
            return false;

        }

    }
}
