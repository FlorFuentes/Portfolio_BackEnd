package com.example.ProyectoArgPrograma.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Banner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String titulo;
    private String imagen;
    
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    
    //Constructor vacio

    public Banner() {
    }

    public Banner(Long id, String nombre, String titulo, String imagen, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.imagen = imagen;
        this.usuario = usuario;
    }

    
   
    
}
