package com.clases.springboot.app.Models.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest {
    
    String usuario;
    String pass;
    
    

    
}
