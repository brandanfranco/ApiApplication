/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.Controllers;

import com.myportfolio.api.Models.Skill;
import com.myportfolio.api.Services.SkillService;
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
@RequestMapping("/api/skill")
public class SkillController {

    @Autowired
    SkillService skillService;

    @GetMapping("/all")
    public ArrayList<Skill> getAllSkills() {

        return skillService.getAllSkills();
    }

    @PostMapping()
    public Skill saveSkill(@RequestBody Skill skill) {

        return skillService.saveSkill(skill);
    }

    @DeleteMapping("/{id}")
    public String removeSkill(@PathVariable("id") Long id) {

        if (skillService.removeSkill(id)) {

            return "Skill Eliminado correctamente";
        } else {
            return "Skill no se encontro o no existe";
        }
    }

    @PutMapping("/edit")
    public String editSkill(@RequestBody Skill skill) {

        if (skillService.editSkill(skill)) {

            return "Skill editado correctamente";
        } else {
            return "Skill no se encontro o no existe";
        }
    }
}
