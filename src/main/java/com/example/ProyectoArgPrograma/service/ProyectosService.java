package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Proyectos;
import com.example.ProyectoArgPrograma.repository.ProyectosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{
    
    @Autowired
    public ProyectosRepository proRepo;

    @Override
    public List<Proyectos> verProyectos() {
        return proRepo.findAll();
    }

    @Override
    public void crearProyectos(Proyectos pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProyectos(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public void editarProyectos(Proyectos pro) {
       
        Optional <Proyectos> proo =proRepo.findById(pro.getId());
        
        if(proo.isPresent()){
            Proyectos prro = proo.get();
            prro.setDescripcion(pro.getDescripcion());
            prro.setLink(pro.getLink());
            prro.setTitulo(pro.getTitulo());
            proRepo.save(prro);
        }else{
            throw new RuntimeException("Proyectos not found for id : " + pro.getId());
        }
    }
    
}
