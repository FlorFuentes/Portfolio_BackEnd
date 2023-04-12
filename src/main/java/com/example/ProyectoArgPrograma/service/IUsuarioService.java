
package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    public List<Usuario> verUsuario();
    public void crearUsuario(Usuario Usu);
    public void borrarUsuario(Long id);
    //public void editarUsuario(Long id);

    void editarUsuario(Usuario usuarioActualizado);
    
}
