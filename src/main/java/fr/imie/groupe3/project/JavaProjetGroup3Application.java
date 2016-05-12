package fr.imie.groupe3.project;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


/**
 * SpringBoot application main
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class JavaProjetGroup3Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
        return springApplicationBuilder.sources(JavaProjetGroup3Application.class);


    }
}
