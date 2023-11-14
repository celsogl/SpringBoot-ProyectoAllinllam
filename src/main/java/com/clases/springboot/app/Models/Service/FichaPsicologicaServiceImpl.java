package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clases.springboot.app.Models.Dao.IFichaPsicologicaDao;
import com.clases.springboot.app.Models.Entity.FichaPsicologica;

@Service
public class FichaPsicologicaServiceImpl implements IFichaPsicologicaService {

    @Autowired
    private IFichaPsicologicaDao fichaPsicologicaDao;

    @Override
    @Transactional(readOnly = true)
    public List<FichaPsicologica> findAll() {
       return (List<FichaPsicologica>)fichaPsicologicaDao.findAll();
    }


    @Transactional(readOnly = true)
    @Override
    public FichaPsicologica findById(Long id) {
       return fichaPsicologicaDao.findById(id).orElse(null);
    }

    @Override
    public FichaPsicologica save(FichaPsicologica fichaPsicologica) {
       return fichaPsicologicaDao.save(fichaPsicologica);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<FichaPsicologica> get(Long id) {
        
        return fichaPsicologicaDao.findById(id);
    }
    
}
