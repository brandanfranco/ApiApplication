/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.Models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author brand
 */
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String direccion;

    @Column(name = "foto_url", length = 2048)
    private String foto;

    @Column(name = "aboutMe", length = 2048)
    private String acercaDeMi;
    private String email;

    @OneToMany(targetEntity=Proyecto.class,cascade = CascadeType.ALL)
    @JoinColumn(name="person_proyecto",referencedColumnName="id")
    private List<Proyecto> proyectos ;

    @OneToMany(targetEntity=Experiencia.class,cascade = CascadeType.ALL)
    @JoinColumn(name="person_experiencia",referencedColumnName="id")
    private List<Experiencia> experiencias ;

    @OneToMany(targetEntity=Skill.class,cascade = CascadeType.ALL)
    @JoinColumn(name="person_skill",referencedColumnName="id")
    private List<Skill> skills ;

    @OneToMany(targetEntity=Educacion.class,cascade = CascadeType.ALL)
    @JoinColumn(name="person_educacion",referencedColumnName="id")
    private List<Educacion> educaciones ;

    public Person() {
    }

    public Person(Long id, String nombre, String apellido, String direccion, String foto, String acercaDeMi, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.foto = foto;
        this.acercaDeMi = acercaDeMi;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getAcercaDeMi() {
        return acercaDeMi;
    }

    public void setAcercaDeMi(String acercaDeMi) {
        this.acercaDeMi = acercaDeMi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Proyecto> getProyecto() {
        return proyectos;
    }

    public void setProyecto(List<Proyecto> proyecto) {
        this.proyectos = proyecto;
    }

    public List<Experiencia> getExperiencia() {
        return experiencias;
    }

    public void setExperiencia(List<Experiencia> experiencia) {
        this.experiencias = experiencia;
    }

    public List<Skill> getSkill() {
        return skills;
    }

    public void setSkill(List<Skill> skill) {
        this.skills = skill;
    }

    public List<Educacion> getEducacion() {
        return educaciones;
    }

    public void setEducacion(List<Educacion> educacion) {
        this.educaciones = educacion;
    }

}
