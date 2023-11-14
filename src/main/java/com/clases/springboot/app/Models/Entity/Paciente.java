package com.clases.springboot.app.Models.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "paciente")
public class Paciente {
    
    @Id
    @Column(name = "DocumentoIdentidad")
    private Long dni;

    @Column(name = "NombrePaciente", length = 255)
    private String nombre;

    @Column(name = "ApellidoPate", length = 255)
    private String apellidoPate;

    @Column(name = "ApellidoMate", length = 255)
    private String apellidoMate;

    @Column(name = "Edad")
    private int edad;

    @Column(name = "Genero", length = 255)
    private String genero;

    @Column(name = "FechaNacimiento")
    private Date fechaNacimiento;

    @Column(name = "FechaRegistro")
    private Date fechaRegistro;

    @Column(name = "Activo")
    private byte activo;

    @Column(name = "DocumentoIdFamiliar")
    private Long dniFamiliar;

    @Column(name = "NombreFamiliar", length = 255)
    private String nombreFamiliar;

    @Column(name = "ApellidoPateFamiliar", length = 255)
    private String apellidoPateFamiliar;

    @Column(name = "ApellidoMateFamiliar", length = 255)
    private String apellidoMateFamiliar;

    @Column(name = "TelefonoFamiliar", length = 255)
    private String telefonoFamiliar;

    @Column(name = "Direccion", length = 255)
    private String direccion;

     @Column(name = "Parentesco", length = 255)
    private String parentesco;

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public Long getDniFamiliar() {
        return dniFamiliar;
    }

    public void setDniFamiliar(Long dniFamiliar) {
        this.dniFamiliar = dniFamiliar;
    }

    public String getNombreFamiliar() {
        return nombreFamiliar;
    }

    public void setNombreFamiliar(String nombreFamiliar) {
        this.nombreFamiliar = nombreFamiliar;
    }

    public String getApellidoPateFamiliar() {
        return apellidoPateFamiliar;
    }

    public void setApellidoPateFamiliar(String apellidoPateFamiliar) {
        this.apellidoPateFamiliar = apellidoPateFamiliar;
    }

    public String getApellidoMateFamiliar() {
        return apellidoMateFamiliar;
    }

    public void setApellidoMateFamiliar(String apellidoMateFamiliar) {
        this.apellidoMateFamiliar = apellidoMateFamiliar;
    }

    public String getTelefonoFamiliar() {
        return telefonoFamiliar;
    }

    public void setTelefonoFamiliar(String telefonoFamiliar) {
        this.telefonoFamiliar = telefonoFamiliar;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    

}
