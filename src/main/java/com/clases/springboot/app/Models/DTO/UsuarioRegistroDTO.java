package com.clases.springboot.app.Models.DTO;

import java.util.Date;

public class UsuarioRegistroDTO {
    private Long id;
	private String usuario;
	private String contraseña;
	private Date fecharegistro;
	


	public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getContraseña() {
        return contraseña;
    }


    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public Date getFecharegistro() {
        return fecharegistro;
    }


    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }





    

    public UsuarioRegistroDTO(Long id, String usuario, String contraseña, Date fecharegistro) {
        super();
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fecharegistro = fecharegistro;
    }





	public UsuarioRegistroDTO(String usuario, String contraseña, Date fecharegistro) {
        super();
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fecharegistro = fecharegistro;
    }


    


	public UsuarioRegistroDTO(String usuario) {
        super();
        this.usuario = usuario;
    }


	public UsuarioRegistroDTO() {
		super();
	}
}
