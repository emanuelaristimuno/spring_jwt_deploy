
package com.portfolio.SpringBootBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    
    private int id;
    private String nombreEx;
    private String descripcionEx;
    private String fotoEx;
     
    
    public Experiencia(){
        
    }
    
    public Experiencia (String nombreEx, String descripcionEx, String fotoEx){
        
        
        this.nombreEx = nombreEx;
        this.descripcionEx = descripcionEx;
        this.fotoEx = fotoEx;
    }
    
    //Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEx() {
        return nombreEx;
    }

    public void setNombreEx(String nombreEx) {
        this.nombreEx = nombreEx;
    }

    public String getDescripcionEx() {
        return descripcionEx;
    }

    public void setDescripcionEx(String descripcionEx) {
        this.descripcionEx = descripcionEx;
    }

    public String getFotoEx() {
        return fotoEx;
    }

    public void setFotoEx(String fotoEx) {
        this.fotoEx = fotoEx;
    }

    
    
    
    
    
}
