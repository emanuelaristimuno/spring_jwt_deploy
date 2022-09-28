package com.portfolio.SpringBootBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreEdu;
    private String descripcionEdu;
    private String fotoEdu;

    public Educacion() {

    }

    public Educacion( String nombreEdu, String descripcionEdu, String fotoEdu) {
        
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.fotoEdu = fotoEdu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getFotoEdu() {
        return fotoEdu;
    }

    public void setFotoEdu(String fotoEdu) {
        this.fotoEdu = fotoEdu;
    }
    
    

    
}
