package com.example.ProyectoArgPrograma.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String password;

    @OneToOne(mappedBy="usuario",fetch = FetchType.LAZY)
    private Banner banner;//Hago referencia a la clase Banner
    
    public Usuario() {
    }

    public Usuario(Long id, String nombre, String email, String password, Banner banner) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.banner = banner;
    }   
    
}
