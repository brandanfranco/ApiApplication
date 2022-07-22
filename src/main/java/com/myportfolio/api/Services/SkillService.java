/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.Services;

import com.myportfolio.api.Models.Skill;
import com.myportfolio.api.Repositories.SkillRepository;
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
public class SkillService {

    @Autowired
    SkillRepository skillRepository;

    public ArrayList<Skill> getAllSkills() {

        return (ArrayList<Skill>) skillRepository.findAll();
    }

    public Skill saveSkill(Skill skill) {

        return skillRepository.save(skill);
    }

    public Boolean removeSkill(Long id) {

        try {
            skillRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean editSkill(Skill skill) {

        try {
            skillRepository.save(skill);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
