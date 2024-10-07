package org.springboot.jpa.riwi.pruebas.services.implementations;

import org.springboot.jpa.riwi.pruebas.entities.Load;
import org.springboot.jpa.riwi.pruebas.repositories.LoadRepository;
import org.springboot.jpa.riwi.pruebas.services.abstractions.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoadServiceImpl implements LoadService {
        //Atributos de LoadServiceImpl
    @Autowired
    private LoadRepository repoLoad;

    //Constructores de LoadServiceImpl
    //Asignadores de atributos de LoadServiceImpl (setters)
    //Lectores de atributos de LoadServiceImpl (getters)
        //Métodos de LoadServiceImpl
    @Override
    public List<Load> findAll() {
        return this.repoLoad.findAll();
    }

    @Override
    public Optional<Load> findById(String loadID) {
        return this.repoLoad.findById(loadID);
    }

    @Override
    public Load save(Load load) {
        return this.repoLoad.save(load);
    }

    @Override
    public void deleteById(String loadID) {
        this.repoLoad.deleteById(loadID);
    }
}
