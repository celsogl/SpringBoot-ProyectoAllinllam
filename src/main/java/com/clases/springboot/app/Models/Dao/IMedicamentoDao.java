package com.clases.springboot.app.Models.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clases.springboot.app.Models.Entity.Medicamento;

public interface IMedicamentoDao extends JpaRepository<Medicamento,Long>{
    
}
