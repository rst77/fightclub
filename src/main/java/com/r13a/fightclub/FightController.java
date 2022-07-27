package com.r13a.fightclub;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller("/fight") 
public class FightController {

    
    private final FightService fightService;
    private final Resultado resultado;

    public FightController(FightService fightService, Resultado resultado) {
        this.fightService = fightService;
        this.resultado = resultado;
    }


    @Get
    public String index() {
        return "Fight base... \n"; 
    }
   

    @Get("/{valor}")
    public Resultado fight(@PathVariable String valor ) {
        fightService.fight(valor, resultado);
        resultado.stop();
        return resultado;
    }
}
    
