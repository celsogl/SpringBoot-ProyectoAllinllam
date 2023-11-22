package com.clases.springboot.app.Models.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clases.springboot.app.Models.Entity.Usuario;
import java.util.Optional;


public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
    
    Optional<Usuario> findByUsername(String username);
}
