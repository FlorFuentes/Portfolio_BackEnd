package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Experiencia;
import com.example.ProyectoArgPrograma.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
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
      
        Optional <Experiencia> exp = expeRepo.findById(expe.getId());
        
        if(exp.isPresent()){
            Experiencia eexp = exp.get();
            eexp.setDescripcion(expe.getDescripcion());
            eexp.setFecha(expe.getFecha());
            eexp.setPuesto(expe.getPuesto());
            expeRepo.save(eexp);
        }else{
            throw new RuntimeException("Experiencia not found for id : " + expe.getId());
        }
    }
   
    
}
