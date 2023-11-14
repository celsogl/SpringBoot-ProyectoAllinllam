package com.clases.springboot.app.Models.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clases.springboot.app.Models.Entity.FichaTerapeutica;

public interface IFichaTerapeuticaDao extends JpaRepository <FichaTerapeutica, Long> {
    
}
