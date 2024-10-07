package org.springboot.jpa.riwi.pruebas.validation.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.springboot.jpa.riwi.pruebas.validation.supportClasses.ValidationClass;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Constraint(validatedBy = ValidationClass.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ValidationAnnotation {
    //Atributos de ValidationAnnotation
    //Constructores de ValidationAnnotation
    //Asignadores de atributos de ValidationAnnotation (setters)
    //Lectores de atributos de ValidationAnnotation (getters)
        //Métodos de ValidationAnnotation
    String message() default "Mensaje de validación por defecto";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
