/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.Controllers;

import com.myportfolio.api.Models.Proyecto;
import com.myportfolio.api.Services.ProyectoService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author brand
 */

@RestController
@RequestMapping("/api/proyecto")
public class ProyectoController {

    @Autowired
    ProyectoService proyectoService;

    @GetMapping("/all")
    public ArrayList<Proyecto> getAllProyectos() {

        return proyectoService.getAllProyectos();
    }

    @PostMapping()
    public Proyecto saveProyecto(@RequestBody Proyecto proyecto) {

        return proyectoService.saveProyecto(proyecto);
    }
    
    @DeleteMapping("/{id}")
    public String removeProyecto(@PathVariable("id") Long id) {

        if (proyectoService.removeProyecto(id)) {
            return "El Proyecto se elimino correctamente";
        } else {
            return "El proyecto no se encontro o no existe";
        }
    }

    @PutMapping("/edit")
    public String editProyecto(@RequestBody Proyecto proyecto) {

        if (proyectoService.editProyecto(proyecto)) {
            return "El proyecto se edito correctamente";
        } else {
            return "El proyecto no se encontro o no existe";
        }
    }
}
