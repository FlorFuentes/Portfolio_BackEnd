package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Experiencia;
import com.example.ProyectoArgPrograma.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public ExperienciaRepository expeRepo;
    
    @Override
    public List<Experiencia> verExperiencia() {
        return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
       expeRepo.deleteById(id);
    }

    @Override
    public void editarExperiencia(Experiencia expe) {
       expeRepo.save(expe)   ;
    }
   
    
}
