package com.example.Esercizio1Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Meteo {

    @GetMapping(path = "/ciao")
    public String tempo(String nome, String provincia){
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }

}
