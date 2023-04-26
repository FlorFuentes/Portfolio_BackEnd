package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Banner;
import com.example.ProyectoArgPrograma.repository.BannerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerService implements IBannerService {
    
    @Autowired
    public BannerRepository banRepo;

    @Override
    public List<Banner> verBanner() {
        return banRepo.findAll();
    }

    @Override
    public void crearBanner(Banner ban) {
        banRepo.save(ban);
    }

    @Override
    public void borrarBanner(Long id) {
        banRepo.deleteById(id);
    }

    @Override
    public void editarBanner(Banner ban) {
        Optional <Banner> bann= banRepo.findById(ban.getId());
        
        if(bann.isPresent()){
            Banner baan = bann.get();
            baan.setNombre( ban.getNombre());
            baan.setImagen(ban.getImagen());
            baan.setTitulo(ban.getTitulo());
            banRepo.save(baan);
        }else {
            throw new RuntimeException("Banner not found for id : " + ban.getId());
        }
    }

  
   

   
}
