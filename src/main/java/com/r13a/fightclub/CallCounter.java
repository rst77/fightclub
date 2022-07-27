package com.r13a.fightclub;

import io.micronaut.context.annotation.DefaultImplementation;
import io.micronaut.core.annotation.NonNull;

@DefaultImplementation(CallCounterService.class)
@FunctionalInterface
public interface CallCounter {

    @NonNull
    Integer next();
    
}
