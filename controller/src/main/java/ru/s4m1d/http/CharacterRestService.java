package ru.s4m1d.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.s4m1d.JsonUtils;
import ru.s4m1d.db.services.CharacterDBService;
import ru.s4m1d.gurps.datamodel.CharacterDTO;

@RestController
@RequestMapping("/character")
public class CharacterRestService {
    @Autowired
    CharacterDBService characterDBService;

    @GetMapping("/get")
    public String getCharacter(@RequestParam Long id){
        String json = null;
        try {
            json = JsonUtils.getJsonFromObject(characterDBService.find(id));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}
