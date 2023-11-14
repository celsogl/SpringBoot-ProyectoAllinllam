package com.clases.springboot.app.Models.Entity;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario", length = 255)
    private String usuario;

    @Column(name = "contraseña", length = 255)
    private String contraseña;

    @Column(name = "FechaRegistro")
    private Date fecharegistro;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id"))
    private Collection<Rol> roles;

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

    public Collection<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Rol> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", usuario=" + usuario + ", contraseña=" + contraseña + ", fecharegistro="
                + fecharegistro + ", roles=" + roles + "]";
    }

    public Usuario() {
        super();
    }

    public Usuario(Long id, String usuario, String contraseña, Date fecharegistro, Collection<Rol> roles) {
        super();
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fecharegistro = fecharegistro;
        this.roles = roles;
    }

    public Usuario(String usuario, String contraseña, Date fecharegistro, Collection<Rol> roles) {
        super();
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fecharegistro = fecharegistro;
        this.roles = roles;
    }

}
