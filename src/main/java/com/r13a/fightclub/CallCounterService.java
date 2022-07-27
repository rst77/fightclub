package com.r13a.fightclub;

import java.util.concurrent.atomic.AtomicInteger;

import jakarta.inject.Singleton;

@Singleton
public class CallCounterService implements CallCounter {

    private AtomicInteger counter = new AtomicInteger(1);

    @Override
    public Integer next() {
        return Integer.valueOf( counter.getAndIncrement() );
    }

    
}
