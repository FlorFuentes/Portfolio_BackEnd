package com.example.ProyectoArgPrograma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Redes {
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String link;

    public Redes() {
    }

    public Redes(Long id, String nombre, String link) {
        this.id = id;
        this.nombre = nombre;
        this.link = link;
    }
    
    
    
}
