package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Redes;
import com.example.ProyectoArgPrograma.repository.RedesRepository;
import java.util.List;
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
        redRepo.save(red);
    }
    
}
