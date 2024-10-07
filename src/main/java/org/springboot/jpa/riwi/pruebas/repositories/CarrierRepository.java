package org.springboot.jpa.riwi.pruebas.repositories;

import org.springboot.jpa.riwi.pruebas.entities.Carrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrierRepository extends JpaRepository<Carrier, String> {
    //Atributos de CarrierRepository
    //Constructores de CarrierRepository
    //Asignadores de atributos de CarrierRepository (setters)
    //Lectores de atributos de CarrierRepository (getters)
    //Métodos de CarrierRepository
}
