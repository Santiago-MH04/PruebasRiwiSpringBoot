package org.springboot.jpa.riwi.pruebas.services.implementations;

import org.springboot.jpa.riwi.pruebas.repositories.PalletRepository;
import org.springboot.jpa.riwi.pruebas.services.abstractions.PalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PalletServiceImpl implements PalletService {
        //Atributos de EntityTemplateServiceImpl
    @Autowired
    private PalletRepository repoPallet;

    //Constructores de EntityTemplateServiceImpl
    //Asignadores de atributos de EntityTemplateServiceImpl (setters)
    //Lectores de atributos de EntityTemplateServiceImpl (getters)
    //Métodos de EntityTemplateServiceImpl
}
