package org.springboot.jpa.riwi.pruebas.controllers;

import org.springboot.jpa.riwi.pruebas.services.abstractions.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/loads")
public class LoadController {
        //Atributos de LoadController
    @Autowired
    private LoadService loadService;

    //Constructores de LoadController
    //Asignadores de atributos de LoadController (setters)
    //Lectores de atributos de LoadController (getters)
    //Métodos de LoadController
}
