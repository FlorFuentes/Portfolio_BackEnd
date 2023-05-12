package com.example.ProyectoArgPrograma.Controller;

import com.example.ProyectoArgPrograma.model.Experiencia;
import com.example.ProyectoArgPrograma.service.IExperienciaService;
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
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expeServ;
    
    @PostMapping("/experiencia/new")
    public void agregarExperiencia( @RequestBody Experiencia expe){
        expeServ.crearExperiencia(expe);
    }
    
    @GetMapping("/experiencia/ver")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
    return expeServ.verExperiencia();
    }
    
    @DeleteMapping("/experiencia/delete/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expeServ.borrarExperiencia(id);
    }
    
    @PutMapping("/experiencia/editar/")
    public void editarExperiencia(@RequestBody Experiencia expe){
        expeServ.editarExperiencia(expe);
    }
}

