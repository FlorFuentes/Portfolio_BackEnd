package com.example.ProyectoArgPrograma.repository;

import com.example.ProyectoArgPrograma.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends JpaRepository <Habilidades,Long>  {
    
}
