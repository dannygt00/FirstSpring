/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstSpring.demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author danielramirez
 */
public class DemoBean {
    
    private static Log Log = LogFactory.getLog(DemoBean.class);
 
    public DemoBean(){
        Log.info("Demo been created");
    }
}
