package org.springboot.jpa.riwi.pruebas.controllers;

import org.springboot.jpa.riwi.pruebas.entities.Load;
import org.springboot.jpa.riwi.pruebas.entities.Pallet;
import org.springboot.jpa.riwi.pruebas.services.abstractions.CarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @GetMapping("/loads/{id}")
    public List<Load> findLoadsByCarrier(@PathVariable(name = "id") String carrierID){
        return this.carrierService.findLoadsByCarrier(carrierID);
    }
}
