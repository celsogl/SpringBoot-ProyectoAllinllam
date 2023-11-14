package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clases.springboot.app.Models.Dao.IFichaTerapeuticaDao;
import com.clases.springboot.app.Models.Entity.FichaTerapeutica;

@Service
public class FichaTerapeuticaServiceImpl implements IFichaTerapeuticaService {

    @Autowired
    private IFichaTerapeuticaDao fichaTerapeuticaDao;


    @Override
    @Transactional(readOnly = true)
    public List<FichaTerapeutica> findAll() {
       return (List<FichaTerapeutica>)fichaTerapeuticaDao.findAll();
    }

    @Override
    public FichaTerapeutica findById(Long id) {
       return fichaTerapeuticaDao.findById(id).orElse(null);
    }

    @Override
    public FichaTerapeutica save(FichaTerapeutica fichaTerapeutica) {
     return fichaTerapeuticaDao.save(fichaTerapeutica);
    }

    @Override
    public Optional<FichaTerapeutica> get(Long id) {
        return fichaTerapeuticaDao.findById(id);
    }
    
}
