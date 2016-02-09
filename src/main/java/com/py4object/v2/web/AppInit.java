package com.py4object.v2.web;

import com.py4object.v2.modle.AppManager;
import com.py4object.v2.modle.URLManager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by kozo on 2/9/16.
 */
public class AppInit implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        URLManager url=new URLManager();
        servletContextEvent.getServletContext().setAttribute(AppManager.URLMANAGER,url);

    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
