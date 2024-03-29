package com.example.ProyectoArgPrograma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String descripcion;
    private String institucion;
    private String imgDiploma;

    public Educacion() {
    }

    public Educacion(Long id, String descripcion, String institucion, String imgDiploma) {
        this.id = id;
        this.descripcion = descripcion;
        this.institucion = institucion;
        this.imgDiploma = imgDiploma;
    }
    
}



   