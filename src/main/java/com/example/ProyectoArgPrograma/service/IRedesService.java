package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Redes;
import java.util.List;


public interface IRedesService {
    
    public List<Redes> verRedes();
    
    public void crearRedes(Redes red);
    
    public void borrarRedes(Long id);
    
    public void editarRedes(Redes red);
    
}
