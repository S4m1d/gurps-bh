package ru.s4m1d.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.s4m1d.db.datamodel.entities.User;
import ru.s4m1d.db.repositories.UserRepository;
import ru.s4m1d.db.services.UserService;

import java.util.Scanner;

@Component
public class AppRunner implements CommandLineRunner {
    @Autowired
    private UserService userService;
    @Override
    public void run(String... args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        String nikname = scanner.next();
//        userService.create(new User(nikname));
    }
}
