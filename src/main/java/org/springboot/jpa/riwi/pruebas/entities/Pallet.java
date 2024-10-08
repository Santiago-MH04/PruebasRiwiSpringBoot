package org.springboot.jpa.riwi.pruebas.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
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
    @NotNull(message = "must contain the pallet maximum capacity, in kg")
    private int maximumCapacity;

    @NotNull(message = "must tell the user the pallet's state")
    private State state;

    @NotNull(message = "must tell the user the pallet's location at the warehouse")
    private Location location;

    @OneToOne(mappedBy = "pallet")
    @JoinColumn(name = "load_id")
    @ToString.Exclude
    private Load load;  //Si al ingresar la estiba, no tiene un load_id asignado, es que está libre para usar o dañada

    //Constructores de EntityTemplate
    //Asignadores de atributos de EntityTemplate (setters)
    //Lectores de atributos de EntityTemplate (getters)
    //Métodos de EntityTemplate
}
