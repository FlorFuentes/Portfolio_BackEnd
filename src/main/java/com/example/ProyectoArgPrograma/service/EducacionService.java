package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Educacion;
import com.example.ProyectoArgPrograma.repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository eduRepo;
    
    @Override
    public List<Educacion> verEducacion() {
       return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }
    

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public void editarEducacion(Educacion edu) {
        
        Optional <Educacion> eddu = eduRepo.findById(edu.getId());
        
        if(eddu.isPresent()){
            Educacion eedu=eddu.get();
            eedu.setDescripcion(edu.getDescripcion());
            eedu.setImgDiploma(edu.getImgDiploma());
            eedu.setInstitucion(edu.getInstitucion());
            eduRepo.save(eedu);
        }else{
            throw new RuntimeException("Educacion not found for id : " + edu.getId());
        }
    }
}
