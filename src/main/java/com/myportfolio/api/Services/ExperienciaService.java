/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.Services;

import com.myportfolio.api.Models.Experiencia;
import com.myportfolio.api.Repositories.ExperienciaRepository;
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
public class ExperienciaService {

    @Autowired
    ExperienciaRepository experienciaRepository;

    public ArrayList<Experiencia> getAllExperiencias() {

        return (ArrayList<Experiencia>) experienciaRepository.findAll();
    }

    public Experiencia saveExperiencia(Experiencia experiencia) {

        return experienciaRepository.save(experiencia);
    }

    public Boolean removeExperiencia(Long id) {

        try {
            experienciaRepository.deleteById(id);
            return true;

        } catch (Exception e) {
            return false;

        }
    }

    public Boolean editExperiencia(Experiencia experiencia) {

        try {
            experienciaRepository.save(experiencia);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
