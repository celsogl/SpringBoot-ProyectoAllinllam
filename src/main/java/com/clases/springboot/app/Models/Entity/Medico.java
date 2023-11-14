package com.clases.springboot.app.Models.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "medico")
public class Medico {

    @Id
    @Column(name = "DocumentoIdentidad")
    private Long dni;

    @Column(name = "Nombre", length = 255)
    private String nombre;

    @Column(name = "ApellidoPate", length = 255)
    private String apellidoPate;

    @Column(name = "ApellidoMate", length = 255)
    private String apellidoMate;

    @Column(name = "Edad")
    private int edad;

    @Column(name = "FechaNacimiento")
    private Date fechaNacimiento;

    @Column(name = "Genero", length = 255)
    private String genero;

    @Column(name = "Especialidad", length = 255)
    private String especialidad;

    @Column(name = "Direccion", length = 255)
    private String direccion;

    @Column(name = "Telefono", length = 255)
    private String telefono;

    @Column(name = "CorreoElectronico", length = 255)
    private String email;

    @Column(name = "FechaRegistro")
    private Date fechaRegistro;

    @Column(name = "Activo")
    private byte activo;

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPate() {
        return apellidoPate;
    }

    public void setApellidoPate(String apellidoPate) {
        this.apellidoPate = apellidoPate;
    }

    public String getApellidoMate() {
        return apellidoMate;
    }

    public void setApellidoMate(String apellidoMate) {
        this.apellidoMate = apellidoMate;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public byte getActivo() {
        return activo;
    }

    public void setActivo(byte activo) {
        this.activo = activo;
    }

    
}
