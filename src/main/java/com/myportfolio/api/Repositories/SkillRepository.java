/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.Repositories;

import com.myportfolio.api.Models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author brand
 */
public interface SkillRepository  extends JpaRepository<Skill,Long>{
    
}
