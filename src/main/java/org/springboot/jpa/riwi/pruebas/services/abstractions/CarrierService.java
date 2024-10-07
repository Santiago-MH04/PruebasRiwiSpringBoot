package org.springboot.jpa.riwi.pruebas.services.abstractions;

import org.springboot.jpa.riwi.pruebas.entities.Load;

import java.util.List;

public interface CarrierService {
    //Atributos de CarrierService
    //Constructores de CarrierService
    //Asignadores de atributos de CarrierService (setters)
    //Lectores de atributos de CarrierService (getters)
        //Métodos de CarrierService
    public List<Load> findLoadsByCarrier(String carrierID);
}
