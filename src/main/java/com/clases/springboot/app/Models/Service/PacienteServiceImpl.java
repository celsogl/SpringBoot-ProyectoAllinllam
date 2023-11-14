package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clases.springboot.app.Models.Dao.IPacienteDao;
import com.clases.springboot.app.Models.Entity.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService {

    @Autowired
    private IPacienteDao pacienteDao;


    @Override
    @Transactional(readOnly = true)
    public List<Paciente> findAll() {
       return (List<Paciente>)pacienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Paciente findById(Long id) {
       return pacienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Paciente save(Paciente paciente) {
        return pacienteDao.save(paciente);
    }

    @Override
    public Optional<Paciente> get(Long id) {
       return pacienteDao.findById(id);
    }
    
}
