package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.repository.BannerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

@Service
public class BannerService {
    
    @Autowired
    public BannerRepository bannRepo;
    
 
    public List<Banner> verBanner() {
        return bannRepo.findAll();
    }

    
    public void crearBanner(Banner bann) {
       bannRepo.save(bann);
    }

    
    public void borrarBanner(Long id) {
       bannRepo.deleteById(id);
    }
    
    public void editarBanner(Banner bannerActualizado) {
        bannRepo.save(bannerActualizado);
    }
    
}
