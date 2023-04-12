
package com.example.ProyectoArgPrograma.repository;

import java.util.List;
import org.springframework.boot.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepository extends JpaRepository <Banner,Long> {

    
}
