package com.cf.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Activates Web MVC and its @Controller classes via RequestMappingHandlerMapping. Defines Spring beans for the
 * application context and triggers via @ComponentScan the search and the registration of Beans. Beans are detected
 * within @Configuration, @Component and @Controller annotated classes.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages ="com.cf.demo")
public class WebAppContextConfig {
    @Bean
    @Profile("cloud")
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        // make environment variables available for Spring's @Value annotation
        return new PropertySourcesPlaceholderConfigurer();
    }
}
