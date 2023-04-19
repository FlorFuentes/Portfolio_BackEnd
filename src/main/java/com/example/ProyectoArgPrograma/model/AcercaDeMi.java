package com.example.ProyectoArgPrograma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class AcercaDeMi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String fotoPerfil;
    private String sobreMi;

    public AcercaDeMi() {
    }

    public AcercaDeMi(Long id, String fotoPerfil, String sobreMi) {
        this.id = id;
        this.fotoPerfil = fotoPerfil;
        this.sobreMi = sobreMi;
    }
    
}
