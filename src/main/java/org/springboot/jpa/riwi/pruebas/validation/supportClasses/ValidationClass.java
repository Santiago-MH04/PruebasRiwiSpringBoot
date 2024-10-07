package org.springboot.jpa.riwi.pruebas.validation.supportClasses;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springboot.jpa.riwi.pruebas.services.abstractions.EntityTemplateService;
import org.springboot.jpa.riwi.pruebas.validation.annotations.ValidationAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidationClass implements ConstraintValidator<ValidationAnnotation, String> {
        //Atributos de ValidationClass
    @Autowired
    private EntityTemplateService entityService;

    //Constructores de ValidationClass
    //Asignadores de atributos de ValidationClass (setters)
    //Lectores de atributos de ValidationClass (getters)
        //Métodos de ValidationClass
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
