package com.r13a.fightclub;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.runtime.http.scope.RequestScope;

@Controller("/fight") 
@RequestScope
public class FightController {

    
    private final FightService fightService;
    private final CallCounterService callCounterService;

    public FightController(FightService fightService, CallCounterService callCounterService) {
        this.fightService = fightService;
        this.callCounterService = callCounterService;
    }

    @Get("/{valor}")
    public Resultado fight(@PathVariable String valor ) {
        System.out.println("##########################");
        System.out.println("Invocado servico /{valor}");
        Resultado resultado = new Resultado( this.callCounterService );
        fightService.fight(valor, resultado);
        resultado.stop();
        System.out.println("##########################\n\n");
        return resultado;
    }
}
    
