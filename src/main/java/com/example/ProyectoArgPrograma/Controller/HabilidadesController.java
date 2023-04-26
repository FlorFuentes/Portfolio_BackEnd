package com.example.ProyectoArgPrograma.Controller;

import com.example.ProyectoArgPrograma.model.Habilidades;
import com.example.ProyectoArgPrograma.service.IHabilidadesService;
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
public class HabilidadesController {
    
    @Autowired
    private IHabilidadesService habiServ;
    
    @PostMapping("/habilidades/new")
    public void agregarHabilidades( @RequestBody Habilidades habi){
        habiServ.editarHabilidades(habi);
    }
    
    @GetMapping ("/habilidades/ver")
    @ResponseBody
    public List<Habilidades> verHabilidades(){
        return habiServ.verHabilidades();
    }
    
    @DeleteMapping("/habilidades/delete/{id}")
    public void borrarHabilidades(@PathVariable Long id){
        habiServ.borrarHabilidades(id);
    }
   
    @PutMapping("/habilidades/editar/")
    public void editarHabilidades(@RequestBody Habilidades habi){
        habiServ.editarHabilidades(habi);
    }
}
