/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstSpring.demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author danielramirez
 */
@Component
public class MockMailSender implements MailSender {

    private static Log Log = LogFactory.getLog(MockMailSender.class);

    @Override
    public void send(String to, String subject, String body) {
        Log.info("Sending Mock Mail to" + to);
        Log.info("with subject" + subject);
        Log.info("and body" + body);

    }

}
