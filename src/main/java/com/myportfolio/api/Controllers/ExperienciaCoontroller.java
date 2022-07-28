/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.Controllers;

import com.myportfolio.api.Models.Experiencia;
import com.myportfolio.api.Services.ExperienciaService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("/api/experiencia")
@CrossOrigin
public class ExperienciaCoontroller {

    @Autowired
    ExperienciaService experienciaService;

    @GetMapping("/all")
    public ArrayList<Experiencia> getAllExperiencias() {

        return experienciaService.getAllExperiencias();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public Experiencia saveProyecto(@RequestBody Experiencia experiencia) {

        return experienciaService.saveExperiencia(experiencia);

    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public String removeExperiencia(@PathVariable("id") Long id) {

        if (experienciaService.removeExperiencia(id)) {

            return "La Experiencia se elimino correctamente";
        } else {

            return "La Experiencia no se encontro o no existe";
        }
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/edit")
    public String editExperiencia(@RequestBody Experiencia experiencia) {

        if (experienciaService.editExperiencia(experiencia)) {
            return "La Experiencia se edito correctamente";
        } else {

            return "La Experiencia no se encontro o no existe";
        }
    }
}
