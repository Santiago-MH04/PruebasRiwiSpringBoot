package org.springboot.jpa.riwi.pruebas.repositories;

import org.springboot.jpa.riwi.pruebas.entities.Load;
import org.springboot.jpa.riwi.pruebas.entities.Pallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PalletRepository extends JpaRepository<Pallet, Long> {
    //Atributos de EntityTemplateRepository
    //Constructores de EntityTemplateRepository
    //Asignadores de atributos de EntityTemplateRepository (setters)
    //Lectores de atributos de EntityTemplateRepository (getters)
        //Métodos de EntityTemplateRepository
    @Query("select p from Pallet p left join p.load where p.id =?1")   //Aunque, como la relación es @OneToOne, no es necesario
    public Optional<Pallet> findPalletBundledById(Long palletId);
}
