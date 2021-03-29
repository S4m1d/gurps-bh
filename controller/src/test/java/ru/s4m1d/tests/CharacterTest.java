package ru.s4m1d.tests;

import main.MyApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;
import ru.s4m1d.db.datamodel.entities.Character;
import ru.s4m1d.db.services.CharacterDBService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
@Configuration
public class CharacterTest {
    @Autowired
    CharacterDBService characterDBService;

    //@Test
    public void creationTest(){
        Character character = Character.builder()
                .characterName("Arnold Swan")
                .iconName("")
                .imageName("archer-man.jpg")
                .strength(9)
                .dexterity(15)
                .iq(12)
                .health(9)
                .build();
        characterDBService.create(character);
    }
    //@Test
    public void deleteTest(){
        characterDBService.delete(1L);
    }
}
