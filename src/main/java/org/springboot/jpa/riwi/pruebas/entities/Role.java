package org.springboot.jpa.riwi.pruebas.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springboot.jpa.riwi.pruebas.utils.roleUtils.RoleName;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roles")
@NoArgsConstructor(force = true)    //Para que sí o sí genere un constructor vacío
@AllArgsConstructor
    /*@RequiredArgsConstructor*/    //Sólo crea constructores con los atributos declarados como final, también lo agrupa el @Data
@Builder    //Para generar instancias de Customer según nuestras necesidades
/*@EqualsAndHashCode(exclude = ) */ //Para evitar un StackOverFlowError regordo
@Data
@Setter
public class Role {
        //Atributos de Role
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(unique = true)
    private RoleName name;
    @ManyToMany(mappedBy = "roles")
    private List<Carrier> carriers;

        //Constructores de Role
    @PrePersist
    public void prePersistCarrier(){
        if(this.carriers == null || this.carriers.isEmpty()){
            this.carriers = new ArrayList<>();
        }
    }
    //Asignadores de atributos de Role (setters)
    //Lectores de atributos de Role (getters)
    //Métodos de Role
}
