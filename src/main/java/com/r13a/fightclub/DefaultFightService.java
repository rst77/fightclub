package com.r13a.fightclub;

import java.util.Random;

import javax.validation.constraints.NotNull;

import io.micronaut.runtime.http.scope.RequestScope;

@RequestScope
public class DefaultFightService implements FightService {

    @Override
    public void fight(@NotNull String valor, @NotNull Resultado resultado) {
        // TODO Auto-generated method stub
        System.out.println("Fighting..... 8-O");
        try {
            var random = new Random();
            Thread.sleep(random.nextInt(2000));
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        resultado.setStringSize(valor.length());
        resultado.setUpperCase( valor.chars().filter(Character::isUpperCase).count() );
        resultado.setValor(valor);
    }

}
