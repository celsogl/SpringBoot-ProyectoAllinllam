package com.clases.springboot.app.Models.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clases.springboot.app.Models.Entity.Usuario;
import java.util.Optional;


public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
    
    public Usuario findByUsuario(String user);

    Optional<Usuario> findByusuario(String usuario);
}
