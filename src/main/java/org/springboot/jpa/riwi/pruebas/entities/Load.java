package org.springboot.jpa.riwi.pruebas.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
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

    private int height;
    private int length;
    private int width;

    private int weight;
    private Status status;
    private String state;
        private Boolean isDamaged;

    @OneToOne(
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    @JoinColumn(name = "pallet_id")
    @NotNull(message = "must be the id of the correspondent pallet")
    private Pallet pallet;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    @NotNull(message = "must be a proper user id")
    private User user;

    @ManyToOne
    /*@JoinColumn(name = "carrier_id")*/
    @ToString.Exclude
    @NotNull(message = "must be the id of the chosen carrier")
    private Carrier carrier;

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
