package org.springboot.jpa.riwi.pruebas.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor(force = true)    //Para que sí o sí genere un constructor vacío
@AllArgsConstructor
/*@RequiredArgsConstructor*/    //Sólo crea constructores con los atributos declarados como final, también lo agrupa el @Data
@Builder    //Para generar instancias de Customer según nuestras necesidades
/*@EqualsAndHashCode(exclude = ) */ //Para evitar un StackOverFlowError regordo
@Data
public class User {
        //Atributos de User
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotBlank(message = "cannot be null, nor an empty nor a whitespace")
    @Size(
        min = 4,
        max = 20,
        message = "must have between 4 and 20 characters"
    )
    private String username;

    @NotBlank(message = "cannot be null, nor an empty nor a whitespace")
    @Size(
        min = 5,
        message = "must have, at least, 5 characters"
    )
    private String password;

    @NotBlank(message = "cannot be null, nor an empty nor a whitespace")
    private String email;

    @ManyToOne
    @JoinColumn(name = "carrier_id")
    @ToString.Exclude
    @NotNull(message = "must be the id of the chosen carrier")
    private Carrier carrier;

    @OneToMany(
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    @JoinTable(
        name = "users_loads",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "load_id"),
        uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "load_id"})
    )
    private List<Load> loads;

    @ManyToMany
    @JoinTable(
        name = "users_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"),
        uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "role_id"})
    )
    private List<Role> roles;

        //Constructores de User
    @PrePersist
    public void prePersistUser(){
        if(this.loads == null){
            this.loads = new ArrayList<>();
        }
        if(this.roles == null){
            this.roles = new ArrayList<>();
        }
    }

    //Asignadores de atributos de User (setters)
    //Lectores de atributos de User (getters)
    //Métodos de User
}
