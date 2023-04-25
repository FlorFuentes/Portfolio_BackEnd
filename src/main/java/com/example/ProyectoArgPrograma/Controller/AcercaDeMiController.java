package com.example.ProyectoArgPrograma.Controller;


import com.example.ProyectoArgPrograma.model.AcercaDeMi;
import com.example.ProyectoArgPrograma.service.IAcercaDeMiService;
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
public class AcercaDeMiController {
    
    @Autowired
    private IAcercaDeMiService acercaServ;
    
    @PostMapping("/acercaDeMi/new")
    public void agregarAcercaDeMi( @RequestBody AcercaDeMi acerca){
        acercaServ.crearAcercaDeMi(acerca);
    }
    
    @GetMapping ("/acercaDeMi/ver")
    @ResponseBody
    public List<AcercaDeMi>  verAcercaDeMi(){
       return acercaServ.verAcercaDeMi();
    }
    
    @DeleteMapping("/acercaDeMi/delete/{id}")
    public void borrarAcercaDeMi(@PathVariable  Long id){
        acercaServ.borrarAcercaDeMi(id);
    }
    
    @PutMapping("/acercaDeMi/editar")
    public void editarAcercaDeMi(@RequestBody AcercaDeMi acerca ){
        acercaServ.editarAcercaDeMi(acerca); //Aseguramos que el objeto tenga el ID correcto
        
    }
}
