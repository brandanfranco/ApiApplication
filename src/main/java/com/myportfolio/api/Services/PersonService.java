/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.Services;

import com.myportfolio.api.Models.Person;
import com.myportfolio.api.Repositories.PersonRepository;
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
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public ArrayList<Person> getAllPersons() {

        return (ArrayList<Person>) personRepository.findAll();
    }

    public Person savePerson(Person person) {

        return personRepository.save(person);
    }

    public Boolean removePerson(Long id) {
        try {
            personRepository.deleteById(id);
            return true;

        } catch (Exception e) {
            return false;

        }

    }
    
    
    public Boolean editPerson(Person person) {
        try {
            personRepository.save(person);
            return true;

        } catch (Exception e) {
            return false;

        }

    }
}
