package com.clases.springboot.app.Models.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clases.springboot.app.Models.Entity.Paciente;

public interface IPacienteDao extends JpaRepository<Paciente,Long>{
    
}
