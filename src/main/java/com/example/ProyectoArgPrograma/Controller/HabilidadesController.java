package com.example.ProyectoArgPrograma.Controller;

import com.example.ProyectoArgPrograma.model.Habilidades;
import com.example.ProyectoArgPrograma.service.IHabilidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabilidadesController {
    
    @Autowired
    private IHabilidadesService habiServ;
    
     @PostMapping("habilidades/new")
    public void agregarHabilidades( @RequestBody Habilidades habi){
        habiServ.editarHabilidades(habi);
    }
}
