package com.clases.springboot.app.Models.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clases.springboot.app.Models.Entity.TipodeSangre;

public interface ITipodeSangreDao extends JpaRepository<TipodeSangre,Long>{
    
}
