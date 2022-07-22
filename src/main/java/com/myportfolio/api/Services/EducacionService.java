/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.Services;

import com.myportfolio.api.Models.Educacion;
import com.myportfolio.api.Repositories.EducacionRepository;
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
public class EducacionService {

    @Autowired
    EducacionRepository educacionRepository;

    public ArrayList<Educacion> getAllEducaciones() {

        return (ArrayList<Educacion>) educacionRepository.findAll();
    }

    public Educacion saveEducacion(Educacion educacion) {

        return educacionRepository.save(educacion);
    }

    public Boolean removeEducacion(Long id) {

        try {
            educacionRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean editEducacion(Educacion educacion) {

        try {
            educacionRepository.save(educacion);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
