package org.spring.smarthome.web.controller;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;

public class CustomContextLoaderListener extends ContextLoaderListener{
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("\n Spring-MVC aplication desotryed\n");
		super.contextDestroyed(event);
	}
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("\nSpring MVC application Inited!!!\n");
		super.contextInitialized(event);
	}
	
}
