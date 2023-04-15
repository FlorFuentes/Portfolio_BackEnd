package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.AcercaDeMi;
import com.example.ProyectoArgPrograma.repository.AcercaDeMiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeMiService implements IAcercaDeMiService{
    
    @Autowired
    public AcercaDeMiRepository acercaRepo;

    @Override
    public List<AcercaDeMi> verAcercaDeMi() {
        return acercaRepo.findAll();
    }

    @Override
    public void crearAcercaDeMi(AcercaDeMi acerca) {
       acercaRepo.save(acerca);
    }

    @Override
    public void borrarAcercaDeMi(Long id) {
       acercaRepo.deleteById(id);
    }

    @Override
    public void editarAcercaDeMi(AcercaDeMi acerca) {
        acercaRepo.save(acerca);
    }
    
    
}
