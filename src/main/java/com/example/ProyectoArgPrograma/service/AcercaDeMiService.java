package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.AcercaDeMi;
import com.example.ProyectoArgPrograma.repository.AcercaDeMiRepository;
import java.util.List;
import java.util.Optional;
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
    public void editarAcercaDeMi (AcercaDeMi acerca) {
       
        Optional <AcercaDeMi> acerDeMi = acercaRepo.findById(acerca.getId());
        
        if(acerDeMi.isPresent()){
            AcercaDeMi acerrca = acerDeMi.get();
            acerrca.setFotoPerfil(acerca.getFotoPerfil());
            acerrca.setSobreMi(acerca.getSobreMi());
            acercaRepo.save(acerrca);
        } else {
            throw new RuntimeException("AcercaDeMi not found for id : " + acerca.getId());
        }
    }   
    
}
