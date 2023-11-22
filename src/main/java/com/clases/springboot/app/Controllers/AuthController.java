package com.clases.springboot.app.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clases.springboot.app.Models.Entity.JwtRequest;
import com.clases.springboot.app.Models.Entity.JwtResponse;
import com.clases.springboot.app.Models.Entity.RegisterRequest;
import com.clases.springboot.app.Models.Service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins={"http://localhost:4200"})
@RequiredArgsConstructor
public class AuthController {
    
    private final AuthService authService;

    @PostMapping(value = "login")
    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request){
       return ResponseEntity.ok(authService.login(request));
    }
    
    @PostMapping(value = "signup")
    public ResponseEntity<JwtResponse> registro(@RequestBody RegisterRequest request ){
        return ResponseEntity.ok(authService.registro(request));
    }
}
