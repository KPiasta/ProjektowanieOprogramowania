package com.wroccer.init;

import com.wroccer.config.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;



public class AppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext)
            throws ServletException {

        final AnnotationConfigWebApplicationContext ctx =
                new AnnotationConfigWebApplicationContext();

        ctx.register(AppConfig.class);
        ctx.setServletContext(servletContext);

        final ServletRegistration.Dynamic servlet =
                servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));


        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}