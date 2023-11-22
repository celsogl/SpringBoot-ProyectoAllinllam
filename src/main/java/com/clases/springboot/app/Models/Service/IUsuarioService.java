package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import com.clases.springboot.app.Models.Entity.Usuario;


public interface IUsuarioService {

    public List<Usuario> findAll();

    public Usuario findById(Long id);

    public Usuario save (Usuario paciente);

    public Optional<Usuario> get(Long id); //Obtener un Paciente 
}
