package org.springboot.jpa.riwi.pruebas.services.abstractions;


import org.springboot.jpa.riwi.pruebas.entities.Load;
import org.springboot.jpa.riwi.pruebas.entities.Pallet;

import java.util.List;
import java.util.Optional;

public interface PalletService {
    //Atributos de EntityTemplateService
    //Constructores de EntityTemplateService
    //Asignadores de atributos de EntityTemplateService (setters)
    //Lectores de atributos de EntityTemplateService (getters)
        //Métodos de EntityTemplateService
    public List<Pallet> findAll();
    public Optional<Pallet> findById(Long palletID);
    public Optional<Load>findLoadByPalletId(Long palletID);

    public Pallet save(Pallet pallet);
    public void deleteById(Long palletID);
}
