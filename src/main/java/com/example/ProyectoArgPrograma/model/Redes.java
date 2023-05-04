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
   
    private String github;
    private String telegrema;
    private String linkedin;

    public Redes() {
    }

    public Redes(Long id, String github, String telegrema, String linkedin) {
        this.id = id;
        this.github = github;
        this.telegrema = telegrema;
        this.linkedin = linkedin;
    }

        
    
    
}
