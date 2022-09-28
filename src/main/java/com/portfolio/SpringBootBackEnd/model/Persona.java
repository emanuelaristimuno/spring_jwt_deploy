package com.portfolio.SpringBootBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity

public class Persona {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    @Size(min = 1, max =50, message = "no cumple con la longitud")
    private String nombre;
    @NotNull
    @Size(min = 1, max =50, message = "no cumple con la longitud")
    private String apellido;
    @NotNull
    private String acercaDe;
    private String fotoperfil;
    
    public Persona(){
        
    }

    public Persona(String nombre, String apellido, String acercaDe, String fotoperfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.acercaDe = acercaDe;
        this.fotoperfil = fotoperfil;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getAcercaDe() {
        return acercaDe;
    }

    public void setAcercaDe(String acercaDe) {
        this.acercaDe = acercaDe;
    }

    public String getFotoperfil() {
        return fotoperfil;
    }

    public void setFotoperfil(String fotoperfil) {
        this.fotoperfil = fotoperfil;
    }

                
    
}
