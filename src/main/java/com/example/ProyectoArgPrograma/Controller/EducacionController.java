package com.example.ProyectoArgPrograma.Controller;

import com.example.ProyectoArgPrograma.model.Educacion;
import com.example.ProyectoArgPrograma.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducacionController {
    
    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping("educacion/new")
    public void agregarEducacion(@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping ("educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacion(){
     return eduServ.verEducacion();
    }
    
    @DeleteMapping("educacion/delete/{id}")
    public void borrarEducacion(@PathVariable long id){
        eduServ.borrarEducacion(id);
    }
    
    @PutMapping ("educacion/editar/{id}")
    public void editarEducacion(@RequestBody Educacion edu){
        eduServ.editarEducacion(edu);
    }
    
    
    
    
    
    
    
    
    
}
