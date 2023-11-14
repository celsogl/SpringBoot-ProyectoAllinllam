package com.clases.springboot.app.Models.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clases.springboot.app.Models.Entity.FichaPsicologica;

public interface IFichaPsicologicaDao extends JpaRepository<FichaPsicologica,Long> {
    
}
