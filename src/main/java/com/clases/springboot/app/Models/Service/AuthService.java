package com.clases.springboot.app.Models.Service;

import java.util.Date;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.clases.springboot.app.Models.Dao.IUsuarioDao;
import com.clases.springboot.app.Models.Entity.JwtRequest;
import com.clases.springboot.app.Models.Entity.JwtResponse;
import com.clases.springboot.app.Models.Entity.RegisterRequest;
import com.clases.springboot.app.Models.Entity.Role;
import com.clases.springboot.app.Models.Entity.Usuario;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class AuthService {

    private final IUsuarioDao usuarioDao;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public JwtResponse login(JwtRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsuario(), request.getPass()));
        UserDetails user = usuarioDao.findByUsername(request.getUsuario()).orElseThrow();
        String token = jwtService.getToken(user);
        return JwtResponse.builder().token(token).build();
    }

    public JwtResponse registro(RegisterRequest request) {
        Usuario usuario = Usuario.builder()
        .username(request.getUsuario())
        .pass(passwordEncoder.encode(request.getPass()))
        .fecharegistro(new Date())
        .role(Role.USER)
        .build();

        usuarioDao.save(usuario);

        return JwtResponse.builder().token(jwtService.getToken(usuario)).build();
    }



    
}
