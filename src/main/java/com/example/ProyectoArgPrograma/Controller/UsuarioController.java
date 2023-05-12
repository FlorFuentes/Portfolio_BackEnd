//Tiene cada una de las api que va a recibir nuestras solicitudes. Estamos creando una API y hay que mapearla
package com.example.ProyectoArgPrograma.Controller;

import com.example.ProyectoArgPrograma.model.Usuario;
import com.example.ProyectoArgPrograma.service.IUsuarioService;
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
public class UsuarioController {
    
    @Autowired
    private IUsuarioService usuarioServ;
    
    @PostMapping("/usuario/new")
    public void agregarUsuario( @RequestBody Usuario Usu){
        usuarioServ.crearUsuario(Usu);
    }
    
    @GetMapping ("/usuarios/ver")
    @ResponseBody
    public List<Usuario>  verUsuarios(){
       return usuarioServ.verUsuario();
    }
    
    @DeleteMapping("/usuario/delete/{id}")
    public void borrarUsuario(@PathVariable  Long id){
        usuarioServ.borrarUsuario(id);
    }
    
    
    @PutMapping("/usuario/editar/")
    public void editarUsuario(@RequestBody Usuario Usu ){
        usuarioServ.editarUsuario(Usu); 
        
    }
}
