/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstSpring.demo.controllers;

import com.firstSpring.demo.mail.MailSender;
import com.firstSpring.demo.mail.MockMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author danielramirez
 */
@RestController
public class MailController {
    
    
    private MailSender mailSender; 
    
    @Autowired
    public void MailController(MailSender smtp) {
        this.mailSender = smtp;
    }
    
    
    
    
     @RequestMapping("/mail")
    public String mail(){
        
        mailSender.send("mail@example.com","test mail", "test body");
        
        return "Mail Sent!";
    }
}
