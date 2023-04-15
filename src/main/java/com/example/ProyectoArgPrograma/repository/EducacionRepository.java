package com.example.ProyectoArgPrograma.repository;

import com.example.ProyectoArgPrograma.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long>{
    
}
