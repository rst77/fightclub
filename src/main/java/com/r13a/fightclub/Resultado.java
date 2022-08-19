package com.r13a.fightclub;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.NonNull;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;

import javax.validation.constraints.NotBlank;

@Introspected
public class Resultado {

    // private final CallCounterService callCounter;

    @NonNull
    @NotBlank
    private final Integer numeroChamada;

    @NonNull
    @NotBlank
    private Instant timeStampInicio;

    @NonNull
    @NotBlank
    private Instant timeStampFinal;

    @NonNull
    @NotBlank
    private Duration duration;

    @NonNull
    @NotBlank
    private Long upperCase;

    @NonNull
    @NotBlank
    private Long space;

    @NonNull
    @NotBlank
    private Long digit;

    @NonNull
    @NotBlank
    private Integer stringSize;

    @NonNull
    @NotBlank
    private String valor;

    @NonNull
    @NotBlank
    private String file;

    public Resultado(CallCounterService callCounter) {

        //System.out.println("Iniciando classe Resultado...");
        // this.callCounter = callCounter;
        this.numeroChamada = callCounter.next();
        this.timeStampInicio = new Timestamp(System.currentTimeMillis()).toInstant();
        ;
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
        this.timeStampFinal = new Timestamp(System.currentTimeMillis()).toInstant();
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


    /**
     * @return Long return the spaces
     */
    public Long getSpace() {
        return space;
    }

    /**
     * @param spaces the spaces to set
     */
    public void setSpace(Long space) {
        this.space = space;
    }


    /**
     * @return Long return the digit
     */
    public Long getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(Long digit) {
        this.digit = digit;
    }


    /**
     * @return String return the file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(String file) {
        this.file = file;
    }

}