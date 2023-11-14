package com.clases.springboot.app.Models.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "ficha_psicologica")
public class FichaPsicologica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente idPaciente;

    @ManyToOne
    @JoinColumn(name = "id_medico")
    private Medico idMedico;

    @ManyToOne
    @JoinColumn(name = "id_medicamento")
    private Medicamento idMedicamento;

    @Column(name = "NumeroHermanos")
    private int numeroHermanos;

    @Column(name = "LugarOcupa")
    private int lugarOcupa;

    @Column(name = "ViveCon", length = 255)
    private String viveCon;

    @Column(name = "FechaEntrevista")
    private Date fechaEntrevista;

    @Column(name = "MotivoConsulta", length = 255)
    private String motivoConsulta;

    @Column(name = "AntecedentesRelevantes", length = 255)
    private String antecedentesRelevantes;

    @Column(name = "DescripcionEstrategiaActividades", length = 255)
    private String descripcionEstrategiaActividades;

    @Column(name = "TecnicasInstrumentos", length = 255)
    private String tecnicasInstrumentos;

    @Column(name = "otros", length = 255)
    private String otros;

    @Column(name = "FechaRegistro")
    private Date fechaRegistro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Medico getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Medico idMedico) {
        this.idMedico = idMedico;
    }

    public Medicamento getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(Medicamento idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getNumeroHermanos() {
        return numeroHermanos;
    }

    public void setNumeroHermanos(int numeroHermanos) {
        this.numeroHermanos = numeroHermanos;
    }

    public int getLugarOcupa() {
        return lugarOcupa;
    }

    public void setLugarOcupa(int lugarOcupa) {
        this.lugarOcupa = lugarOcupa;
    }

    public String getViveCon() {
        return viveCon;
    }

    public void setViveCon(String viveCon) {
        this.viveCon = viveCon;
    }

    public Date getFechaEntrevista() {
        return fechaEntrevista;
    }

    public void setFechaEntrevista(Date fechaEntrevista) {
        this.fechaEntrevista = fechaEntrevista;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getAntecedentesRelevantes() {
        return antecedentesRelevantes;
    }

    public void setAntecedentesRelevantes(String antecedentesRelevantes) {
        this.antecedentesRelevantes = antecedentesRelevantes;
    }

    public String getDescripcionEstrategiaActividades() {
        return descripcionEstrategiaActividades;
    }

    public void setDescripcionEstrategiaActividades(String descripcionEstrategiaActividades) {
        this.descripcionEstrategiaActividades = descripcionEstrategiaActividades;
    }

    public String getTecnicasInstrumentos() {
        return tecnicasInstrumentos;
    }

    public void setTecnicasInstrumentos(String tecnicasInstrumentos) {
        this.tecnicasInstrumentos = tecnicasInstrumentos;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    
}
