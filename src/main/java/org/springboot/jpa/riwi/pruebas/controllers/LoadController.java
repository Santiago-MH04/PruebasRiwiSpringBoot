package org.springboot.jpa.riwi.pruebas.controllers;

import jakarta.validation.Valid;
import org.springboot.jpa.riwi.pruebas.entities.Load;
import org.springboot.jpa.riwi.pruebas.services.abstractions.LoadService;
import org.springboot.jpa.riwi.pruebas.utils.loadUtils.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/loads")
public class LoadController {
        //Atributos de LoadController
    @Autowired
    private LoadService loadService;

    //Constructores de LoadController
    //Asignadores de atributos de LoadController (setters)
    //Lectores de atributos de LoadController (getters)
        //Métodos de LoadController
    @GetMapping
    public List<Load> getAllLoads(){
        return this.loadService.findAll();
    }
        @GetMapping("/{id}")
        public ResponseEntity<?> getLoadById(@PathVariable(name = "id") String loadID){
            Optional<Load> loadOptional = this.loadService.findById(loadID);
            if(loadOptional.isPresent()) {
                return ResponseEntity.ok(loadOptional.get());
            }
            return ResponseEntity.notFound().build();
        }

    @PostMapping
    public ResponseEntity<?> createLoad(/*@Valid*/ @RequestBody Load load/*, BindingResult result*/) {
            //La instancia de BindingResult debe ir siempre al principio, junto al argumento que valida
        /*this.validation.validate(load, result);*/
        /*if(result.hasFieldErrors()) {
            return validation(result);
        }*/
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(this.loadService.save(load));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> createLoad(/*@Valid*/ @RequestBody Load load/*, BindingResult result*/, @PathVariable(name = "id") String loadID) {
            //La instancia de BindingResult debe ir siempre al principio, junto al argumento que valida
        /*this.validation.validate(load, result);*/
        /*if(result.hasFieldErrors()) {
            return validation(result);
        }*/
        load.setId(loadID);
        return ResponseEntity.status(HttpStatus.OK)
                .body(this.loadService.save(load));
    }

    @PatchMapping("/{id}/status")
        //La instancia de BindingResult debe ir siempre al principio, junto al argumento que valida
    public ResponseEntity<?> updateLoadStatus(/*@Valid*/ @RequestBody String status, /*BindingResult result,*/ @PathVariable(name = "id") String loadID) {
        /*this.validation.validate(status, result);*/
        /*if(result.hasFieldErrors()) {
            return validation(result);
        }*/
        if(this.loadService.findById(loadID).isPresent()){
            Load l = this.loadService.findById(loadID).get();
            l.setStatus(Status.valueOf(status));
            return ResponseEntity.status(HttpStatus.OK)
                    .body(this.loadService.save(l));
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}/damage")
        //La instancia de BindingResult debe ir siempre al principio, junto al argumento que valida
    public ResponseEntity<?> updateLoadState(/*@Valid*/ @RequestBody String state, /*BindingResult result,*/ @PathVariable(name = "id") String loadID) {
        /*this.validation.validate(state, result);*/
        /*if(result.hasFieldErrors()) {
            return validation(result);
        }*/
        if(this.loadService.findById(loadID).isPresent()){
            Load l = this.loadService.findById(loadID).get();
            if(state.equalsIgnoreCase("damaged")){
                l.setState("DAMAGED");
            }
            return ResponseEntity.status(HttpStatus.OK)
                    .body(this.loadService.save(l));
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}
