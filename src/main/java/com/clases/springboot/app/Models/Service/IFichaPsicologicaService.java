package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import com.clases.springboot.app.Models.Entity.FichaPsicologica;

public interface IFichaPsicologicaService {
    
    public List<FichaPsicologica> findAll();

    public FichaPsicologica findById(Long id);

    public FichaPsicologica save (FichaPsicologica fichaPsicologica);

     public Optional<FichaPsicologica> get(Long id); //Obtener una ficha 
}
