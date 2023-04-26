package com.example.ProyectoArgPrograma.Controller;

import com.example.ProyectoArgPrograma.model.Redes;
import com.example.ProyectoArgPrograma.service.IRedesService;
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
@CrossOrigin(origins = "http://localhost:4200/")
public class RedesController {
    
    @Autowired
    private IRedesService redeServ;
    
    @PostMapping("/redes/new")
    public void agregarRedes(@RequestBody Redes red){
        redeServ.crearRedes(red);
    }
    
    @GetMapping("/redes/ver")
    @ResponseBody
    public List<Redes> verRedes(){
       return redeServ.verRedes();
    }
    
    @DeleteMapping("/redes/delete/{id}")
    public void borrarRedes(@PathVariable Long id){
        redeServ.borrarRedes(id);
    }
    
    @PutMapping("/redes/editar/")
    public void editarRedes(@RequestBody Redes red){
        redeServ.editarRedes(red);
    }
    
    
    
}
