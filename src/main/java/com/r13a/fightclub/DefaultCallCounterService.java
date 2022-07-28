package com.r13a.fightclub;

import java.util.concurrent.atomic.AtomicInteger;

import jakarta.inject.Singleton;

@Singleton
public class DefaultCallCounterService implements CallCounterService {

    private AtomicInteger counter = new AtomicInteger(1);

    public DefaultCallCounterService() {
        System.out.println("Iniciando DefaultCallCounterService...");
    }

    @Override
    public Integer next() {
        return Integer.valueOf( counter.getAndIncrement() );
    }

    
}
