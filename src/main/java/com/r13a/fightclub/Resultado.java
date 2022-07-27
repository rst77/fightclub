package com.r13a.fightclub;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.runtime.http.scope.RequestScope;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

import javax.validation.constraints.NotBlank;

@RequestScope 
public class Resultado {

    private final CallCounter callCounter;

    @NonNull
    @NotBlank 
    private final Integer numeroChamada;

    @NonNull
    @NotBlank 
    private Instant timeStampInicio;

    private Instant timeStampFinal;

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
        this.timeStampFinal = new Timestamp( System.currentTimeMillis() ).toInstant();;
    }

    public Resultado(CallCounter callCounter) {
        this.callCounter = callCounter;
        this.numeroChamada = callCounter.next();
        this.timeStampInicio = new Timestamp( System.currentTimeMillis() ).toInstant();;
    }

}