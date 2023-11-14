package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clases.springboot.app.Models.Dao.IMedicamentoDao;
import com.clases.springboot.app.Models.Entity.Medicamento;

@Service
public class MedicamentoServiceImpl implements IMedicamentoService {

    @Autowired
    private IMedicamentoDao medicamentoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Medicamento> findAll() {
       return (List<Medicamento>)medicamentoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Medicamento findById(Long id) {
       return medicamentoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Medicamento save(Medicamento medicamento) {
       return medicamentoDao.save(medicamento);
    }

    @Override
    public Optional<Medicamento> get(Long id) {
       return medicamentoDao.findById(id);
    }
    
}
