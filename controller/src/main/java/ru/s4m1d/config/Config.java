package ru.s4m1d.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.s4m1d.db.services.UserService;
import ru.s4m1d.db.services.UserServiceImpl;

@Configuration
public class Config {
    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }
}
