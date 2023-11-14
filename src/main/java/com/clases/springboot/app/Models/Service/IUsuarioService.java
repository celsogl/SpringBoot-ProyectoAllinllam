package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import com.clases.springboot.app.Models.DTO.UsuarioRegistroDTO;
import com.clases.springboot.app.Models.Entity.Usuario;

public interface IUsuarioService {
    
    public Usuario save(UsuarioRegistroDTO registroDTO);

    public List<Usuario> findAll();

   // public void deleteById(Long id);

	Optional<Usuario> findById(Long id);

	Usuario findByUsername(String username);
}
