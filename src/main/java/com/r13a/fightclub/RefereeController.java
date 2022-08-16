package com.r13a.fightclub;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.runtime.http.scope.RequestScope;

@Controller("/referee") 
@RequestScope
public class RefereeController {

    
    @Get("/{targets}/{arquivo}")
    public void referee( @PathVariable String targets, @PathVariable String arquivo ) {
        System.out.println("##########################");
        System.out.println("Invocado servico /{targets}/{arquivo}");
        System.out.println("Targets: " + targets);
        System.out.println("Arquivo: " + arquivo);



        System.out.println("##########################\n\n");
        
    }
    
}
