package com.r13a.fightclub;

import javax.validation.constraints.NotNull;

public class DefaultFightService implements FightService {

    @Override
    public void fight(@NotNull String valor, @NotNull Resultado resultado) {
        // TODO Auto-generated method stub
        System.out.println("AHAHAHAHAHA...");
    }

}
