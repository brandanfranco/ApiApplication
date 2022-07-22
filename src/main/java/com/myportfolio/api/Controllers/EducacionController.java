/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.Controllers;

import com.myportfolio.api.Models.Educacion;
import com.myportfolio.api.Services.EducacionService;
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
@RequestMapping("/api/educacion")
public class EducacionController {

    @Autowired
    EducacionService educacionService;

    @GetMapping("/all")
    public ArrayList<Educacion> getAllEducaciones() {

        return educacionService.getAllEducaciones();
    }

    @PostMapping()
    public Educacion saveEducacion(@RequestBody Educacion educacion) {

        return educacionService.saveEducacion(educacion);
    }

    @DeleteMapping("/{id}")
    public String removeEducacion(@PathVariable("id") Long id) {

        if (educacionService.removeEducacion(id)) {

            return "Educacion eliminada correctamente";
        } else {

            return "Educacion no se encontro o no existe";
        }
    }

    @PutMapping("/edit")
    public String editEducacion(@RequestBody Educacion educacion) {

        if (educacionService.editEducacion(educacion)) {

            return "Educacion editada correctamente";
        } else {
            return "Educacion no secontro o no existe";
        }

    }
}
