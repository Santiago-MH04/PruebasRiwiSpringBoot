package org.springboot.jpa.riwi.pruebas.security;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class SimpleGrantedAuthorityJSONCreator {
    //Atributos de SimpleGrantedAuthorityJSONCreator
        //Constructores de SimpleGrantedAuthorityJSONCreator
    @JsonCreator
    public SimpleGrantedAuthorityJSONCreator(@JsonProperty("authority") String role) { //Hay que decirle que ese role es el authority del constructor de la clase madre SimpleGrantedAuthority

    }

    //Asignadores de atributos de SimpleGrantedAuthorityJSONCreator (setters)
    //Lectores de atributos de SimpleGrantedAuthorityJSONCreator (getters)
    //Métodos de SimpleGrantedAuthorityJSONCreator
}
