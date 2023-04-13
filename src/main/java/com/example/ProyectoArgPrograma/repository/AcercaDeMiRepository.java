package com.example.ProyectoArgPrograma.repository;

import com.example.ProyectoArgPrograma.model.AcercaDeMi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AcercaDeMiRepository extends JpaRepository <AcercaDeMi,Long>  {
    
}
