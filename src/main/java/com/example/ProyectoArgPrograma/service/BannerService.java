package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Banner;
import com.example.ProyectoArgPrograma.repository.BannerRepository;
import java.util.List;
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
    public void borarBanner(Long id) {
        banRepo.deleteById(id);
    }

    @Override
    public void editarBanner(Banner ban) {
        banRepo.save(ban);
    }
}
