package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.AcercaDeMi;
import java.util.List;


public interface IAcercaDeMiService {
    
    public List<AcercaDeMi> verAcercaDeMi();
    public void crearAcercaDeMi(AcercaDeMi acerca);
    public void borrarAcercaDeMi(Long id);
    public void editarAcercaDeMi(AcercaDeMi acerca);
}
