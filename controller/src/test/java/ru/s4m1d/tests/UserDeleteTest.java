package ru.s4m1d.tests;

import main.MyApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;
import ru.s4m1d.db.datamodel.entities.User;
import ru.s4m1d.db.services.UserService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
@Configuration
public class UserDeleteTest {
    @Autowired
    private UserService userService;
    @Test
    public void deleteLastAddedUserTest(){
        if(userService.size()>0) {
            List<User> users = userService.getAllAsList();
            Long biggestId = 0L;
            for(User user:users){
                if(user.getId()>biggestId){
                    biggestId = user.getId();
                }
            }
            userService.delete(biggestId);
        }
    }
}
