package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.clases.springboot.app.Models.Entity.Usuario;
import com.clases.springboot.app.Models.Entity.UsuarioRol;

public interface IUsuarioService {
    
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public List<Usuario> findAll();

   // public void deleteById(Long id);

	Optional<Usuario> findById(Long id);

	Usuario findByUsername(String username);
}
