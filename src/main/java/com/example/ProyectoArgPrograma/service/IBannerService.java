
package com.example.ProyectoArgPrograma.service;

import java.util.List;
import org.springframework.boot.Banner;


public interface IBannerService {
    public List<Banner> verBanner();
    public void crearBanner(Banner bann);
    public void borrarBanner(Long id);
    public void editarBanner(Long id);

    //void editarBanner(Banner bannerActualizado);

    public void editarBanner(Banner bannerActualizado);
}
