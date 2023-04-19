package com.example.ProyectoArgPrograma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String descripcion;
    private String link;
    private String titulo;

    public Proyectos() {
    }

    public Proyectos(Long id, String descripcion, String link, String titulo) {
        this.id = id;
        this.descripcion = descripcion;
        this.link = link;
        this.titulo = titulo;
    }
    
    
    
}
