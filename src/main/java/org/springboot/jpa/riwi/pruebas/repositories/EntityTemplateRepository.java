package org.springboot.jpa.riwi.pruebas.repositories;

import org.springboot.jpa.riwi.pruebas.entities.EntityTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityTemplateRepository extends JpaRepository<EntityTemplate, Long> {
    //Atributos de EntityTemplateRepository
    //Constructores de EntityTemplateRepository
    //Asignadores de atributos de EntityTemplateRepository (setters)
    //Lectores de atributos de EntityTemplateRepository (getters)
    //Métodos de EntityTemplateRepository
}
