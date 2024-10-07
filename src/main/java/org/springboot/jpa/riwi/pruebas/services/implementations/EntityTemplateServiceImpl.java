package org.springboot.jpa.riwi.pruebas.services.implementations;

import org.springboot.jpa.riwi.pruebas.repositories.EntityTemplateRepository;
import org.springboot.jpa.riwi.pruebas.services.abstractions.EntityTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityTemplateServiceImpl implements EntityTemplateService {
        //Atributos de EntityTemplateServiceImpl
    @Autowired
    private EntityTemplateRepository repoEntity;

    //Constructores de EntityTemplateServiceImpl
    //Asignadores de atributos de EntityTemplateServiceImpl (setters)
    //Lectores de atributos de EntityTemplateServiceImpl (getters)
    //Métodos de EntityTemplateServiceImpl
}
