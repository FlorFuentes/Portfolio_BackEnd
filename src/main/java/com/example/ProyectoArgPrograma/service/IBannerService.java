package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Banner;
import java.util.List;

public interface IBannerService {
    
    public List<Banner> verBanner();
    
    public void crearBanner(Banner ban);
    
    public void borrarBanner(Long id);
    
    public void editarBanner(Banner ban);
    
}
