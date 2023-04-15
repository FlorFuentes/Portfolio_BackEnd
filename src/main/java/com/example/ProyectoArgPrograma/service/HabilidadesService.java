package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Habilidades;
import com.example.ProyectoArgPrograma.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService{
    
    @Autowired
    public HabilidadesRepository habiRepo;

    @Override
    public List<Habilidades> verHabilidades() {
       return habiRepo.findAll();
    }

    @Override
    public void crearHabilidades(Habilidades habi) {
       habiRepo.save(habi);
    }

    @Override
    public void borrarHabilidades(Long id) {
        habiRepo.deleteById(id);
    }

    @Override
    public void editarHabilidades(Habilidades habi) {
        habiRepo.save(habi);
    }
    
}
