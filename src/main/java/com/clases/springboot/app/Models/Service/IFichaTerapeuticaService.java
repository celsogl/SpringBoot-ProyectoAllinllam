package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import com.clases.springboot.app.Models.Entity.FichaTerapeutica;

public interface IFichaTerapeuticaService {
    
    public List<FichaTerapeutica> findAll();

    public FichaTerapeutica findById(Long id);

    public FichaTerapeutica save (FichaTerapeutica fichaTerapeutica);

    public Optional<FichaTerapeutica> get(Long id); //Obtener una ficha 
}
