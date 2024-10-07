package org.springboot.jpa.riwi.pruebas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springboot.jpa.riwi.pruebas.utils.palletUtils.Location;
import org.springboot.jpa.riwi.pruebas.utils.palletUtils.State;

@Entity
@Table(name = "pallets")
@NoArgsConstructor(force = true)    //Para que sí o sí genere un constructor vacío
@AllArgsConstructor
    /*@RequiredArgsConstructor*/    //Sólo crea constructores con los atributos declarados como final, también lo agrupa el @Data
@Builder    //Para generar instancias de Customer según nuestras necesidades
    /*@EqualsAndHashCode(exclude = ) */ //Para evitar un StackOverFlowError regordo
@Data
public class Pallet {
        //Atributos de EntityTemplate -> Para dejar a conveniencia
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "maximum_capacity")
    private int maximumCapacity;
    private State state;
    private Location location;


    //Constructores de EntityTemplate
    //Asignadores de atributos de EntityTemplate (setters)
    //Lectores de atributos de EntityTemplate (getters)
    //Métodos de EntityTemplate
}
