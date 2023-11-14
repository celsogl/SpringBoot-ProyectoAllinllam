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
@Table(name= "ficha_terapeutica")
public class FichaTerapeutica {
    
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

    @Column(name = "Antecedentes", length = 255)
    private String antecedentes;

    @Column(name = "FechaLesion")
    private Date fechaLesion;

    @Column(name = "DiagnosticoFisioterapia", length = 255)
    private String diagnosticoFisioterapia;

    @Column(name = "Objetivo", length = 255)
    private String objetivo;

	@Column(name = "Tecnicas", length = 255)
    private String tecnicas;

    @Column(name = "Sesiones")
    private int sesiones;

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

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public Date getFechaLesion() {
        return fechaLesion;
    }

    public void setFechaLesion(Date fechaLesion) {
        this.fechaLesion = fechaLesion;
    }

    public String getDiagnosticoFisioterapia() {
        return diagnosticoFisioterapia;
    }

    public void setDiagnosticoFisioterapia(String diagnosticoFisioterapia) {
        this.diagnosticoFisioterapia = diagnosticoFisioterapia;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(String tecnicas) {
        this.tecnicas = tecnicas;
    }

    public int getSesiones() {
        return sesiones;
    }

    public void setSesiones(int sesiones) {
        this.sesiones = sesiones;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    
}
