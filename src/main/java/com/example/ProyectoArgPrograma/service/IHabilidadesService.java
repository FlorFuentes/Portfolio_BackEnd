package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Habilidades;
import java.util.List;


public interface IHabilidadesService {
    
    public List<Habilidades> verHabilidades();
    public void crearHabilidades(Habilidades habi);
    public void borrarHabilidades(Long id);
    public void editarHabilidades(Habilidades habi);
}
