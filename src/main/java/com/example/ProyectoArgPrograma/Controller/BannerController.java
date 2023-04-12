package com.example.ProyectoArgPrograma.Controller;

import com.example.ProyectoArgPrograma.model.Usuario;
import com.example.ProyectoArgPrograma.service.BannerService;
import com.example.ProyectoArgPrograma.service.IBannerService;
import com.example.ProyectoArgPrograma.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BannerController {
    
    @Autowired
    private IBannerService bannerServ;
    
    //Creamos el banner
    @PostMapping ("/new/banner")
    public void agregarBanner( @RequestBody Banner bann){
        bannerServ.crearBanner(bann);
    }
    
    //Vemos el banner
    @GetMapping ("/ver/banner")
    @ResponseBody
    public List<Banner>  verBanner(){
       return bannerServ.verBanner();
    }
    
    //Eliminamos
    @DeleteMapping("/delete/{id}")
    public void borrarBanner(@PathVariable  Long id){
        bannerServ.borrarBanner(id);
    }
    
    //Editamos
    @PutMapping("/editar/{id}")
    public void editarBanner(@PathVariable Long id, @RequestBody Banner bannerActualizado){
        bannerServ.editarBanner(id);//Aseguramos que el objeto tenga el ID correcto
       
        
        //Si no anda asi,hay que poner el actualizado
        //bannerServ.editarBanner(bannerActualizado);
    }
    
    
    
}
