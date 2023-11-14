package com.clases.springboot.app.Models.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clases.springboot.app.Models.Entity.Medico;

public interface IMedicoDao extends JpaRepository<Medico,Long>{
    
}
