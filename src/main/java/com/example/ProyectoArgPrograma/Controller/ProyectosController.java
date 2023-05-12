package com.example.ProyectoArgPrograma.Controller;

import com.example.ProyectoArgPrograma.model.Proyectos;
import com.example.ProyectoArgPrograma.service.IProyectosService;
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
public class ProyectosController {
    
    @Autowired
    private IProyectosService proServ;
    
    
    @PostMapping ("proyectos/new")
    public void agregarProyectos (@RequestBody Proyectos pro){
        proServ.crearProyectos(pro);
    }
    
    @GetMapping ("proyectos/ver")
    @ResponseBody
    public List<Proyectos> verProyectos(){
        return proServ.verProyectos();
    }
    
    
    @DeleteMapping ("proyectos/delete/{id}")
    public void borrarProyectos (@PathVariable Long id){
        proServ.borrarProyectos(id);
    }
    
    @PutMapping ("proyectos/editar/")
    public void editarProyectos (@RequestBody Proyectos pro){
        proServ.editarProyectos(pro);
    }
}
