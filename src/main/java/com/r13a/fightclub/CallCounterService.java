package com.r13a.fightclub;

import io.micronaut.context.annotation.DefaultImplementation;
import io.micronaut.core.annotation.NonNull;

@DefaultImplementation(DefaultCallCounterService.class)
@FunctionalInterface
public interface CallCounterService {

    @NonNull
    Integer next();
    
}
