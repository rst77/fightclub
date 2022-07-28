package com.r13a.fightclub;

import javax.validation.constraints.NotNull;

import io.micronaut.context.annotation.DefaultImplementation;
import io.micronaut.context.annotation.Prototype;
import io.micronaut.core.annotation.NonNull;


@DefaultImplementation(DefaultFightService.class)
public interface FightService {

    @NonNull
    void fight(@NonNull @NotNull String valor, @NonNull @NotNull Resultado resultado);
}
