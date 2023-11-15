package com.clases.springboot.app.Controllers;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clases.springboot.app.Models.Entity.Rol;
import com.clases.springboot.app.Models.Entity.Usuario;
import com.clases.springboot.app.Models.Entity.UsuarioRol;
import com.clases.springboot.app.Models.Service.IUsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("/")
    public Usuario saveUsuario (@RequestBody Usuario usuario) throws Exception{
        
        Set<UsuarioRol> roles = new HashSet<>();

        Date fechaRegistro = new Date();
        usuario.setFecharegistro(fechaRegistro);
        
        
        Rol rol = new Rol();
        rol.setId(2L);
        rol.setNombre("ROLE_USER");
        
        
        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);

        return usuarioService.guardarUsuario(usuario, roles);
    }

    @GetMapping("/{username}")
    public Usuario obtenerUsuario(@PathVariable("username") String username){
        return usuarioService.findByUsername(username);
    }

}