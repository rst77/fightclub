package com.r13a.fightclub;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.validation.constraints.NotNull;

import io.micronaut.runtime.http.scope.RequestScope;

@RequestScope
public class DefaultFightService implements FightService {

    @Override
    public void fight(@NotNull String valor, @NotNull Resultado resultado) {
        // TODO Auto-generated method stub
 
            System.out.println("Fighting..... 8-O");
            var random = new Random();
            resultado.setFile( "./logs/" + resultado.getTimeStampInicio() + "-" + random.nextInt(100_000) + "-" + random.nextDouble(500_000) + ".txt" );
            try (FileWriter fw = new FileWriter( resultado.getFile(), true)) {
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write( valor );
                bw.newLine();
                bw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        resultado.setValor(valor);
        resultado.setStringSize(valor.length());
        resultado.setDigit( valor.chars().filter(Character::isDigit).count() );
        resultado.setUpperCase( valor.chars().filter(Character::isUpperCase).count() );
        resultado.setSpace( valor.chars().filter(Character::isSpaceChar).count() );
    }

}
