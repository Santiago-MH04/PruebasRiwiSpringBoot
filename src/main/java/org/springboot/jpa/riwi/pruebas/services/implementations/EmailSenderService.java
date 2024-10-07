package org.springboot.jpa.riwi.pruebas.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
        //Atributos de EmailSenderService
    @Autowired
    private JavaMailSender mailSender;

    //Constructores de EmailSenderService
    //Asignadores de atributos de EmailSenderService (setters)
    //Lectores de atributos de EmailSenderService (getters)
        //Métodos de EmailSenderService
    public void sendEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("quesocolo@gmail.com"); //Cambiar este correo por la semilla correspondiente
            message.setTo(to);
            message.setSubject(subject);
            message.setText(body);
        this.mailSender.send(message);
        System.out.println("The email has been succesfully sent");
    }
}
