package com.example.ProyectoArgPrograma.Controller;

import com.example.ProyectoArgPrograma.model.Banner;
import com.example.ProyectoArgPrograma.service.IBannerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfolio-argprograma-6ed7c.web.app")
public class BannerController {
    
    @Autowired
    private IBannerService bannerServ;
    
    @PostMapping("/banner/new")
    public void agregarBanner( @RequestBody Banner ban){
        bannerServ.crearBanner(ban);
    }
    
    @GetMapping ("/banner/ver")
    @ResponseBody
    public List<Banner>  verUsuarios(){
       return bannerServ.verBanner();
    }
    
    @DeleteMapping("/banner/delete/{id}")
    public void borrarBanner(@PathVariable  Long id){
        bannerServ.borrarBanner(id);
    }
    
    @PutMapping("/banner/editar/")
    public void editarBanner(@RequestBody Banner ban ){
        bannerServ.editarBanner(ban); //Aseguramos que el objeto tenga el ID correcto
        
    }
}
