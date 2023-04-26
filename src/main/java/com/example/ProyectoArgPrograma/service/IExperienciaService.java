package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    
    public void crearExperiencia (Experiencia expe);
    
    public void borrarExperiencia(Long id);
    
    public void editarExperiencia(Experiencia expe);
    
}
