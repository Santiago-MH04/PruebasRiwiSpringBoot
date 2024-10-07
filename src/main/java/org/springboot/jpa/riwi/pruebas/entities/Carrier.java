package org.springboot.jpa.riwi.pruebas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carriers")
@NoArgsConstructor(force = true)    //Para que sí o sí genere un constructor vacío
@AllArgsConstructor
    /*@RequiredArgsConstructor*/    //Sólo crea constructores con los atributos declarados como final, también lo agrupa el @Data
@Builder    //Para generar instancias de Customer según nuestras necesidades
/*@EqualsAndHashCode(exclude = ) */ //Para evitar un StackOverFlowError regordo
@Data
public class Carrier {
        //Atributos de Carrier
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String company;
    @OneToMany  //Configurar la relación luego
    private List<Load> loads;

        //Constructores de Carrier
    @PrePersist
    public void prePersistCarrier(){
        if(this.loads == null || this.loads.isEmpty()){
            this.loads = new ArrayList<>();
        }
    }

    //Asignadores de atributos de Carrier (setters)
    //Lectores de atributos de Carrier (getters)
    //Métodos de Carrier
}
