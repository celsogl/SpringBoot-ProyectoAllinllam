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
@Table(name= "ficha_medica")
public class FichaMedica {
    
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
    @JoinColumn(name = "id_tipodeSangre")
    private TipodeSangre idTipodeSangre;

    @ManyToOne
    @JoinColumn(name = "id_medicamento")
    private Medicamento idMedicamento;

    @Column(name = "FechaUltimoExamenCompleto")
    private Date fechaUltimoExamenCompleto;

    @Column(name = "Bajotratamiento")
    private byte bajotratamiento;


    @Column(name = "CirujiaEnferdadCambio")
    private byte cirujiaEnferdadCambio;

    @Column(name = "ComentarioCirujia", length = 255)
    private String comentarioCirujia;

    @Column(name = "Asma")
    private byte asma;

    @Column(name = "Bronquitis")
    private byte bronquitis;

    @Column(name = "Diarrea")
    private byte diarrea;

    @Column(name = "Hemofilia")
    private byte hemofilia;

    @Column(name = "Epilepsia")
    private byte epilepsia;

    @Column(name = "ProblemasMestruales")
    private byte problemasMestruales;

    @Column(name = "AfeccionPulmonares")
    private byte afeccionPulmonares;

    @Column(name = "AfeccionCardiovascular")
    private byte afeccionCardiovascular;

    @Column(name = "AfeccionRenales")
    private byte afeccionRenales;

    @Column(name = "AfeccionesHepaticas")
    private byte afeccionesHepaticas;

    @Column(name = "AfeccionesNeurologicas")
    private byte afeccianesNeurologicas;
    
    @Column(name = "AfeccionesPsiquiatricas")
    private byte afeccionesPsiquiatricas;

    @Column(name = "AfeccionesArticulares")
    private byte afeccionesArticulares;

    @Column(name = "AfeccionesOidos")
    private byte afeccionesOidos;

    @Column(name = "AfeccionesOjos")
    private byte afeccionesOjos;

    @Column(name = "Alergias")
    private byte alergias;

    @Column(name = "RestriccionesAlimenticias")
    private byte restriccionesAlimenticias;

    @Column(name = "CondicionEmocionalFisica", length = 255)
    private String condicionEmocionalFisica;

    @Column(name = "TratamientoActual", length = 255)
    private String tratamientoActual;


    @Column(name = "dosis")
    private int dosis;

    @Column(name = "observaciones", length = 255)
    private String observaciones;

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

    public TipodeSangre getIdTipodeSangre() {
        return idTipodeSangre;
    }

    public void setIdTipodeSangre(TipodeSangre idTipodeSangre) {
        this.idTipodeSangre = idTipodeSangre;
    }

    public Medicamento getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(Medicamento idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public Date getFechaUltimoExamenCompleto() {
        return fechaUltimoExamenCompleto;
    }

    public void setFechaUltimoExamenCompleto(Date fechaUltimoExamenCompleto) {
        this.fechaUltimoExamenCompleto = fechaUltimoExamenCompleto;
    }

    public byte getBajotratamiento() {
        return bajotratamiento;
    }

    public void setBajotratamiento(byte bajotratamiento) {
        this.bajotratamiento = bajotratamiento;
    }

    public byte getCirujiaEnferdadCambio() {
        return cirujiaEnferdadCambio;
    }

    public void setCirujiaEnferdadCambio(byte cirujiaEnferdadCambio) {
        this.cirujiaEnferdadCambio = cirujiaEnferdadCambio;
    }

    public String getComentarioCirujia() {
        return comentarioCirujia;
    }

    public void setComentarioCirujia(String comentarioCirujia) {
        this.comentarioCirujia = comentarioCirujia;
    }

    public byte getAsma() {
        return asma;
    }

    public void setAsma(byte asma) {
        this.asma = asma;
    }

    public byte getBronquitis() {
        return bronquitis;
    }

    public void setBronquitis(byte bronquitis) {
        this.bronquitis = bronquitis;
    }

    public byte getDiarrea() {
        return diarrea;
    }

    public void setDiarrea(byte diarrea) {
        this.diarrea = diarrea;
    }

    public byte getHemofilia() {
        return hemofilia;
    }

    public void setHemofilia(byte hemofilia) {
        this.hemofilia = hemofilia;
    }

    public byte getEpilepsia() {
        return epilepsia;
    }

    public void setEpilepsia(byte epilepsia) {
        this.epilepsia = epilepsia;
    }

    public byte getProblemasMestruales() {
        return problemasMestruales;
    }

    public void setProblemasMestruales(byte problemasMestruales) {
        this.problemasMestruales = problemasMestruales;
    }

    public byte getAfeccionPulmonares() {
        return afeccionPulmonares;
    }

    public void setAfeccionPulmonares(byte afeccionPulmonares) {
        this.afeccionPulmonares = afeccionPulmonares;
    }

    public byte getAfeccionCardiovascular() {
        return afeccionCardiovascular;
    }

    public void setAfeccionCardiovascular(byte afeccionCardiovascular) {
        this.afeccionCardiovascular = afeccionCardiovascular;
    }

    public byte getAfeccionRenales() {
        return afeccionRenales;
    }

    public void setAfeccionRenales(byte afeccionRenales) {
        this.afeccionRenales = afeccionRenales;
    }

    public byte getAfeccionesHepaticas() {
        return afeccionesHepaticas;
    }

    public void setAfeccionesHepaticas(byte afeccionesHepaticas) {
        this.afeccionesHepaticas = afeccionesHepaticas;
    }

    public byte getAfeccianesNeurologicas() {
        return afeccianesNeurologicas;
    }

    public void setAfeccianesNeurologicas(byte afeccianesNeurologicas) {
        this.afeccianesNeurologicas = afeccianesNeurologicas;
    }

    public byte getAfeccionesPsiquiatricas() {
        return afeccionesPsiquiatricas;
    }

    public void setAfeccionesPsiquiatricas(byte afeccionesPsiquiatricas) {
        this.afeccionesPsiquiatricas = afeccionesPsiquiatricas;
    }

    public byte getAfeccionesArticulares() {
        return afeccionesArticulares;
    }

    public void setAfeccionesArticulares(byte afeccionesArticulares) {
        this.afeccionesArticulares = afeccionesArticulares;
    }

    public byte getAfeccionesOidos() {
        return afeccionesOidos;
    }

    public void setAfeccionesOidos(byte afeccionesOidos) {
        this.afeccionesOidos = afeccionesOidos;
    }

    public byte getAfeccionesOjos() {
        return afeccionesOjos;
    }

    public void setAfeccionesOjos(byte afeccionesOjos) {
        this.afeccionesOjos = afeccionesOjos;
    }

    public byte getAlergias() {
        return alergias;
    }

    public void setAlergias(byte alergias) {
        this.alergias = alergias;
    }

    public byte getRestriccionesAlimenticias() {
        return restriccionesAlimenticias;
    }

    public void setRestriccionesAlimenticias(byte restriccionesAlimenticias) {
        this.restriccionesAlimenticias = restriccionesAlimenticias;
    }

    public String getCondicionEmocionalFisica() {
        return condicionEmocionalFisica;
    }

    public void setCondicionEmocionalFisica(String condicionEmocionalFisica) {
        this.condicionEmocionalFisica = condicionEmocionalFisica;
    }

    public String getTratamientoActual() {
        return tratamientoActual;
    }

    public void setTratamientoActual(String tratamientoActual) {
        this.tratamientoActual = tratamientoActual;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    

}
