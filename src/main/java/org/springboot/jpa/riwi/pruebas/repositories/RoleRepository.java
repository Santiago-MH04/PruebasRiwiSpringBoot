package org.springboot.jpa.riwi.pruebas.repositories;

import org.springboot.jpa.riwi.pruebas.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    //Atributos de RoleRepository
    //Constructores de RoleRepository
    //Asignadores de atributos de RoleRepository (setters)
    //Lectores de atributos de RoleRepository (getters)
    //Métodos de RoleRepository
}
