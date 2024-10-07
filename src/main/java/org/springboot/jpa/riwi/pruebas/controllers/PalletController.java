package org.springboot.jpa.riwi.pruebas.controllers;

import org.springboot.jpa.riwi.pruebas.entities.Load;
import org.springboot.jpa.riwi.pruebas.entities.Pallet;
import org.springboot.jpa.riwi.pruebas.services.abstractions.PalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pallets")
public class PalletController {
        //Atributos de EntityTemplateController
    @Autowired
    private PalletService palletService;

    //Constructores de EntityTemplateController
    //Asignadores de atributos de EntityTemplateController (setters)
    //Lectores de atributos de EntityTemplateController (getters)
        //Métodos de EntityTemplateController
    @GetMapping
    public List<Pallet> getAllPallets(){
        return this.palletService.findAll();
    }
        @GetMapping("/{id}")
        public ResponseEntity<?> getLoadById(@PathVariable(name = "id") Long palletID){
            Optional<Pallet> loadOptional = this.palletService.findById(palletID);
            if(loadOptional.isPresent()) {
                return ResponseEntity.ok(loadOptional.get());
            }
            return ResponseEntity.notFound().build();
        }
        @GetMapping("/{id}/loads")
        public ResponseEntity<?> getLoadByPalletId(@PathVariable(name = "id") Long palletID){
            Optional<Load> loadOptional = this.palletService.findLoadByPalletId(palletID);
            if(loadOptional.isPresent()) {
                return ResponseEntity.ok(loadOptional.get());
            }
            return ResponseEntity.notFound().build();
        }

    @PostMapping
    public ResponseEntity<?> createPallet(/*@Valid*/ @RequestBody Pallet pallet/*, BindingResult result*/) {
            //La instancia de BindingResult debe ir siempre al principio, junto al argumento que valida
        /*this.validation.validate(pallet, result);*/
        /*if(result.hasFieldErrors()) {
            return validation(result);
        }*/
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(this.palletService.save(pallet));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> createLoad(/*@Valid*/ @RequestBody Pallet pallet/*, BindingResult result*/, @PathVariable(name = "id") Long palletID) {
            //La instancia de BindingResult debe ir siempre al principio, junto al argumento que valida
        /*this.validation.validate(pallet, result);*/
        /*if(result.hasFieldErrors()) {
            return validation(result);
        }*/
        pallet.setId(palletID);
        return ResponseEntity.status(HttpStatus.OK)
                .body(this.palletService.save(pallet));
    }

    @DeleteMapping("/{id}")
    public void deletePalletById(@PathVariable(name = "id") Long palletID) {
        this.palletService.deleteById(palletID);
    }
}
