package org.springboot.jpa.riwi.pruebas.services.abstractions;

import org.springboot.jpa.riwi.pruebas.entities.Load;

import java.util.List;
import java.util.Optional;

public interface LoadService {
    //Atributos de LoadService
    //Constructores de LoadService
    //Asignadores de atributos de LoadService (setters)
    //Lectores de atributos de LoadService (getters)
        //Métodos de LoadService
    public List<Load> findAll();
    public Optional<Load> findById(String loadID);
    public Load save(Load load);
    public void deleteById(String loadID);
}
