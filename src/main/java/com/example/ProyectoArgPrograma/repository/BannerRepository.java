package com.example.ProyectoArgPrograma.repository;

import com.example.ProyectoArgPrograma.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepository extends JpaRepository <Banner,Long> {
    
}
