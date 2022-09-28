package com.portfolio.SpringBootBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Especializaciones {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    
    private int id;
    private String nombreEspe;
    private String descripcionEspe;
    private String fotoEspe;

    public Especializaciones() {
    }

    public Especializaciones(String nombreEspe, String descripcionEspe, String fotoEspe) {
        
        this.nombreEspe = nombreEspe;
        this.descripcionEspe = descripcionEspe;
        this.fotoEspe = fotoEspe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEspe() {
        return nombreEspe;
    }

    public void setNombreEspe(String nombreEspe) {
        this.nombreEspe = nombreEspe;
    }

    public String getDescripcionEspe() {
        return descripcionEspe;
    }

    public void setDescripcionEspe(String descripcionEspe) {
        this.descripcionEspe = descripcionEspe;
    }

    public String getFotoEspe() {
        return fotoEspe;
    }

    public void setFotoEspe(String fotoEspe) {
        this.fotoEspe = fotoEspe;
    }
    
    
    
}
