package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import com.clases.springboot.app.Models.Entity.Medico;

public interface IMedicoService {
    
    public List<Medico> findAll();

    public Medico findById(Long id);

    public Medico save (Medico medico);

    public Optional<Medico> get(Long id); //Obtener un Medico 
}
