package com.example.ProyectoArgPrograma.repository;

import com.example.ProyectoArgPrograma.model.Redes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedesRepository extends JpaRepository <Redes, Long> {
    
}
