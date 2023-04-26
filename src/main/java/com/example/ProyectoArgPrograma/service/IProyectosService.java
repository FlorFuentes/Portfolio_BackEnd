package com.example.ProyectoArgPrograma.service;

import com.example.ProyectoArgPrograma.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public List<Proyectos> verProyectos();
    
    public void crearProyectos(Proyectos pro);
    
    public void borrarProyectos(Long id);
    
    public void editarProyectos(Proyectos pro);
    
}
