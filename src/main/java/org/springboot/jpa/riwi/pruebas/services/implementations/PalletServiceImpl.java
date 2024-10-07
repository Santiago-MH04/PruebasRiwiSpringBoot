package org.springboot.jpa.riwi.pruebas.services.implementations;

import org.springboot.jpa.riwi.pruebas.entities.Load;
import org.springboot.jpa.riwi.pruebas.entities.Pallet;
import org.springboot.jpa.riwi.pruebas.repositories.PalletRepository;
import org.springboot.jpa.riwi.pruebas.services.abstractions.PalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PalletServiceImpl implements PalletService {
        //Atributos de EntityTemplateServiceImpl
    @Autowired
    private PalletRepository repoPallet;

    //Constructores de EntityTemplateServiceImpl
    //Asignadores de atributos de EntityTemplateServiceImpl (setters)
    //Lectores de atributos de EntityTemplateServiceImpl (getters)
        //Métodos de EntityTemplateServiceImpl
    @Override
    public List<Pallet> findAll() {
        return this.repoPallet.findAll();
    }

    @Override
    public Optional<Pallet> findById(Long palletID) {
        return this.repoPallet.findById(palletID);
    }

    @Override
    public Optional<Load> findLoadByPalletId(Long palletID) {
        Load load = null;
        Optional<Pallet> pallet = this.repoPallet.findPalletBundledById(palletID);
        if(pallet.isPresent()){
            load = pallet.get().getLoad();
        }
        return Optional.ofNullable(load);
    }

    @Override
    public Pallet save(Pallet pallet) {
        return this.repoPallet.save(pallet);
    }

    @Override
    public void deleteById(Long palletID) {
        this.repoPallet.deleteById(palletID);
    }
}
