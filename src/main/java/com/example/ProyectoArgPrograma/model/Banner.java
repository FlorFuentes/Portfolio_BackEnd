package com.example.ProyectoArgPrograma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Banner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String titulo;
    private String imagen;

    public Banner() {
    }

    public Banner(Long id, String nombre, String titulo, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.imagen = imagen;
    }
    
    
}
