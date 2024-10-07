package org.springboot.jpa.riwi.pruebas.services.implementations;

import org.springboot.jpa.riwi.pruebas.repositories.CarrierRepository;
import org.springboot.jpa.riwi.pruebas.services.abstractions.CarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrierServiceImpl implements CarrierService {
        //Atributos de CarrierRepository
    @Autowired
    private CarrierRepository repoCarrier;

    //Constructores de CarrierRepository
    //Asignadores de atributos de CarrierRepository (setters)
    //Lectores de atributos de CarrierRepository (getters)
    //Métodos de CarrierRepository
}
