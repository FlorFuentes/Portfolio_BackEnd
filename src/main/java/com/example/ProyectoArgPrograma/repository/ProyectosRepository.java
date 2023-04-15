package com.example.ProyectoArgPrograma.repository;

import com.example.ProyectoArgPrograma.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository  extends JpaRepository <Proyectos,Long> {
    
}
