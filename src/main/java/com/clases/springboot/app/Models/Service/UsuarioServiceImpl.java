package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.clases.springboot.app.Models.DTO.UsuarioRegistroDTO;
import com.clases.springboot.app.Models.Dao.IUsuarioDao;
import com.clases.springboot.app.Models.Entity.Usuario;

public class UsuarioServiceImpl implements IUsuarioService {

   // @Autowired
    //private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private IUsuarioDao usuarioDao;



    @Override
    public Usuario save(UsuarioRegistroDTO registroDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public List<Usuario> findAll() {
      return(List<Usuario>)usuarioDao.findAll();
    }


    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioDao.findById(id);
    }

    @Override
    public Usuario findByUsername(String username) {
        return usuarioDao.findByUsuario(username);
    }
    
}
