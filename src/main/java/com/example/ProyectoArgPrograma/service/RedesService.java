package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Redes;
import com.example.ProyectoArgPrograma.repository.RedesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedesService implements IRedesService{
    
    @Autowired
    public RedesRepository redRepo;

    @Override
    public List<Redes> verRedes() {
        return redRepo.findAll();
    }

    @Override
    public void crearRedes(Redes red) {
       redRepo.save(red);
    }

    @Override
    public void borrarRedes(Long id) {
        redRepo.deleteById(id);
    }

    @Override
    public void editarRedes(Redes red) {
        
        Optional <Redes> rede=redRepo.findById(red.getId());
        
        if(rede.isPresent()){
            Redes reed = rede.get();
            reed.setLink(red.getLink());
            reed.setNombre(red.getNombre());
            redRepo.save(reed);                
        }else{
            throw new RuntimeException("Redes not found for id : " + red.getId());
        }
    }
    
}
