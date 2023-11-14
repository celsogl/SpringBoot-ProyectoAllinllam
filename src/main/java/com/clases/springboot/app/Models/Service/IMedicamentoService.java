package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import com.clases.springboot.app.Models.Entity.Medicamento;

public interface IMedicamentoService {
    
    public List<Medicamento> findAll();

    public Medicamento findById(Long id);

    public Medicamento save (Medicamento medicamento);

    public Optional<Medicamento> get(Long id); //Obtener un medicamento 
}
