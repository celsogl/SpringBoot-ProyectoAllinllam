package com.clases.springboot.app.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.clases.springboot.app.Models.Entity.Usuario;
import com.clases.springboot.app.Models.Service.IUsuarioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/v1/user")
@CrossOrigin(origins={"http://localhost:4200"})
@RequiredArgsConstructor
public class UsuarioController {
    
   private final IUsuarioService usuarioService;

 @GetMapping(value = "{id}")
 public ResponseEntity<Usuario> getUser(@PathVariable Long id){
    
   Usuario usuario = usuarioService.findById(id);

   if(usuario==null){
      return ResponseEntity.notFound().build();
   }
   return ResponseEntity.ok(usuario);

 }


}
