package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories("ru.s4m1d.db")
@ComponentScan(basePackages = {"ru.s4m1d"})
@EntityScan(basePackages = {"ru.s4m1d.db.datamodel.entities"})
@EnableJms
@EnableWebMvc
public class MyApplication {
    public static void main(String[] args){
        SpringApplication.run(MyApplication.class);
    }
}
