
package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Usuario;
import com.example.ProyectoArgPrograma.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    public UsuarioRepository usuRepo;
    
    @Override
    public List<Usuario> verUsuario() {
        return usuRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario Usu) {
       usuRepo.save(Usu);
    }

    @Override
    public void borrarUsuario(Long id) {
       usuRepo.deleteById(id);
    }

    //@Override
    //public void editarUsuario(Long id) {
        // usuRepo.findById(id).orElse(null);
    //}
    
    //CHATGPT
    @Override
    public void editarUsuario(Usuario usuarioActualizado) {
        usuRepo.save(usuarioActualizado);
    }
    
}
