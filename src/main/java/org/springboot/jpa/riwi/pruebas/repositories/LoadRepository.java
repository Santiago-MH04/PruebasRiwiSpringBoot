package org.springboot.jpa.riwi.pruebas.repositories;

import org.springboot.jpa.riwi.pruebas.entities.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadRepository extends JpaRepository<Load, String> {
    //Atributos de LoadRepository
    //Constructores de LoadRepository
    //Asignadores de atributos de LoadRepository (setters)
    //Lectores de atributos de LoadRepository (getters)
    //Métodos de LoadRepository
}
