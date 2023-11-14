package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clases.springboot.app.Models.Dao.IFichaMedicaDao;
import com.clases.springboot.app.Models.Entity.FichaMedica;

@Service
public class FichaMedicaServiceImpl implements IFichasMedicaService{

    @Autowired
    private IFichaMedicaDao fichaMedicaDao;

    @Override
    @Transactional(readOnly = true)
    public List<FichaMedica> findAll() {
      return (List<FichaMedica>)fichaMedicaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public FichaMedica findById(Long id) {
      return fichaMedicaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public FichaMedica save(FichaMedica fichaMedica) {
        return fichaMedicaDao.save(fichaMedica);
    }

    @Override
    public Optional<FichaMedica> get(Long id) {
        return fichaMedicaDao.findById(id);
    }
    
}
