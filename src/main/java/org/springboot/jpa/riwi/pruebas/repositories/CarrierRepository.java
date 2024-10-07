package org.springboot.jpa.riwi.pruebas.repositories;

import org.springboot.jpa.riwi.pruebas.entities.Carrier;
import org.springboot.jpa.riwi.pruebas.entities.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarrierRepository extends JpaRepository<Carrier, String> {
    //Atributos de CarrierRepository
    //Constructores de CarrierRepository
    //Asignadores de atributos de CarrierRepository (setters)
    //Lectores de atributos de CarrierRepository (getters)
        //Métodos de CarrierRepository
    @Query("select c.roles from Carrier c left join c.roles where c.id =?1")
    public List<Load> findAllLoadsByCarrier(String carrierID);
}
