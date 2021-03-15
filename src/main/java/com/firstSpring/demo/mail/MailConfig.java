/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstSpring.demo.mail;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author danielramirez
 */
@Configuration
public class MailConfig {
    
    @Bean
    @ConditionalOnProperty(name ="spring.mail.host",
            havingValue="foo", matchIfMissing=true)
    public MailSender mockMailSender(){
        return new MockMailSender();
    }
    
    @Bean
    @ConditionalOnProperty("spring.mail.host")
     public MailSender smtpMailSender(){
        return new SmtpMailSender();
    }
}
