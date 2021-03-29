package ru.s4m1d.db.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.s4m1d.db.datamodel.entities.Character;
import ru.s4m1d.db.repositories.CharacterRepository;

import java.util.List;

@Service
public class CharacterDBServiceImpl implements CharacterDBService{
    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public Character create(Character character) {
        return characterRepository.save(character);
    }

    @Override
    public void delete(Long id) {
        characterRepository.deleteById(id);
    }

    @Override
    public Character find(Long id) {
        return characterRepository.getOne(id);
    }

    @Override
    public List<Character> getAllAsList() {
        return characterRepository.findAll();
    }

    @Override
    public Long size() {
        return getAllAsList().stream().count();
    }
}
