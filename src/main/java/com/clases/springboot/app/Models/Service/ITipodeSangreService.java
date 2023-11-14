package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import com.clases.springboot.app.Models.Entity.TipodeSangre;

public interface ITipodeSangreService {
    
    public List<TipodeSangre> findAll();

    public TipodeSangre findById(Long id);

    public TipodeSangre save (TipodeSangre tipodeSangre);

    public Optional<TipodeSangre> get(Long id); //Obtener un TipodeSangre 
}
