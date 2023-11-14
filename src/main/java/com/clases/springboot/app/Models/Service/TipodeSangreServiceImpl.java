package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clases.springboot.app.Models.Dao.ITipodeSangreDao;
import com.clases.springboot.app.Models.Entity.TipodeSangre;

@Service
public class TipodeSangreServiceImpl implements ITipodeSangreService {

    @Autowired
    private ITipodeSangreDao tipodeSangreDao;

    @Override
    @Transactional(readOnly = true)
    public List<TipodeSangre> findAll() {
       return (List<TipodeSangre>)tipodeSangreDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipodeSangre findById(Long id) {
        return tipodeSangreDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public TipodeSangre save(TipodeSangre tipodeSangre) {
        return tipodeSangreDao.save(tipodeSangre);
    }

    @Override
    public Optional<TipodeSangre> get(Long id) {
     return tipodeSangreDao.findById(id);
    }
    
}
