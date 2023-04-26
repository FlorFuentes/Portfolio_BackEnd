package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Usuario;
import com.example.ProyectoArgPrograma.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
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

    @Override
    public void editarUsuario(Usuario Usu) {
        
        Optional <Usuario> usuu = usuRepo.findById(Usu.getId());
        
        if(usuu.isPresent()){
            Usuario uusu = usuu.get();
            uusu.setEmail(Usu.getEmail());
            uusu.setNombre(Usu.getNombre());
            uusu.setPassword(Usu.getPassword());
            usuRepo.save(uusu);                        
        }else{
            throw new RuntimeException("Usuario not found for id : " + Usu.getId());
        }
    }
    
}
