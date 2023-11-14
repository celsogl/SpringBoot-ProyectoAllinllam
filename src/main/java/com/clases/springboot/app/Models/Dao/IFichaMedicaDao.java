package com.clases.springboot.app.Models.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clases.springboot.app.Models.Entity.FichaMedica;

public interface IFichaMedicaDao extends JpaRepository<FichaMedica,Long> {
    
}
