package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import com.clases.springboot.app.Models.Entity.Paciente;

public interface IPacienteService {
    
    public List<Paciente> findAll();

    public Paciente findById(Long id);

    public Paciente save (Paciente paciente);

    public Optional<Paciente> get(Long id); //Obtener un Paciente 
}
