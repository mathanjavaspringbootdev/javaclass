package com.ref.management.REFManager;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;

import com.ref.management.security.SecSecurityConfig;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("SpringApplicationBuilder is Initializing");
		return application.sources(RefManagerApplication.class);
	}

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		System.out.println("SpringApplicationBuilder is onStartup");
//		AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
//		root.register(SecSecurityConfig.class);
//
//		sc.addListener(new ContextLoaderListener(root));

	}

}
