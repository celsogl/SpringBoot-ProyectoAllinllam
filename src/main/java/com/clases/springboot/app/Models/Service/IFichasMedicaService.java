package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;
import com.clases.springboot.app.Models.Entity.FichaMedica;

public interface IFichasMedicaService {
    
    public List<FichaMedica> findAll();

    public FichaMedica findById(Long id);

    public FichaMedica save (FichaMedica fichaMedica);

    public Optional<FichaMedica> get(Long id); //Obtener una ficha medica

}
