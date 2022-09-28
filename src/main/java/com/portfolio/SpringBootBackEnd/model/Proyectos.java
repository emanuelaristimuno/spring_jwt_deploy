package com.portfolio.SpringBootBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Proyectos {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    
    private String nombrePro;
    private String descripcionPro;
    private String fotoPro;
    
    public Proyectos(){
        
    }

    public Proyectos(String nombrePro, String descripcionPro, String fotoPro) {
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.fotoPro = fotoPro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getDescripcionPro() {
        return descripcionPro;
    }

    public void setDescripcionPro(String descripcionPro) {
        this.descripcionPro = descripcionPro;
    }

    public String getFotoPro() {
        return fotoPro;
    }

    public void setFotoPro(String fotoPro) {
        this.fotoPro = fotoPro;
    }
    
    
}
