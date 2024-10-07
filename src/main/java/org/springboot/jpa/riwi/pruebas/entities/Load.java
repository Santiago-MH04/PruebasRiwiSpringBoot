package org.springboot.jpa.riwi.pruebas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springboot.jpa.riwi.pruebas.utils.loadUtils.*;
import org.springboot.jpa.riwi.pruebas.utils.palletUtils.State;

import java.util.ArrayList;

@Entity
@Table(name = "loads")
@NoArgsConstructor(force = true)    //Para que sí o sí genere un constructor vacío
@AllArgsConstructor
    /*@RequiredArgsConstructor*/    //Sólo crea constructores con los atributos declarados como final, también lo agrupa el @Data
@Builder    //Para generar instancias de Customer según nuestras necesidades
/*@EqualsAndHashCode(exclude = ) */ //Para evitar un StackOverFlowError regordo
@Data
public class Load {
        //Atributos de Load
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private int length;
    private int width;
    private int deep;

    private int weight;
    private Status status;
    private String state;
        private Boolean isDamaged;
    @OneToOne(
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    @JoinColumn(name = "pallet_id")
    private Pallet pallet;

        //Constructores de Load
    @PrePersist
    public void prePersistLoad(){
        if(this.isDamaged){
            this.state = "DAMAGED";
        } else {
            this.state = "FINE";
        }
    }

    //Asignadores de atributos de Load (setters)
    //Lectores de atributos de Load (getters)
    //Métodos de Load
    
}
