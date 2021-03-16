/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstSpring.demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
/**
 *
 * @author danielramirez
 */


public class SmtpMailSender implements MailSender {
    
private JavaMailSender javaMailSender; 

    private static Log Log = LogFactory.getLog(SmtpMailSender.class);

    @Override
    public void send(String to, String subject, String body){
        Log.info("Sending SMTP Mail to "+ to);
        Log.info("with subject: "+ subject);
        Log.info("and body: "+ body);

    }

}
