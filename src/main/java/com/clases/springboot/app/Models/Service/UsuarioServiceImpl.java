package com.clases.springboot.app.Models.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clases.springboot.app.Models.Dao.IRolDao;
import com.clases.springboot.app.Models.Dao.IUsuarioDao;
import com.clases.springboot.app.Models.Entity.Usuario;
import com.clases.springboot.app.Models.Entity.UsuarioRol;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

   // @Autowired
    //private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private IUsuarioDao usuarioDao;

    @Autowired
    private IRolDao rolDao;

   
   
    @Override
    @Transactional
        public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
           
            Usuario usuarioLocal = usuarioDao.findByUsuario(usuario.getUsuario());
            if(usuarioLocal!=null){
                System.out.println("El usuario ya existe");
                throw new Exception("El usuario ya esta presente");
            }
            else{
                for(UsuarioRol usuarioRol:usuarioRoles){
                    rolDao.save(usuarioRol.getRol());
                }
                usuario.getUsuarioRoles().addAll(usuarioRoles);
                usuarioLocal = usuarioDao.save(usuario);
            }
            return usuarioLocal;
        }

   
    @Override
     @Transactional(readOnly = true)
    public List<Usuario> findAll() {
      return(List<Usuario>)usuarioDao.findAll();
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Usuario> findById(Long id) {
        return usuarioDao.findById(id);
    }

    
    @Override
    @Transactional(readOnly = true)
    public Usuario findByUsername(String username) {
        return usuarioDao.findByUsuario(username);
    }


    @Override
    @Transactional
    public void deleteById(Long id) {
       usuarioDao.deleteById(id);
    }


    
    
}
