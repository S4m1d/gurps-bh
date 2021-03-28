package ru.s4m1d.tests;

import main.MyApplication;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.spring5.context.SpringContextUtils;
import ru.s4m1d.db.datamodel.entities.User;
import ru.s4m1d.db.repositories.UserRepository;
import ru.s4m1d.db.services.UserService;

import javax.persistence.EntityExistsException;
import javax.persistence.PersistenceException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
@Configuration
public class UserCreationTest {
    @Autowired
    private UserService userService;
    @Test
    public void createUserTest() throws IOException {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String nikname = new String(array, Charset.forName("UTF-8"));
        userService.create(new User(nikname));
    }
}
