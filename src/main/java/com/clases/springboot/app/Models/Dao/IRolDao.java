package com.clases.springboot.app.Models.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clases.springboot.app.Models.Entity.Rol;

public interface IRolDao extends JpaRepository<Rol,Long> {

    
    
}
