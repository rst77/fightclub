package com.r13a.fightclub;

import io.micronaut.core.annotation.NonNull;


import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;

import javax.validation.constraints.NotBlank;

public class Resultado {

    //private final CallCounterService callCounter;

    @NonNull
    @NotBlank 
    private final Integer numeroChamada;

    @NonNull
    @NotBlank 
    private Instant timeStampInicio;

    private Instant timeStampFinal;

    private Duration duration;

    private Long upperCase;

    private Integer stringSize;

    private String valor;

    public Resultado(CallCounterService callCounter) {

        System.out.println("Iniciando classe Resultado...");
        //this.callCounter = callCounter;
        this.numeroChamada = callCounter.next();
        this.timeStampInicio = new Timestamp( System.currentTimeMillis() ).toInstant();;
    }

    public Integer getNumeroChamada() {
        return numeroChamada;
    }

    public Instant getTimeStampInicio() {
        return timeStampInicio;
    }

    public Instant getTimeStampFinal() {
        return timeStampFinal;
    }

    public void stop() {
        this.timeStampFinal = new Timestamp( System.currentTimeMillis() ).toInstant();
        this.setDuration();
    }

    public Long getUpperCase() {
        return upperCase;
    }

    public void setUpperCase(Long upperCase) {
        this.upperCase = upperCase;
    }

    public Integer getStringSize() {
        return stringSize;
    }

    public void setStringSize(Integer stringSize) {
        this.stringSize = stringSize;
    }

    public void setTimeStampInicio(Instant timeStampInicio) {
        this.timeStampInicio = timeStampInicio;
    }

    public void setTimeStampFinal(Instant timeStampFinal) {
        this.timeStampFinal = timeStampFinal;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    
    public Duration getDuration() {
        return duration;
    }

    public void setDuration() {
        this.duration = Duration.between(timeStampInicio, timeStampFinal);
    }

}