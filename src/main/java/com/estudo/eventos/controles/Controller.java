package com.estudo.eventos.controles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String displayText() {
        return "Endpoint para uso da API: localhost:8080/evento";
    }
}
