package org.springboot.jpa.riwi.pruebas.security.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import java.io.IOException;

public class JWTValidationFilter extends BasicAuthenticationFilter {
    //Atributos de JWTValidationFilter
        //Constructores de JWTValidationFilter
    public JWTValidationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    //Asignadores de atributos de JWTValidationFilter (setters)
    //Lectores de atributos de JWTValidationFilter (getters)
        //Métodos de JWTValidationFilter
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

    }
}
