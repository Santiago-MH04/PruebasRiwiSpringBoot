package org.springboot.jpa.riwi.pruebas.services.implementations;

import org.springboot.jpa.riwi.pruebas.repositories.LoadRepository;
import org.springboot.jpa.riwi.pruebas.services.abstractions.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadServiceImpl implements LoadService {
        //Atributos de LoadServiceImpl
    @Autowired
    private LoadRepository repoLoad;

    //Constructores de LoadServiceImpl
    //Asignadores de atributos de LoadServiceImpl (setters)
    //Lectores de atributos de LoadServiceImpl (getters)
    //Métodos de LoadServiceImpl
}
