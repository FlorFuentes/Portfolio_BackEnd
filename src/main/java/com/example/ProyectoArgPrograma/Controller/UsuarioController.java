//Tiene cada una de las api que va a recibir nuestras solicitudes. Estamos creando una API y hay que mapearla
package com.example.ProyectoArgPrograma.Controller;

import com.example.ProyectoArgPrograma.model.Usuario;
import com.example.ProyectoArgPrograma.service.IUsuarioService;
//import java.util.ArrayList;
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
public class UsuarioController {
    
    @Autowired
    private IUsuarioService usuarioServ;
    
    @PostMapping("/new/usuario")
    public void agregarUsuario( @RequestBody Usuario Usu){
        usuarioServ.crearUsuario(Usu);
    }
    
    @GetMapping ("/ver/usuarios")
    @ResponseBody
    public List<Usuario>  verUsuarios(){
       return usuarioServ.verUsuario();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarUsuario(@PathVariable  Long id){
        usuarioServ.borrarUsuario(id);
    }
    
    //@PutMapping("/editar/{id}")
    //public void editarUsuario(@PathVariable  Long id){
        //usuarioServ.editarUsuario(id);
    //}
    
    
    //CHATGPT
    @PutMapping("/editar/{id}")
    public void editarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioActualizado){
        usuarioActualizado.setId(id); //Aseguramos que el objeto tenga el ID correcto
        usuarioServ.editarUsuario(usuarioActualizado);
    }
}
