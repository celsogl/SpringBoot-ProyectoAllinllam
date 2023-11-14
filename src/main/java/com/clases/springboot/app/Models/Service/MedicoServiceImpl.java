package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clases.springboot.app.Models.Dao.IMedicoDao;
import com.clases.springboot.app.Models.Entity.Medico;

@Service
public class MedicoServiceImpl implements IMedicoService {

    @Autowired
    private IMedicoDao medicoDao;


    @Override
    @Transactional(readOnly = true)
    public List<Medico> findAll() {
        return (List<Medico>)medicoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Medico findById(Long id) {
       return medicoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Medico save(Medico medico) {
        return medicoDao.save(medico);
    }

    @Override
    public Optional<Medico> get(Long id) {
     return medicoDao.findById(id);
    }
    
}
