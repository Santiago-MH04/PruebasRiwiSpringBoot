package org.springboot.jpa.riwi.pruebas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springboot.jpa.riwi.pruebas.utils.loadUtils.Status;

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
    @OneToOne
    private Pallet pallet;  //Configurar bidireccionalidad luego, de ser necesario

    //Constructores de Load
    //Asignadores de atributos de Load (setters)
    //Lectores de atributos de Load (getters)
    //Métodos de Load
    
}
