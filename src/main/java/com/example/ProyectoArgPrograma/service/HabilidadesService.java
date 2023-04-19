package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Habilidades;
import com.example.ProyectoArgPrograma.repository.HabilidadesRepository;
import java.util.List;
import java.util.Optional;
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
        
        Optional <Habilidades> hab = habiRepo.findById(habi.getId());
        
        if(hab.isPresent()){
            Habilidades haab = hab.get();
            haab.setNombre(habi.getNombre());
            haab.setPorcentaje(habi.getPorcentaje());
            habiRepo.save(habi);
        }else{
            throw new RuntimeException("Habilidades not found for id : " + habi.getId());
        }
    }
    
}
