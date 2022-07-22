/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.Controllers;

import com.myportfolio.api.Models.Person;
import com.myportfolio.api.Services.PersonService;
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
@RequestMapping("/api/person")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

    @Autowired
    PersonService personService;

    
    @GetMapping("/all")
    public ArrayList<Person> getAllPersons() {

        return personService.getAllPersons();
    }

    @PostMapping()
    public Person savePerson(@RequestBody Person person) {

        return personService.savePerson(person);
    }

    @DeleteMapping("/{id}")
    public String removePerson(@PathVariable("id") Long id) {

        if (personService.removePerson(id)) {
            return "La persona  se Elimino correctamente";
        } else {
            return "La persona no existe o no se pudo encontrar";
        }
    }
    
    
    
    @PutMapping("/edit")
    public String editPerson(@RequestBody Person person){
    
       if( personService.editPerson(person)){
       return  "La Persona se edito correctamente";
               
       
       }else{
           return " La Persona no existe o no se  pudo encontrar ";
       }
        
    }
            

}
