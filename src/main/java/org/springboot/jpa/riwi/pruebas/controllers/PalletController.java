package org.springboot.jpa.riwi.pruebas.controllers;

import org.springboot.jpa.riwi.pruebas.services.abstractions.PalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pallets")
public class PalletController {
        //Atributos de EntityTemplateController
    @Autowired
    private PalletService palletService;

    //Constructores de EntityTemplateController
    //Asignadores de atributos de EntityTemplateController (setters)
    //Lectores de atributos de EntityTemplateController (getters)
    //Métodos de EntityTemplateController
}
