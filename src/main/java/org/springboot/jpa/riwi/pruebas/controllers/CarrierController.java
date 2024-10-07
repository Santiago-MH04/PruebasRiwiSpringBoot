package org.springboot.jpa.riwi.pruebas.controllers;

import org.springboot.jpa.riwi.pruebas.services.abstractions.CarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carriers")
public class CarrierController {
        //Atributos de CarrierController
    @Autowired
    private CarrierService carrierService;

    //Constructores de CarrierController
    //Asignadores de atributos de CarrierController (setters)
    //Lectores de atributos de CarrierController (getters)
    //Métodos de CarrierController
}
