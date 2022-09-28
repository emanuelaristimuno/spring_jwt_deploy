package com.portfolio.SpringBootBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Habilidades {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    
    private String nombreHabi;
    private String porcentajeHabi;
    private String fotoHabi;

    public Habilidades() {
    }

    public Habilidades(String nombreHabi, String porcentajeHabi, String fotoHabi) {
        this.nombreHabi = nombreHabi;
        this.porcentajeHabi = porcentajeHabi;
        this.fotoHabi = fotoHabi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreHabi() {
        return nombreHabi;
    }

    public void setNombreHabi(String nombreHabi) {
        this.nombreHabi = nombreHabi;
    }

    public String getPorcentajeHabi() {
        return porcentajeHabi;
    }

    public void setPorcentajeHabi(String porcentajeHabi) {
        this.porcentajeHabi = porcentajeHabi;
    }

    public String getFotoHabi() {
        return fotoHabi;
    }

    public void setFotoHabi(String fotoHabi) {
        this.fotoHabi = fotoHabi;
    }

    
    
}
